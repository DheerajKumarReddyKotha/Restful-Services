# Restful-Services

1. What is Rest?
a) It is a Representational State Transfer Protocol.
b) It is an architectural style based on web standards and HTTP methods.
c) It was developed by Roy Fielding in the year 2000.
d) It is a resource based architectural style. Resources are denoted as URI.
e) A resource is accessed via a common interface based on HTTP methods.
f) In rest based applications,you typically consists of server through which resources are assessed.
g) In this structure we use a client to access and change the resource.
h) Every resource should support the HTTP common operations.
i) Resources are identified by global IDs.
j) REST allows the resource to be text,xml,json etc,.

2. What are HTTP methods?
a) PUT - It defines the modification of existing resource. Idempotent
b) POST - It defines the creation of new resource.
c) GET - It defines reading access of the resource. Idempotent
d) DELETE - It defines the deletion of the resources. Idempotent

Note: Idempotent -> Indicates the value remain unchanged.
      MIME - Multi-purpose Internet Mail Extensions.

3. What is a restful web-service?
a) It is based on concepts of HTTP methods and concepts of REST. 
b) It consists of a service URI through which we access the resources. 
c) It supports resources in the format of text,xml,json and http methods like GET,POST,PUT,DELETE.

4. What is JAX-RS?
a) Java defines REST support via Java Specification Request 311. This specification is called JAX-RS.
b) JAX-RS --> Java API for Restful Web-services.
c)  JAX-RS uses annotations to define the REST relevance of Java classes.

5. What is Jersey?
a) It is a reference implementation of JAX-RS or JSR 311.
b) The Jersey implementation provides a library to implement Restful web-services in a Java servlet container.
c) On the server side Jersey provides a servlet implementation which scans predefined classes to identify RESTful resources.
d) In your web.xml configuration file your register this servlet for your web application.
e) The Jersey implementation also provides a client library to communicate with a RESTful web-service.

Base URL : http://your_domain:port/display-name/url-pattern/path_from_rest_class

f) JAX-RS supports the creation of XML and JSON via the Java Architecture for XML Binding (JAXB).

6. What are JAX-RS Annotations?
a) @Path - Sets the path to the base URL + your path. The base url is based on your application name in your servlet and URL pattern from your web.xml file.
b) @POST - Indicates that following method will answer to HTTP POST Request.
c) @GET - Indicates that following method will answer to HTTP GET Request.
d) @PUT - Indicates that following method will answer to HTTP PUT Request.
e) @DELETE - Indicates that following method will answer to HTTP DELETE Request.
f) @PRODUCES - It defines which MIME type is delivered by a method annotated with @GET
g) @CONSUMES - It defines which MIME type is consumed by this method.
h) @PathParam - Used to inject values from the URL into a method parameter. This way you inject, for example, the ID of a resource into the method to get the correct object.
i) @QueryParam - It is used to inject the param which queries the resource based on the param sent.
j) @MatrixParam - It is similar to Query param but differ in replacing '?' with ':'.
k) @HeaderParam - It is used to inject values from the headers, it is used to send meta data like authentication and all.
l) @CookieParam - It is used to inject cookie name.
m) @FormParam - It is used to submit the params of a HTML Form.
n) @Context - It is used to inject predefined class and use their methods.
o) @BeanParam - It is used to access request parameters by putting all params in one class.


7. What is a Web-Container?
A web container (also known as a servlet container; and compare "webtainer") is the component of a web server that interacts with Java servlets. 
A web container is responsible for managing the lifecycle of servlets, mapping a URL to a particular servlet and ensuring that the URL requester has the correct access-rights.

8. How to handle exceptions in web applications?
This is explained in all classes using Exceptions and Exception Mapper.