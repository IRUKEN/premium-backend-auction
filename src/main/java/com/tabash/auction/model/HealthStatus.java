package com.tabash.auction.model;

import lombok.Data;

@Data
public class HealthStatus {
    public String getDetails() {
        return details;
    }

    private final String component;
    private final String status;
    private final String details;

    public HealthStatus(String component, String status, String details) {
        this.component = component;
        this.status = status;
        this.details = details;
    }

    public String getComponent() {
        return component;
    }

    public String getStatus() {
        return status;
    }
}
