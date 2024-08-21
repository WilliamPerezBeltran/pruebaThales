import React, { useState } from "react";
import axios from "axios";
import {
  Button,
  TextField,
  Table,
  TableBody,
  TableCell,
  TableHead,
  TableRow,
  CircularProgress,
} from "@mui/material";
import "../styles/EmployeeView.scss";

interface Employee {
  id: number;
  employee_name: string;
  employee_salary: string;
  annualSalary?: number; 
}

const EmployeeView: React.FC = () => {
  const [employeeId, setEmployeeId] = useState<string>("");
  const [employees, setEmployees] = useState<Employee[]>([]);
  const [loading, setLoading] = useState<boolean>(false);
  const [error, setError] = useState<string | null>(null);
  const [isSingleEmployee, setIsSingleEmployee] = useState<boolean>(false);

  const fetchEmployees = async (id?: number) => {
    setLoading(true);
    setError(null);
    setIsSingleEmployee(!!id); 
    try {
      const url = id
        ? `http://localhost:8080/api/employees/${id}`
        : "http://localhost:8080/api/employees";
      const response = await axios.get<Employee[]>(url);
      setEmployees(
        Array.isArray(response.data) ? response.data : [response.data],
      );
    } catch (err) {
      setError("Error fetching data.");
    } finally {
      setLoading(false);
    }
  };

  const handleSearch = () => {
    const id = employeeId ? parseInt(employeeId) : undefined;
    fetchEmployees(id);
  };

  return (
    <div className="employee-view">
      <TextField
        label="Employee ID"
        variant="outlined"
        value={employeeId}
        onChange={(e) => setEmployeeId(e.target.value)}
      />
      <Button variant="contained" color="primary" onClick={handleSearch}>
        Search
      </Button>

      {loading && <CircularProgress />}
      {error && <p className="error-message">{error}</p>}

      {!loading && !error && (
        <Table>
          <TableHead>
            <TableRow>
              <TableCell>ID</TableCell>
              <TableCell>Name</TableCell>
              <TableCell>Salary</TableCell>
              {isSingleEmployee && <TableCell>Annual Salary</TableCell>}
            </TableRow>
          </TableHead>
          <TableBody>
            {employees.map((employee) => (
              <TableRow key={employee.id}>
                <TableCell>{employee.id}</TableCell>
                <TableCell>{employee.employee_name}</TableCell>
                <TableCell>{employee.employee_salary}</TableCell>
                {isSingleEmployee && employee.annualSalary !== undefined && (
                  <TableCell>{employee.annualSalary}</TableCell> 
                )}
              </TableRow>
            ))}
          </TableBody>
        </Table>
      )}
    </div>
  );
};

export default EmployeeView;
