package com.tabash.auction.service;

import com.tabash.auction.model.HealthStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.jdbc.core.JdbcTemplate;
import org.redisson.api.RedissonClient;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class HealthCheckService {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Autowired
    private MongoTemplate mongoTemplate;

    @Autowired
    private RedissonClient redissonClient;

    public List<HealthStatus> performHealthCheck() {
        List<HealthStatus> healthStatuses = new ArrayList<>();

        // Check PostgreSQL
        try {
            jdbcTemplate.execute("SELECT 1");
            healthStatuses.add(new HealthStatus("PostgreSQL", "UP", "Database is reachable"));
        } catch (Exception e) {
            healthStatuses.add(new HealthStatus("PostgreSQL", "DOWN", e.getMessage()));
        }

        // Check MongoDB
        try {
            mongoTemplate.executeCommand("{ ping: 1 }");
            healthStatuses.add(new HealthStatus("MongoDB", "UP", "MongoDB is reachable"));
        } catch (Exception e) {
            healthStatuses.add(new HealthStatus("MongoDB", "DOWN", e.getMessage()));
        }

        // Check Redis
        try {
            redissonClient.getKeys().count();
            healthStatuses.add(new HealthStatus("Redis", "UP", "Redis is reachable"));
        } catch (Exception e) {
            healthStatuses.add(new HealthStatus("Redis", "DOWN", e.getMessage()));
        }

        return healthStatuses;
    }
}
