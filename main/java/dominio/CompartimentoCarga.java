package dominio;

public class CompartimentoCarga extends Compartimento<Float> {
	
	public CompartimentoCarga(){
		super((float)1000.0,(float)0);
	}
	
	boolean carregarCarga(float valor) {
		if (valor <0) {
			return false;
		}
		float var = getQntAtual(); 
		var  = var + valor;
		if (var <= getCapacidadeTotal()) {
			setQntAtual(var);
			return true;}
		else {
			return false;}
		}
	
	boolean descarregarCarga(float valor) {
		if (valor <0) {
			return false;
		}
		float var = getQntAtual(); 
		var  = var - valor;
		if (var >= 0) {
			setQntAtual(var);
			return true;
		}
		else {
			return false;
		}
	}

}
