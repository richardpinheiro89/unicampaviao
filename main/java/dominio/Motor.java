package dominio;

public class Motor {
	
	public Motor() {
		ligado = false;
	}
	
	private boolean ligado;
	
	protected void ligar() {
		ligado = true;
		return;
	}
	
	protected void desligar() {
		ligado = false;
		return;
	}
	
	protected boolean isLigado() {
		return ligado;
	}
	
	
	
	
	
	
}
