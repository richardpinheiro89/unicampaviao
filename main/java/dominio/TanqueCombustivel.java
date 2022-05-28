package dominio;

import java.math.BigDecimal;

public class TanqueCombustivel extends Compartimento<BigDecimal> implements Tanque {

	protected double capacidadeTotal;
	protected double qntAtual;
	
	public TanqueCombustivel() {
  		 super(new BigDecimal(1000.0),new BigDecimal(0.0));
		 this.capacidadeTotal = 1000.0;
		 this.qntAtual = 0.0;
	}

	@Override
		public boolean abastecer(double valor) {
		if  (valor <0 ) {
			//System.out.println("consumir negativo");
			qntAtual = 0;
			return false;
		}
			BigDecimal var1 = new BigDecimal(valor);
			BigDecimal var2 = getQntAtual();
			BigDecimal var3 = var2.add(var1);
			if(var3.compareTo(getCapacidadeTotal()) == 1) {
				qntAtual = capacidadeTotal;
				return false;
			}
			else{
				qntAtual = var3.doubleValue();
				return true;
				}
		}
	
	@Override
		public boolean consumir(double valor) {
			if  (valor <0 ) {
				//System.out.println("consumir negativo");
				qntAtual = 0;
				return false;
			}
			BigDecimal var1 = new BigDecimal(valor);
			BigDecimal var2 = getQntAtual();
			BigDecimal var3 = var2.subtract(var1);
			if(var3.doubleValue() < 0) {
				qntAtual = 0;
				return false;
			}
			else{
				qntAtual = var3.doubleValue();
				return true;
				}
			
		}

	@Override
		public BigDecimal getCapacidadeTotal() {
			BigDecimal bigCapacidadeTotal = new BigDecimal(capacidadeTotal);
			return bigCapacidadeTotal;
		}
		
	@Override
		public BigDecimal getQntAtual() {
			BigDecimal bigQntAtual = new BigDecimal(qntAtual);
			return bigQntAtual;
		}
		
}
