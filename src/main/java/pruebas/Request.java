package pruebas;

import javax.ws.rs.core.MediaType;
import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;

public class Request {

	private Client client;
	
	public Request() {
        this.client = Client.create();
	}
		
	public String getAlumno(){
		return this.client.resource("http://notitas.herokuapp.com")
		        		  .path("student")
		        	 	  .header("Authorization", "Bearer eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJpc3MiOiIxMTEyMjIzMzMiLCJybmQiOiJ5SXNmZFIwN2lIR3BRRmVjYU9KT2VRPT0ifQ.9pVJGUXhrJPQ-TptNCt971l0h_1dWqWgMrHAWXJchho")
		                  .accept(MediaType.APPLICATION_JSON)
		                  .get(ClientResponse.class)
		                  .getEntity(String.class);
	}
}
