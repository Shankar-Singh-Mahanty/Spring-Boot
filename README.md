# Spring Boot Applications Repository

This repository contains two distinct Spring Boot applications:

1. **Stamp Collection Application**: Manages a collection of stamps and other related functionalities.
2. **Student Details Application**: Prints student details to verify and check Spring functionalities.

## Table of Contents

- [Description](#description)
- [Repository Structure](#repository-structure)
- [Applications Overview](#applications-overview)
  - [Stamp Collection](#stamp-collection)
  - [Student Details](#student-details)
- [Getting Started](#getting-started)
  - [Prerequisites](#prerequisites)
  - [Running the Applications](#running-the-applications)
- [Contributions](#contributions)
- [License](#license)

## Description

This repository provides two Spring Boot applications demonstrating different aspects of Spring:

- **Stamp Collection Application**: Manages a collection of stamps with CRUD operations.
- **Student Details Application**: Prints student details, verifying basic Spring functionalities.

## Repository Structure

```
.
├── stamp-collection
│   ├── src
│   │   ├── main
│   │   │   ├── java
│   │   │   └── resources
│   │   └── test
│   │       ├── java
│   │       └── resources
│   └── pom.xml
└── student-details
    ├── src
    │   ├── main
    │   │   ├── java
    │   │   └── resources
    │   └── test
    │       ├── java
    │       └── resources
    └── pom.xml
```

## Applications Overview

### Stamp Collection

The **Stamp Collection** application allows users to manage their stamp collections with the following features:

- Adding new stamps
- Updating existing stamps
- Deleting stamps
- Viewing the list of all stamps

**Technologies used:**
- Spring Boot
- Spring Data JPA
- H2 Database
- Thymeleaf

### Student Details

The **Student Details** application is a simple Spring Boot application that prints student details, verifying and checking basic Spring functionalities.

**Technologies used:**
- Spring Boot

## Getting Started

### Prerequisites

- JDK 11 or higher
- Maven

### Running the Applications

1. **Clone the repository:**

```bash
git clone https://github.com/your-repo-url.git
cd your-repo-url
```

2. **Build the projects:**

```bash
cd stamp-collection
mvn clean install

cd ../student-details
mvn clean install
```

3. **Run the applications:**

For Stamp Collection:

```bash
cd stamp-collection
mvn spring-boot:run
```

For Student Details:

```bash
cd student-details
mvn spring-boot:run
```

4. **Access the applications:**

- **Stamp Collection**: `http://localhost:8080`
- **Student Details**: Check the console output for printed student details.

## Contributions

Feel free to fork this repository and contribute by submitting pull requests. For major changes, please open an issue first to discuss what you would like to change.

## License

This repository is licensed under the MIT License. See the LICENSE file for more details.

---

By following this guide, you should be able to quickly set up and run both applications, exploring the functionalities provided by Spring Boot.
