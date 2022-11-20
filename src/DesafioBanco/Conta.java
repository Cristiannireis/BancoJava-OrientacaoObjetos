package DesafioBanco;

public abstract class Conta implements IConta{
	public int agencia;
	public int numero;
	public double saldo;
	

	public int getAgencia() {
		return agencia;
	}

	public int getNumero() {
		return numero;
	}

	public double getSaldo() {
		return saldo;
	}

	@Override
	public void sacar(double valor) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void depositar(double valor) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void tranferir(double valor, Conta contaDestino) {
		// TODO Auto-generated method stub
		
	}

}
