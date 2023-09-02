# Spring MVC Backend Application 

## Table of Contents

- [Introduction](#introduction)
- [Prerequisites](#prerequisites)
- [Endpoints](#endpoints)
- [Database Setup](#database-setup)

## Introduction

This is a Spring MVC backend application that serves as a template for building web applications using the Model-View-Controller (MVC) architectural pattern. It provides a basic foundation for creating RESTful web services, handling HTTP requests, and interacting with a PostgreSQL database.

## Prerequisites

Before you begin, ensure you have met the following requirements:

- Java Development Kit (JDK) 8 or higher installed.
- Apache Maven 
- An Integrated Development Environment (IDE) of your choice (e.g., IntelliJ IDEA, Eclipse).
- PostgreSQL
-Docker 

## Endpoints

The application exposes various RESTful endpoints for handling different functionalities. Here are some example endpoints:

GET /api/customers: Retrieve a list of employees.
GET /api/customers/{id}: Retrieve a specific employee by ID.
POST /api/customers: Create a new employee.
DELETE /api/customers/{id}: Delete an employee by ID.

## Database Setup

Using Docker
To set up a PostgreSQL database using Docker for this project, follow these steps:

Ensure you have Docker installed on your system.

docker-compose -f docker-compose.yml up
Replace your_password and your_database with your desired PostgreSQL password and database name.
The PostgreSQL database will be available on port 5432, and you can update the application.properties file in your project with the PostgreSQL connection details.
