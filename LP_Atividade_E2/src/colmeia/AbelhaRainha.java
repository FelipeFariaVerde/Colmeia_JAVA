package colmeia;

public class AbelhaRainha {
	
	//ATRIBUTOS
	public String especie;
	public String tamanho;
	public String funcao;
	public boolean fecundacao;
	public boolean ferrao;
	public String alimento;
	
	//MÉTODOS
	void acasalar() {
		if (ferrao == true){
			System.out.println("A rainha partiu para o voo nupcial e terá filhos! No entanto, ela pode ter acasalado com até 20 zangões! Quem é o pai?!");
		}
		else {
			System.out.println("A rainha conheceu seu primeiro e último amor... que dramático!");
		}
		fecundacao = true;
	}
	
	void posturaDeOvos() {
		if (fecundacao == false) {
			System.out.println("A rainha não pode botar ovos, pois não está fecundada.");
		}
		else {
			System.out.println("A rainha está dando a luz! A postura de ovos da rainha pode chegar a dois mil ovos por dia.");
		}
		fecundacao = false;
	}
	
	void comer() {
		System.out.println("Que "+ alimento +" delicioso(a)");
		System.out.println("Afinal, temos todos que comer para sobreviver.");
	}
}
