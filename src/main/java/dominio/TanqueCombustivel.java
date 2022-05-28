package dominio;

import java.math.BigDecimal;

public class TanqueCombustivel extends Compartimento<BigDecimal> implements Tanque {

	public TanqueCombustivel() {
  		 super(new BigDecimal(1000.0),new BigDecimal(0.0));
	}

	@Override
		public boolean abastecer(double valor) {
		if  (valor <0 ) {
			setQntAtual(new BigDecimal(0));
			return false;
		}
			BigDecimal var1 = new BigDecimal(valor);
			BigDecimal var2 = getQntAtual();
			BigDecimal var3 = var2.add(var1);
			if(var3.compareTo(getCapacidadeTotal()) == 1) {
				setQntAtual(getCapacidadeTotal());
				return false;
			}
			else{
				setQntAtual(var3);
				return true;
				}
		}
	
	@Override
		public boolean consumir(double valor) {
			if  (valor <0 ) {
				setQntAtual(new BigDecimal(0));
				return false;
			}
			BigDecimal var1 = new BigDecimal(valor);
			BigDecimal var2 = getQntAtual();
			BigDecimal var3 = var2.subtract(var1);
			if(var3.doubleValue() < 0) {
				setQntAtual(new BigDecimal(0));
				return false;
			}
			else{
				setQntAtual(var3);
				return true;
				}
			
		}
		
}