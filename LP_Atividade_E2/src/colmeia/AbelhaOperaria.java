package colmeia;

public class AbelhaOperaria {
	
	//ATRIBUTOS
	public String especie;
	public String tamanho;
	public String funcao;
	public boolean polen;
	public boolean ferrao;
	public String alimento;
		
	//M�TODOS
	void polinizar() {
		polen = true;
		System.out.println("A abelha est� coberta de p�len! Plantas novas surgir�o.");
	}
	
	void produzirMel() {
		if (polen == true) {
			System.out.println("Uau! A colmeia est� cheia de mel.");
		}
		else {
			System.out.println("Desculpe, mas essa abelha n�o tem p�len.");
		}
		polen = false;
	}
	
	void ferroar() {
		if (ferrao == true) {
			System.out.println("Pobre abelha... foi defender a colmeia e nunca mais voltou.");
		}
		else {
			System.out.println("Desculpe, mas essa esp�cie de abelha n�o tem ferr�o... ou ela est� falecida. ");
		}
		ferrao = false;
	}
	
	void comer() {
		System.out.println("Que "+ alimento +" delicioso(a)");
		System.out.println("Afinal, temos todos que comer para sobreviver.");
	}
}
