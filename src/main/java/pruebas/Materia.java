package pruebas;

import java.util.*;

public class Materia {
	private int id;
	private String title;
	private String description;
	private Collection<Nota> grades;
	
	
	public int getId() {
		return id;
	}
	public String getTitle() {
		return title;
	}
	public String getDescription() {
		return description;
	}
	public Collection<Nota> getGrades() {
		return grades;
	}
	
}
