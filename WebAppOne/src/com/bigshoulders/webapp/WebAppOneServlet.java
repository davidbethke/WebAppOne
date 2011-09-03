package com.bigshoulders.webapp;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


import javax.servlet.http.*;

@SuppressWarnings("serial")
public class WebAppOneServlet extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws IOException {
		PMaker pMaker=new PMaker();
		Employee dave= new Employee("Dave",1);
		Employee nobody=new Employee("Nobody",0);
		List<Employee> employees= new ArrayList<Employee>();
		employees.add(dave);
		employees.add(nobody);
		Manager manager= new Manager(nobody, employees);
		resp.setContentType("text/plain");
		resp.getWriter().println("Hello, world,Dave");
		resp.getWriter().println("Employee Name:"+dave.getName());
		resp.getWriter().println("Employee id:"+dave.getId());
		pMaker.setP(manager.getEmployee(0).getName());
		// manager
		resp.getWriter().println("Employee id 0:"+pMaker.makeP());
		
		
	}
}
