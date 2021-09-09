package colmeia;

public class AbelhaOperaria {
	
	//ATRIBUTOS
	public String especie;
	public String tamanho;
	public String funcao;
	public boolean polen;
	public boolean ferrao;
	public String alimento;
		
	//MÉTODOS
	void polinizar() {
		polen = true;
		System.out.println("A abelha está coberta de pólen! Plantas novas surgirão.");
	}
	
	void produzirMel() {
		if (polen == true) {
			System.out.println("Uau! A colmeia está cheia de mel.");
		}
		else {
			System.out.println("Desculpe, mas essa abelha não tem pólen.");
		}
		polen = false;
	}
	
	void ferroar() {
		if (ferrao == true) {
			System.out.println("Pobre abelha... foi defender a colmeia e nunca mais voltou.");
		}
		else {
			System.out.println("Desculpe, mas essa espécie de abelha não tem ferrão... ou ela está falecida. ");
		}
		ferrao = false;
	}
	
	void comer() {
		System.out.println("Que "+ alimento +" delicioso(a)");
		System.out.println("Afinal, temos todos que comer para sobreviver.");
	}
}
