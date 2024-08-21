# Java Software Engineer - Developer Test

## Setup Instructions


## Table of Contents
1. [Setup Instructions](#Setup-Instructions)
2. [Baseline Requirements](#baseline-requirements)
3. [Application Requirements](#application-requirements)
4. [Setup Instructions](#setup-instructions)
5. [Usage](#usage)
6. [Testing](#testing)
7. [License](#license)


## Setup Instructions

Please refer to the respective directories for detailed instructions on how to set up and run each part of the application:

- **For the Backend**: Navigate to the backend directory for setup and execution instructions.
- **For the Frontend**: Navigate to the frontend directory for setup and execution instructions.

## Baseline Requirements

- **Design Practices**: The application is designed using good object-oriented design practices including **Inheritance**, **Abstraction**, and **Encapsulation**. **SOLID** principles are applied to ensure maintainability and flexibility.
- **IDE**: Developed using an open-source Java IDE such as IntelliJ IDEA Community, NetBeans IDE, or Eclipse IDE.
- **Version Control**: The solution is published in a public DVCS repository (e.g., GitHub).
- **Configuration Management**: The solution is fully downloadable, compile-able, and executable with clear instructions provided for setup and execution.

## Application Requirements

### Overview

- **Type**: MVC Application
- **Framework**: Spring Boot (recommended for simplicity)
- **Packaging**: Delivered as a WAR file
- **Deployment**: Deployable on Wildfly Server or Spring Boot auto-container
- **JDK**: Requires JDK 1.8+

### Features

1. **Data Access Layer**: Consumes the following REST APIs:
   - `http://dummy.restapiexample.com/api/v1/employees`
   - `http://dummy.restapiexample.com/api/v1/employee/1`

2. **Business Logic**: Implements a Business class to compute:
   - `employee_anual_salary = employee_salary x 12`

3. **Controller Class**: Provides methods to:
   - Return the list of employees.
   - Return employee data by ID.

4. **User Interface**:
   - **Text Box**: For user input of employee ID.
   - **Search Button**: Executes employee search.
   - **Search Logic**: If the text box is empty, return the complete employee list. If it contains a valid ID, return information for that specific employee.
   - **Display**: Shows the employee list in a table or grid, including the annual salary computation.
   - **Design**: Utilizes Bootstrap or Material Design. Contains a menu and brand image.

5. **Front-end Technologies**:
   - **Choice**: ReactJS and Material Design (with TypeScript and Sass)

6. **Unitary Tests**:
   - Includes unit tests for at least one business layer method using JUnit5.

   ## Testing

- **Java Spring Boot**: Developed with JUnit5.
- **React**: Developed with Jest, React Testing Library (RTL), axios-mock-adapter, babel-jest, and Jest DOM.

### Clone repo

```bash
# Clone repo
$ git clone git@github.com:WilliamPerezBeltran/pruebaThales.git

# Go to app directory
$ cd pruebaThales

read instructions

```