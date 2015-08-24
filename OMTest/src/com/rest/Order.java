package com.rest;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.MediaType;

import org.json.*;

import com.customers.Experiment;

@Path("/")
public class Order {
	@GET
	public String sayHtmlHello() {
		return "<html> " + "<title>" + "Order Management" + "</title>"
				+ "<body><h1>" + "Welcome to Order Management<sup>&copy</sup>"
				+ "</h1></body>" + "</html> ";
	}

	@GET
	@Path("/{id}")
	public String getOrder(@PathParam("id") String id) {
		return id;
	}

	@POST
	@Path("/send1")
	@Consumes(MediaType.APPLICATION_JSON)
	public String consumeJSON(String student) throws JSONException {
		JSONObject js = new JSONObject(student);
		String name1 = (String) js.get("name");
		String age = (String) js.get("age");
		return name1 + age;
	}

	@POST
	@Path("/insertcust")
	@Consumes(MediaType.APPLICATION_JSON)
	public boolean consumeJSON1(String student) throws JSONException {
		Experiment.main1(student);
		return false;
	}

}
