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
public class GenericExceptionMapper implements ExceptionMapper<Throwable> {

	/* (non-Javadoc)
	 * @see javax.ws.rs.ext.ExceptionMapper#toResponse(java.lang.Throwable)
	 */
	@Override
	public Response toResponse(Throwable ex) {
		ErrorMessage e = new ErrorMessage(ex.getMessage(),500,"Dheeraj");
		return Response.status(Status.INTERNAL_SERVER_ERROR).entity(e).build();
	}

}
