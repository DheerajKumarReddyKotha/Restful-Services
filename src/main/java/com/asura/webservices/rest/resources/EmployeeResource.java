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
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;
import javax.ws.rs.core.UriInfo;

import com.asura.webservices.rest.exceptions.DataNotFoundException;
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
	@Path("status")
	@Produces(MediaType.TEXT_PLAIN)
	public Response getStatus(){

		return Response.status(Status.OK).build();
	}

	@GET
	@Path("uriinfo")
	@Produces(MediaType.APPLICATION_JSON)
	public String getUrlInfo(@Context UriInfo uriinfo,
			@Context HttpHeaders headers){
		String path = uriinfo.getAbsolutePath().toString();
		String httpheaders = headers.getCookies().toString();
		return path+"/"+httpheaders;
	}
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Employee getResource(@QueryParam("firstname") String firstName){
		while(true){
		for(Employee e: employeelist){
			if(e.getFirstName().equals(firstName)){
				return e;
			}else{
				throw new DataNotFoundException("Employee with firstname: "+firstName+" not found");
			}
		}
		}
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
		while(true){
			for(Employee e: employeelist){
				if(e.getFirstName().equals(firstName)){
					e.setFirstName(employee.getFirstName());
					e.setLastName(employee.getLastName());
					return employeelist;
				}
			}
		}
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
