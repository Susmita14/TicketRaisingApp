# 🌻 Ticket Raising App

A web-based application that allows authenticated users to raise, track, and manage support tickets in an organization. Built using Spring Boot and secured with custom login authentication.

---

## ✨ Features

* 🔐 User authentication with Spring Security
* 🧑‍💻 Custom login page using Thymeleaf
* 👨‍📋 Ticket dashboard (future scope)
* 📄 MySQL integration for persistent data storage
* 📦 Maven project structure
* 🔧 Modular and clean code structure (MVC)

---

## 🛠️ Tech Stack

* **Backend**: Spring Boot (v3.5.0)
* **Frontend**: Thymeleaf, HTML5, CSS3, Bootstrap
* **Database**: MySQL 8.1
* **Build Tool**: Maven
* **Version Control**: Git & GitHub

---

## 🚀 Getting Started

### 1⃣ Clone the Repository

```bash
git clone https://github.com/Susmita14/TicketRaisingApp.git
cd TicketRaisingApp
```

### 2⃣ Set Up MySQL Database

* Import the schema using:

```bash
mysql -u root -p < ticket_/setup.sql
```

* Or create it manually:

```sql
CREATE DATABASE ticketapp;
```

> Make sure to update the credentials in `application.properties`.

### 3⃣ Update `application.properties`

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/ticketapp
spring.datasource.username=root
spring.datasource.password=your_password

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
```

### 4⃣ Run the App

```bash
mvn spring-boot:run
```

> Access it at: `http://localhost:8080`

---

## 🔐 Default Credentials

```txt
Username: admin
Password: admin123
```

> These are stored in memory (`InMemoryUserDetailsManager`) for demo purposes only.

---

## 🧾 Folder Structure

```
ticket_/
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── com.example/
│   │   │       ├── controller/           # Homecontroller.java
│   │   │       ├── config/               # Spring Security config
│   │   │       └── ticket_/              # Main application file
│   │   └── resources/
│   │       ├── templates/                # Thymeleaf HTML files
│   │       └── application.properties    # DB and Spring config
├── setup.sql                             # DB schema (optional)
├── pom.xml
└── README.md
```

---

## 🤝 Contributing

1. Clone the repo
2. Create your feature branch (`git checkout -b feature/new-feature`)
3. Commit your changes (`git commit -m 'Add some feature'`)
4. Push to the branch (`git push origin feature/new-feature`)
5. Open a Pull Request

> Make sure your code follows the structure and naming conventions.

---

## 👥 Team Members

* 👩‍💻 [Susmita](https://github.com/Susmita14)
* 👨‍💻 Pranav Shinde
* 👩‍💻 Aditi Sudhir Ghate ([adiana3308](https://github.com/adiana3308))

---

## 📌 License

This project is licensed under the [MIT License](LICENSE).

---

> Made with ❤️ by the TicketRaisingApp Team
