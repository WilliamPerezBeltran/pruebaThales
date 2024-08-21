import React from 'react';
import { render, screen, fireEvent, waitFor } from '@testing-library/react';
import axios from 'axios';
import MockAdapter from 'axios-mock-adapter';
import EmployeeView from './EmployeeView'; 

describe("EmployeeView Component", () => {
  let mock: MockAdapter;

  beforeEach(() => {
    mock = new MockAdapter(axios);
  });

  afterEach(() => {
    mock.reset();
  });

  it("fetches and displays employees", async () => {
    mock.onGet("http://localhost:8080/api/employees").reply(200, [
      { id: 1, employee_name: 'William Perez', employee_salary: '320800' },
      { id: 2, employee_name: 'Catalina Castillo', employee_salary: '3849600' },
    ]);

    render(<EmployeeView />);

    fireEvent.click(screen.getByText('Search'));

    await waitFor(() => {
      expect(screen.getByText('William Perez')).toBeInTheDocument();
      expect(screen.getByText('Catalina Castillo')).toBeInTheDocument();
    });
  });

  it("shows error message when fetching fails", async () => {
    mock.onGet("http://localhost:8080/api/employees").reply(500);

    render(<EmployeeView />);

    fireEvent.click(screen.getByText('Search'));

    await waitFor(() => {
      expect(screen.getByText('Error fetching data.')).toBeInTheDocument();
    });
  });

  it("fetches and displays a single employee", async () => {
    mock.onGet("http://localhost:8080/api/employees/1").reply(200, {
      id: 1,
      employee_name: 'William Perez',
      employee_salary: '320800',
      annualSalary: 3849600,
    });

    render(<EmployeeView />);

    fireEvent.change(screen.getByLabelText('Employee ID'), { target: { value: '1' } });
    fireEvent.click(screen.getByText('Search'));

    await waitFor(() => {
      expect(screen.getByText('William Perez')).toBeInTheDocument();
      expect(screen.getByText('320800')).toBeInTheDocument();
      expect(screen.getByText('3849600')).toBeInTheDocument();
    });
  });
});
