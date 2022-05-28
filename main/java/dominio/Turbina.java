package dominio;

public class Turbina extends Motor{
	
	private int nivelPotencia;
	
	public Turbina() {
		nivelPotencia =0;
	}
	
	public Turbina(int turbina) {
		nivelPotencia = turbina;
	}

    @Override
	protected void ligar() {
		if (super.isLigado() == false) {
			super.ligar();
			nivelPotencia = 5;}
		return;
	}
	
    @Override
    protected void desligar() {
		if (super.isLigado() == true) {
			super.desligar();
			nivelPotencia = 0;
		}
		return;
	}
	
	void aumentarPotencia(int aumento) throws DesligadoException {
		int var = nivelPotencia +  aumento;
		if (super.isLigado() == true && aumento > 0 ){
			  if ( var  <= 100) {
				  nivelPotencia = nivelPotencia +  aumento;
				  return;} 
			  else {
				  nivelPotencia = 100; 
				  return;}
			  }
			  else {
				  if (super.isLigado() == true) {
					 nivelPotencia  = 5;}
				  else {
					 throw new DesligadoException("Potencia excedeu em " + var );}
				  }
		}

	void diminuirPotencia(int diminuicao) throws DesligadoException {
		int var = nivelPotencia - diminuicao;
		if (super.isLigado() == true && diminuicao > 0){ 
			if ((var) >= 0) {
				nivelPotencia =  nivelPotencia - diminuicao;
				return;} 
			else {
				nivelPotencia = 0; 
				return;}
			}
		else {
			 if (super.isLigado() == true) {
				 nivelPotencia  = 5;
			  }
			  else {
				  throw new DesligadoException("Potencia negativo em " + var ); }
			 }
		}
	
	int getNivelPotencia() {
		return nivelPotencia;
	}
	
}
