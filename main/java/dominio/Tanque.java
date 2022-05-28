package dominio;

import java.math.BigDecimal;

public interface Tanque {
	
	default boolean abastecer(double valor) {
		return true;
	}	
	
	default boolean consumir(double valor) {
		return true;
	}

	
	default BigDecimal getCapacidadeTotal() {
	return new BigDecimal(0);
	}
	
	default BigDecimal getQntAtual() {
		return new BigDecimal(0);
	}

}
