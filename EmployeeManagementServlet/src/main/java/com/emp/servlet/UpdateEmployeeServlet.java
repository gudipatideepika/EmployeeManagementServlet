package com.emp.servlet;

import java.io.IOException;

import com.emp.dao.EmployeeDAO;
import com.emp.model.Employee;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/UpdateEmployeeServlet")
public class UpdateEmployeeServlet extends HttpServlet {

    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request,
            HttpServletResponse response)
            throws ServletException, IOException {

        try {

            int id = Integer.parseInt(request.getParameter("empid"));
            String name = request.getParameter("empname");
            String department = request.getParameter("department");
            double salary = Double.parseDouble(request.getParameter("salary"));

            Employee emp = new Employee(id, name, department, salary);

            EmployeeDAO dao = new EmployeeDAO();

            boolean status = dao.updateEmployee(emp);

            if (status) {

                response.sendRedirect("ViewEmployeeServlet");

            } else {

                response.getWriter().println("<h2>Employee Not Updated!</h2>");
                response.getWriter().println("<a href='updateemployee.html'>Try Again</a>");

            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}