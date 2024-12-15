# Premium Auction Backend

Welcome to the backend for a **premium auction platform**, built with a focus on **scalability**, **security**, and **performance**. This project is designed to support real-time bidding, user role management, and secure transactions in an online auction environment.

## 🚀 Tech Stack

- **Java + Spring Boot**: Framework for building scalable backend services.
- **PostgreSQL**: Relational database for transactional data, integrated with Prisma ORM.
- **MongoDB**: NoSQL database for logging historical data and events.
- **Redis**: In-memory database used as a cache and for real-time notifications.
- **Keycloak**: Centralized authentication and role-based access control.
- **Spring Security**: JWT-based authentication and fine-grained access control.

## 🌟 Features

### 🔑 User Management
- Secure sign-up, login, and role-based access (**Admin**, **Premium User**, **Regular User**).
- Management of premium memberships and subscriptions.

### 🛒 Auction System
- Create, update, and delete auctions (Admin and Premium Users only).
- Participate in auctions with real-time bidding support.

### 🔐 Security
- **JWT** for session management.
- **Keycloak** integration for authentication and role-based permissions.
- **HTTPS** for secure communication.
- **Encrypted storage** for sensitive data (e.g., hashed passwords).

### 📢 Notifications
- Real-time updates for auction events using **Redis** and WebSockets.

### 📜 Transaction History
- A detailed log of all bids and completed auctions.
- Export data to formats like CSV or PDF.

## 📂 Project Structure

```plaintext
src/
├── config/           # Configurations for DB, Security, Redis, Keycloak, etc.
├── controller/       # REST controllers for handling HTTP requests.
├── model/            # Data models for Users, Auctions, Bids, etc.
├── repository/       # Repositories for PostgreSQL, MongoDB, and Redis.
├── service/          # Core business logic and auction management.
├── util/             # Utility classes (e.g., JWT helpers, enums).
