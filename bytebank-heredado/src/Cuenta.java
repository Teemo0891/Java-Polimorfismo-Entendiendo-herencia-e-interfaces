public abstract class Cuenta {

	
		protected double saldo;
		private int agencia = 1;
		private int numero;
		private Cliente titular = new Cliente();
		
		private static int total;
		
		
		public Cuenta(int agencia, int numero) {
			this.agencia = agencia;
			this.numero = numero;
			System.out.println("Se van creando: " + total + " cuentas");
			total ++;
			
		}
		
		public abstract void depositar(double valor);
		
		
		
		public boolean retirar(double valor) {
			if(this.saldo >= valor) {
				this.saldo -= valor;
				return true;
			} else {
				return false;
			}
		}
		
		public boolean transferir(double valor, Cuenta cuenta){
			if(this.saldo >= valor) {
				this.saldo = this.saldo - valor;
				cuenta.depositar(valor);
				return true;
			} else {
				return false;
			}
		}
		
		public double getSaldo() {
			return saldo;
		}
		
		
		public void setSaldo(double saldo) {
			this.saldo = saldo;
		}
		
		public int getAgencia() {
			return agencia;
		}
		
		public void setTitular(Cliente titular) {
			this.titular = titular;
		}

		public Cliente getTitular() {
			return titular;
		}

		public int getNumero() {
			return numero;
		}

		public void setNumero(int numero) {
			this.numero = numero;
		}

		public static int getTotal() {
			return total;
		}
		
		
}
