# Premium Auction Backend

Welcome to the backend for a **premium auction platform**, built with a focus on **scalability**, **security**, and **performance**. This project is designed to support real-time bidding, user role management, and secure transactions in an online auction environment.

## 🛠️ Recent Updates
### Why the Changes?
Due to security vulnerabilities detected in some of the previously used libraries, such as **Keycloak** and **Lettuce (Redis)**, this project has opted to:
- Replace **Keycloak** with **Authentik**, a lightweight and open-source identity provider.
- Replace **Lettuce** with **Redisson**, a more robust and secure library for interacting with Redis.

These updates ensure a **more secure and stable foundation** for handling authentication, authorization, and caching in this application.

---

## 🚀 Tech Stack

- **Java + Spring Boot**: Framework for building scalable backend services.
- **PostgreSQL**: Relational database for transactional data.
- **Authentik**: Lightweight and secure identity provider for OAuth2 and OpenID Connect.
- **Redis + Redisson**: In-memory database for caching and real-time notifications.
- **Spring Security**: Fine-grained access control with JWT authentication.
- **Docker**: Containerized deployment for all services.

---

## 🌟 Features

### 🔑 User Management
- Secure sign-up, login, and role-based access (**Admin**, **Premium User**, **Regular User**).
- Management of premium memberships and subscriptions.

### 🛒 Auction System
- Create, update, and delete auctions (Admin and Premium Users only).
- Participate in auctions with real-time bidding support.

### 🔐 Security
- **JWT** for session management.
- **Authentik** for centralized authentication and OAuth2 integration.
- **HTTPS** for secure communication.
- **Encrypted storage** for sensitive data (e.g., hashed passwords).

### 📢 Notifications
- Real-time updates for auction events using **Redis** and **Redisson**.

### 📜 Transaction History
- A detailed log of all bids and completed auctions.
- Export data to formats like CSV or PDF.

---

## 📂 Project Structure

```plaintext
src/
├── config/           # Configurations for DB, Security, Redis, Authentik, etc.
├── controller/       # REST controllers for handling HTTP requests.
├── model/            # Data models for Users, Auctions, Bids, etc.
├── repository/       # Repositories for PostgreSQL and Redis.
├── service/          # Core business logic and auction management.
├── util/             # Utility classes (e.g., JWT helpers, enums).
