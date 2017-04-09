package pruebas;

import javax.ws.rs.core.MediaType;

import com.google.gson.Gson;
import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;

public class Request {
	private Gson gson;
	private Client client;
	
	public Request() {
        this.gson = new Gson();
        this.client = Client.create();
	}
		
	public Alumno getAlumno(){
		String json = this.client.resource("http://notitas.herokuapp.com")
			        		.path("student")
			        	 	.header("Authorization", "Bearer eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJpc3MiOiIxMTEyMjIzMzMiLCJybmQiOiJ5SXNmZFIwN2lIR3BRRmVjYU9KT2VRPT0ifQ.9pVJGUXhrJPQ-TptNCt971l0h_1dWqWgMrHAWXJchho")
			                .accept(MediaType.APPLICATION_JSON)
			                .get(ClientResponse.class)
			                .getEntity(String.class);
		return gson.fromJson(json, Alumno.class);
	}
	
	public void putAlumno(long code, String first_name, String last_name, String github_user){
		Alumno alumno = new Alumno(code, first_name, last_name, github_user);
		String json = gson.toJson(alumno);
		
		this.client.resource("http://notitas.herokuapp.com")
				   .path("student")
				   .header("Authorization", "Bearer eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJpc3MiOiIxMTEyMjIzMzMiLCJybmQiOiJ5SXNmZFIwN2lIR3BRRmVjYU9KT2VRPT0ifQ.9pVJGUXhrJPQ-TptNCt971l0h_1dWqWgMrHAWXJchho")
				   .accept(MediaType.APPLICATION_JSON)
				   .put(ClientResponse.class, json);
	}
		
	public Alumno getMaterias(){
		String json = this.client.resource("http://notitas.herokuapp.com")
			      		    .path("student/assignments")
			    	 	    .header("Authorization", "Bearer eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJpc3MiOiIxMTEyMjIzMzMiLCJybmQiOiJ5SXNmZFIwN2lIR3BRRmVjYU9KT2VRPT0ifQ.9pVJGUXhrJPQ-TptNCt971l0h_1dWqWgMrHAWXJchho")
			                .accept(MediaType.APPLICATION_JSON)
			                .get(ClientResponse.class)
			                .getEntity(String.class);
		return gson.fromJson(json, Alumno.class);
	}
		
}
