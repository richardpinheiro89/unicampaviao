package dominio;

//import java.util.ArrayList;
import java.util.Arrays;
//import java.util.Date;
import java.util.List;

public class Aviao {
	
	private final TanqueCombustivel tanqueCombustivel;
	private final CompartimentoCarga compartimentoCarga;
	private final List<Turbina> lsTurbinas;
	
	public Aviao() {
		tanqueCombustivel = new TanqueCombustivel();
		compartimentoCarga = new CompartimentoCarga();
		lsTurbinas = Arrays.asList(new Turbina(),new Turbina()); // duas Turbinas
	}
	
	
	void ligarTurbinas() {
		if (getQntdAtualCombustivel() > 0) {
			lsTurbinas.get(0).ligar();
			lsTurbinas.get(1).ligar();}
 		return;
	}
	
	void desligarTurbinas() {
		if (getQntdAtualCombustivel() > 0) {
			lsTurbinas.get(0).desligar();
			lsTurbinas.get(1).desligar();
		}
		return;
	}
	
	boolean isTurbinasLigadas() {
		if (lsTurbinas.get(0).isLigado() && lsTurbinas.get(1).isLigado()) {
			return true;
		} else {	
			return false;
		}
	}
	
	int nivelPotenciaTurbinas() {
		int i;
		int n = lsTurbinas.size();
		int soma=0;
		for (i=0; i<n; i++) {
			soma +=lsTurbinas.get(i).getNivelPotencia();
		}
		return soma / i ;
	}
	
	void aumentarPotenciaTurbinas(){
		try {
			lsTurbinas.get(0).aumentarPotencia(5);
			lsTurbinas.get(1).aumentarPotencia(5);
		} catch (DesligadoException e) {
			//e.printStackTrace();
		}	
		return;
	}
	
	void diminuirPotenciaTurbinas(){
		try {
			lsTurbinas.get(0).diminuirPotencia(5);
			lsTurbinas.get(1).diminuirPotencia(5);
		} catch (DesligadoException e) {
			//e.printStackTrace();
		}	
		return;
	}
	
	void abastecer(double valor) {
		tanqueCombustivel.abastecer(valor);
		return;
	}
	
	void consumir(double valor) {
		tanqueCombustivel.consumir(valor);
		return;
	}
	
	double getCapacidadeTotalCombustivel() {
		return tanqueCombustivel.capacidadeTotal;
	}
	
	double getQntdAtualCombustivel() {
		return tanqueCombustivel.qntAtual;
	}

	void carregarCarga(int value) {
		compartimentoCarga.carregarCarga(value);
		return;
	}
	
	void descarregarCarga(int value) {
		compartimentoCarga.descarregarCarga(value);
		return;
	}
	
	float getCapacidadeTotalCarga() {
		return compartimentoCarga.getCapacidadeTotal();
	}
	
	float getQntdAtualCarga() {
		return compartimentoCarga.getQntAtual();
	}
	
    public static void main(String[] args) {
    		//Aviao instance = new Aviao();
	        //instance.ligarTurbinas();
	        //System.out.println(instance.nivelPotenciaTurbinas());
	        //System.out.println(instance.isTurbinasLigadas()); 
	        //instance.aumentarPotenciaTurbinas();
	        //System.out.println(instance.nivelPotenciaTurbinas());
	        //instance.aumentarPotenciaTurbinas();
	        //System.out.println(instance.nivelPotenciaTurbinas());
	        //instance.desligarTurbinas();
	        //System.out.println(instance.nivelPotenciaTurbinas());
	        //instance.getQntdAtualCombustivel();
	        //instance.abastecer(100);
	        //instance.getQntdAtualCombustivel();
	        //instance.consumir(60);
	        //instance.getQntdAtualCombustivel();
	        //System.out.println(instance.getQntdAtualCombustivel());
    		//System.out.println("**************");
    		//instance.carregarCarga(100);
	        //System.out.println(instance.getQntdAtualCarga());
	        //instance.descarregarCarga(40);
	        //System.out.println(instance.getQntdAtualCarga());
	    }
	
}
