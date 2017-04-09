package pruebas;

import com.google.gson.*;

public class Ejecutable {
	
	public static void main(String[] args) {
		
		String json = new Request().getAlumno();
		Gson gson = new Gson(); 
		Alumno alum = gson.fromJson(json, Alumno.class);
		System.out.println("Legajo: " + alum.getCode());
		System.out.println("Nombre: " + alum.getFirst_name());
		System.out.println("Apellido: " + alum.getLast_name());
		System.out.println("Github user: " + alum.getGithub_user());
	}
}
