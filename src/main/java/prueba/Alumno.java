package prueba;

public class Alumno {
	
	private long code;
	private String first_name;
	private String last_name;
	private String github_user;
	//private ArrayList<Materia> assignments;
	
	public long getCode() {
		return code;
	}

	public String getFirst_name() {
		return first_name;
	}

	public String getLast_name() {
		return last_name;
	}

	public String getGithub_user() {
		return github_user;
	}
	public void setCode(long code) {
		this.code = code;
	}

	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}

	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}

	public void setGithub_user(String github_user) {
		this.github_user = github_user;
	}

}
