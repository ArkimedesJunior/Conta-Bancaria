package conta.model;

public class ContaCorrente extends conta {

	
	// Atributo da classe conta / Variaveis
	
	private float limite;
	
	/* 3 Modificadores de Acesso
	 * 
	 * Private - e o seu telefone, so voce pode ter acesso
	 * Protected - " e o telefone residencial, so quem mora com vc que tem acesso
	 * Public - todo mundo pode usar, ele e publico
	 *  
	 * 
	 * */
	
	// Metodo Especial - Metodo Construtor
	
	public ContaCorrente(int numero, int agencia, int tipo, String titular, float saldo, float limite) {
		super(numero, agencia, tipo, titular, saldo ); // invocando o metodo contrutor conta
		// this => Classe conta                        // this => nome da classe
		// conta.numero = atributo
		// numero = 6
		// this.numero = 6;
		
		this.limite = limite;
		
	}
	
	public ContaCorrente(int numero, int agencia, int tipo, String titular, float saldo) {
		super(numero, agencia, tipo, titular, saldo );
		this.limite = 5000.0f; 
		}
		
	
	// metodos de acesso
	public float getLimite() {
		return limite;
		
	}
	
	public void setLimite(float limite) {
		this.limite = limite;
	}
	
	// polimorfismo de sobrecarga => add mais logica a um metodo ja existente
	public void visualizar() {
		super.visualizar(); // metodo da classe conta
		System.out.println("limite de credito:" + this.limite);
	}
}
