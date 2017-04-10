package prueba;

import org.uqbar.arena.Application;
import org.uqbar.arena.windows.Window;

import prueba.view.RequestWindow;


public class Ejecutable extends Application{
	
	public static void main(String[] args) {
		new Ejecutable().start();

	}
	
	@Override
	protected Window<?> createMainWindow() {
		return new RequestWindow(this);
	}
}
