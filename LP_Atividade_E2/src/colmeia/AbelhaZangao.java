package colmeia;

public class AbelhaZangao {
	
	//ATRIBUTOS
		public String especie;
		public String tamanho;
		public boolean fecundacao;
		public boolean ferrao = false;
		public String alimento;
	
	void acasalar() {
		if (fecundacao == true){
			System.out.println("O zangão encontrou uma rainha virgem para o voo nupcial!");
			System.out.println("Infelizmente o zangão voou desta para melhor, 1 minuto de silêncio...");
		}
		else {
			System.out.println("Desculpe, mas esse zangão já faleceu.");
		}
		fecundacao = false;
	}
	
	void comer() {
		if (fecundacao == true){
			System.out.println("Que "+ alimento +" delicioso(a)");
			System.out.println("Afinal, temos todos que comer para sobreviver.");
		}
		else {
			System.out.println("Desculpe, mas esse zangão já faleceu.");
		}
	}
}
