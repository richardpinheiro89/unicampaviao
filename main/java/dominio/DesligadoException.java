package dominio;

public class DesligadoException extends Exception{
	
	private static final long serialVersionUID = 1L;
	
	public DesligadoException (String msg){
		System.out.println(msg);
		return;
	}

}
