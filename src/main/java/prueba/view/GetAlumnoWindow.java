package prueba.view;

import org.uqbar.arena.layout.ColumnLayout;
import org.uqbar.arena.widgets.Button;
import org.uqbar.arena.widgets.Label;
import org.uqbar.arena.widgets.Panel;
import org.uqbar.arena.widgets.TextBox;
import org.uqbar.arena.windows.Dialog;
import org.uqbar.arena.windows.WindowOwner;

import prueba.viewModel.GetAlumnoViewModel;

public class GetAlumnoWindow extends Dialog<GetAlumnoViewModel> {
	
	public GetAlumnoWindow(WindowOwner owner){
		super(owner, new GetAlumnoViewModel());
	}
	
	@Override
	protected void createFormPanel(Panel mainPanel) {
		Panel form = new Panel(mainPanel);
		this.setTitle("Alumno");
		form.setLayout(new ColumnLayout(2));
		
		new Label(form).setText("Token: ");
		new TextBox(form).bindValueToProperty("token");
		
		new Label(form).setText("Legajo: ");
		new Label(form).bindValueToProperty("code");
		
		new Label(form).setText("Nombre: ");
		new Label(form).bindValueToProperty("first_name");
		
		new Label(form).setText("Apellido: ");
		new Label(form).bindValueToProperty("last_name");
		
		new Label(form).setText("Github user: ");
		new Label(form).bindValueToProperty("github_user");
		
		new Button(form)
		.setCaption("Consultar")
		.onClick(()-> this.getModelObject().cargarAlumno());
 
		new Label(form).setWidth(600);
	}
	
}
