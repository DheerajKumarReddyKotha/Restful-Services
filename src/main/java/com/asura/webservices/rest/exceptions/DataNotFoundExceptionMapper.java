/**
 * 
 */
package com.asura.webservices.rest.exceptions;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

import com.asura.webservices.rest.models.ErrorMessage;

/**
 * @author dheeraj.kotha<dheerajkumarreddykotha@gmail.com>
 *
 */
@Provider
public class DataNotFoundExceptionMapper implements ExceptionMapper<DataNotFoundException> {

	/* (non-Javadoc)
	 * @see javax.ws.rs.ext.ExceptionMapper#toResponse(java.lang.Throwable)
	 */
	@Override
	public Response toResponse(DataNotFoundException ex) {
		ErrorMessage e = new ErrorMessage(ex.getMessage(),404,"Dheeraj");
		return Response.status(Status.NOT_FOUND).entity(e).build();
	}

}
