# Proyecto TestThale

## Descripción backend 

El backend en Spring Boot gestiona empleados mediante una API que permite listar todos los empleados y obtener detalles específicos de un empleado por ID, incluyendo el cálculo del salario anual si está disponible.

## Stack

- openjdk 17.0.12 2024-07-16
- Java 17
- Gradle 8.8

### Clone repo

```bash
# Clone repo
$ git git@github.com:WilliamPerezBeltran/pruebaThales.git

# Go to app directory
$ cd pruebaThales

# Go to backend folder
$ cd backend

```
### Run app

```bash
# install dependencies 
$ ./gradlew build

# Run app
$ ./gradlew bootRun
```

### Run test

```bash
# run test
$ ./gradlew test
```

### Run app widnow 
```bash
$ gradlew.bat bootRun
```

## Estructura del Proyecto

```bash
├── build.gradle
├── gradlew
├── gradlew.bat
├── HELP.md
├── README.md
├── settings.gradle
└── src
    ├── main
    │   ├── java
    │   │   └── com
    │   │       └── api
    │   │           └── testThale
    │   │               ├── config
    │   │               │   ├── AppConfig.java
    │   │               │   └── WebConfig.java
    │   │               ├── controller
    │   │               │   └── EmployeeController.java
    │   │               ├── model
    │   │               │   ├── Employee.java
    │   │               │   ├── EmployeeListResponse.java
    │   │               │   └── EmployeeResponse.java
    │   │               ├── service
    │   │               │   ├── EmployeeService.java
    │   │               │   └── SalaryService.java
    │   │               └── TestThaleApplication.java
    │   └── resources
    │       ├── application.properties
    │       ├── static
    │       └── templates
    └── test
        └── java
            └── com
                └── api
                    └── testThale
                        ├── service
                        │   ├── EmployeeServiceTest.java
                        │   └── SalaryServiceTest.java
                        └── TestThaleApplicationTests.java

```

### Backend (Spring Boot)

- **build.gradle**: Configuración de Gradle.
- **src/main/java/com/api/testThale**:
  - **config**:
    - `AppConfig.java`: Configuración de beans de Spring.
    - `WebConfig.java`: Configuración de web (si es necesario).
  - **controller**:
    - `EmployeeController.java`: Controlador que maneja las solicitudes HTTP para empleados.
  - **model**:
    - `Employee.java`: Modelo de datos para los empleados.
    - `EmployeeListResponse.java`: Respuesta para la lista de empleados.
    - `EmployeeResponse.java`: Respuesta para los detalles de un empleado.
  - **service**:
    - `EmployeeService.java`: Servicio para consumir las APIs externas de empleados.
    - `SalaryService.java`: Servicio para calcular el salario anual.
  - `TestThaleApplication.java`: Clase principal para ejecutar la aplicación Spring Boot.
- **src/main/resources**:
  - `application.properties`: Configuración de la aplicación Spring Boot.
- **src/test/java/com/api/testThale**:
  - **service**:
    - `EmployeeServiceTest.java`: Pruebas unitarias para `EmployeeService`.
    - `SalaryServiceTest.java`: Pruebas unitarias para `SalaryService`.
  - `TestThaleApplicationTests.java`: Pruebas de integración para la aplicación.

