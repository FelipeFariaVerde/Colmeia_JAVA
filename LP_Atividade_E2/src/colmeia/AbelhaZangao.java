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
			System.out.println("O zang�o encontrou uma rainha virgem para o voo nupcial!");
			System.out.println("Infelizmente o zang�o voou desta para melhor, 1 minuto de sil�ncio...");
		}
		else {
			System.out.println("Desculpe, mas esse zang�o j� faleceu.");
		}
		fecundacao = false;
	}
	
	void comer() {
		if (fecundacao == true){
			System.out.println("Que "+ alimento +" delicioso(a)");
			System.out.println("Afinal, temos todos que comer para sobreviver.");
		}
		else {
			System.out.println("Desculpe, mas esse zang�o j� faleceu.");
		}
	}
}
