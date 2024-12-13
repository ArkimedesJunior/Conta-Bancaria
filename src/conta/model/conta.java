package conta.model;

public  abstract class conta {
   
	
	// Atributo da classe conta / Variaveis
	private int numero;
	private int agencia;
	private int tipo;
	private String titular;
	private float saldo;
	
	/* 3 Modificadores de Acesso
	 * 
	 * Private - e o seu telefone, so voce pode ter acesso
	 * Protected - " e o telefone residencial, so quem mora com vc que tem acesso
	 * Public - todo mundo pode usar, ele e publico
	 *  
	 * 
	 * */
	
	// Metodo Especial - Metodo Construtor
	
	public conta(int numero, int agencia, int tipo, String titular, float saldo) {
		
		// this => Classe conta
		// conta.numero = atributo
		// numero = 6
		// this.numero = 6;
		
		this.numero = numero;
		
		this.agencia = agencia;
		this.tipo = tipo;
		this.titular = titular;
		this.saldo = saldo;
		
		
	}
	
	// Comportamentos
    // Metodos de Acesso
	

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public int getAgencia() {
		return agencia;
	}

	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}

	public int getTipo() {
		return tipo;
	}

	public void setTipo(int tipo) {
		this.tipo = tipo;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public float getSaldo() {
		return saldo;
	}

	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}
	
	public boolean sacar(float valor) {
		
		
		
		
		this.setSaldo(this.getSaldo() - valor);
		return true;
	}
	
	public void depositar(float valor) {
		
		this.setSaldo(this.getSaldo() + valor);
		
	}
	
	public void visualizar() {
		
		String tipo = "";
		
		switch (this.tipo) {
		case 1:
			tipo = "Conta Corrente";
			break;
		case 2:
			tipo = "Conta Poupança";
			break;
		}
		
		System.out.println("\n\n*************************************************************************");
		System.out.println("Dados da conta:");
		System.out.println("******************************************************************************");
		System.out.println("Numero da Conta: " + this.numero);
		System.out.println("Agencia: " 	+ this.agencia);
		System.out.println("Tipo da Conta: " + tipo);
		System.out.println("Titular: " + this.titular);
		System.out.println("Saldo: " + this.saldo);
		
	}
	
	
}


