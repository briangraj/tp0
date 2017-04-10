package prueba.viewModel;

import javax.ws.rs.core.MediaType;

import org.uqbar.commons.utils.Observable;

import com.google.gson.Gson;
import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;

import prueba.Alumno;

@Observable
public class GetAlumnoViewModel {
	private long code;
	private String first_name;
	private String last_name;
	private String github_user;
	private String token;
	//private ArrayList<Materia> assignments;
	
	private Gson gson;
	private Client client;

	public GetAlumnoViewModel(){
		this.gson = new Gson();
        this.client = Client.create();
	}

	public void cargarAlumno(){
		String json = this.client.resource("http://notitas.herokuapp.com")
			        		.path("student")
			        	 	.header("Authorization", "Bearer " + this.token)
			                .accept(MediaType.APPLICATION_JSON)
			                .get(ClientResponse.class)
			                .getEntity(String.class);
		Alumno alumno = gson.fromJson(json, Alumno.class);
		
		this.code = alumno.getCode();
		this.first_name = alumno.getFirst_name();
		this.last_name = alumno.getLast_name();
		this.github_user = alumno.getGithub_user();
	}

	public long getCode() {
		return code;
	}

	public void setCode(long code) {
		this.code = code;
	}

	public String getFirst_name() {
		return first_name;
	}

	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}

	public String getLast_name() {
		return last_name;
	}

	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}

	public String getGithub_user() {
		return github_user;
	}

	public void setGithub_user(String github_user) {
		this.github_user = github_user;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}
	
	
}
