package pruebas;

public class Ejecutable {
	
	public static void main(String[] args) {
		new Request().putAlumno(1234, "ciro", "of", "oc");
		
		
		Alumno alumno = new Request().getAlumno();
		System.out.println("Legajo: " + alumno.getCode());
		System.out.println("Nombre: " + alumno.getFirst_name());
		System.out.println("Apellido: " + alumno.getLast_name());
		System.out.println("Github user: " + alumno.getGithub_user());
		
		
		Alumno materias = new Request().getMaterias();
		System.out.println(materias.getAssignments().get(1).getTitle());
		}
}
