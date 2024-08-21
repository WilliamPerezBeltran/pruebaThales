# Frontend - TestThale

## Description

The frontend of the TestThale project is built using React with TypeScript and Sass with Material Design. It provides a user interface for interacting with the backend API, allowing users to view and search employee information.

## Stack

- **React**: A JavaScript library for building user interfaces.
- **TypeScript**: A superset of JavaScript that adds static types.
- **Sass**: A CSS preprocessor for writing more maintainable and extensible styles.
- **Material Design**:  is Google's design system for creating visually appealing and consistent user interfaces.
- **react**:^18.3.1
- **node**:v18.6.0
- **sass**:v1.77.8
- **typescript**:4.9.5
- **emotion**:11.13.0

## Getting Started

### Clone the Repository

```bash
# Clone the repository
$ git clone git@github.com:WilliamPerezBeltran/pruebaThales.git

# Go to the project directory
$ cd pruebaThales

# Go to the frontend folder
$ cd frontend
```
### Run app

```bash
# install dependencies 
$ npm install

# Run app
$ npm start
```

### Run test

```bash
# run test
$ npm test or npm run test 
```

## Project Structure

```bash
├── babel.config.js
├── jest.config.js
├── package.json
├── package-lock.json
├── public
│   ├── index.html
│   ├── manifest.json
│   └── robots.txt
├── README.md
├── src
│   ├── App.scss
│   ├── App.tsx
│   ├── components
│   │   ├── EmployeeView.test.tsx
│   │   └── EmployeeView.tsx
│   ├── index.css
│   ├── index.tsx
│   ├── logo.svg
│   ├── react-app-env.d.ts
│   ├── reportWebVitals.ts
│   ├── setupTests.ts
│   └── styles
│       └── EmployeeView.scss
└── tsconfig.json


```

### Frontend (React con TypeScript y Sass)

- **src/assets/styles**:
  - `main.scss`: Archivo principal de estilos SCSS.
- **src/components**:
  - `EmployeeList.tsx`: Componente para listar empleados.
  - `EmployeeDetail.tsx`: Componente para mostrar detalles de un empleado.
- **public/index.html**: Archivo HTML principal.


## API Documentation

### Base URL

The base URL for interface: `http://localhost:3000/`


#### Testing images
![Logo](public/images/image1.png)
![Logo](public/images/image2.png)
![Logo](public/images/image3.png)

