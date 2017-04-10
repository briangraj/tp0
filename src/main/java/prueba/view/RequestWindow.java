package prueba.view;

import org.uqbar.arena.widgets.Button;
import org.uqbar.arena.widgets.Panel;
import org.uqbar.arena.windows.Dialog;
import org.uqbar.arena.windows.SimpleWindow;
import org.uqbar.arena.windows.WindowOwner;

import prueba.viewModel.RequestViewModel;

public class RequestWindow extends SimpleWindow<RequestViewModel>{
	
	public RequestWindow(WindowOwner parent) {
		super(parent, new RequestViewModel());
	}
	
	@Override
	protected void addActions(Panel panelActions) {
		new Button(panelActions)
		.setCaption("Obtener alumno")
		.onClick(this::obtenerAlumno);
	}
	
	protected void createFormPanel(Panel formPanel) {
		this.setTitle("Request");
		
	
	}
	
		
	public void obtenerAlumno(){
		Dialog<?> dialog = new GetAlumnoWindow(this);
		dialog.open();
		dialog.onAccept(() -> {});
	}
	

}
