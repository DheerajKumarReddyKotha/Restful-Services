/**
 * 
 */
package com.asura.webservices.rest.resources;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.asura.webservices.rest.models.Employee;

/**
 * @author dheeraj.kotha<dheerajkumarreddykotha@gmail.com>
 *
 */
@Path("/employees")
public class EmployeeResource {
	
	private List<Employee> employeelist = new ArrayList<>(Arrays.asList(new Employee("Dheeraj","Kotha"),
			new Employee("Neelima","Kotha")));


	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Employee> getResource(){
		
		return employeelist;
	}
	
	@POST
	@Consumes(MediaType.APPLICATION_XML)
	public List<Employee> postResource(Employee employee){
		
			employeelist.add(employee);

		return employeelist;
	}
	
	@PUT
	@Path("/{firstName}")
	@Consumes(MediaType.APPLICATION_XML)
	@Produces(MediaType.APPLICATION_JSON)
	public List<Employee> putResource(@PathParam("firstName") String firstName, Employee employee){
		
			for(Employee e: employeelist){
				if(e.getFirstName().equals(firstName)){
					e.setFirstName(employee.getFirstName());
					e.setLastName(employee.getLastName());
				}
			}

		return employeelist;
	}
	
	@DELETE
	@Path("/{firstName}")
	@Produces(MediaType.APPLICATION_JSON)
	public List<Employee> deleteResource(@PathParam("firstName") String firstName){
		for(Employee e: employeelist){
			if(e.getFirstName().equals(firstName)){
				employeelist.remove(e);
			}
		}


		return employeelist;
	}
}
