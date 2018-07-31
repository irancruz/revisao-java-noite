package exemplo2;

public class ContaPoupanca extends Conta {

	private final Float REDIMENTO = 0.01f; //constante

	public void rende (){
		if (super.getSaldo() > 0) {
			super.setSaldo(super.getSaldo()*REDIMENTO);
		}		
	}
	
//	@Override
	Boolean saca(Float valor) {
		Float saldo = super.getSaldo();
		if (valor > 0 && saldo >= valor) {			
			super.setSaldo(saldo - valor);
			return true;
		}
		return false;

	}

	@Override
	public String toString() {
		return "ContaPoupança [conta=" + super.toString() + "]";
	}
	
}
