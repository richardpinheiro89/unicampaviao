package dominio;

public class Motor extends Object{
	
	public Motor() {
		ligado = false;
		return;
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