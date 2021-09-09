package colmeia;

public class AbelhaRainha {
	
	//ATRIBUTOS
	public String especie;
	public String tamanho;
	public String funcao;
	public boolean fecundacao;
	public boolean ferrao;
	public String alimento;
	
	//M�TODOS
	void acasalar() {
		if (ferrao == true){
			System.out.println("A rainha partiu para o voo nupcial e ter� filhos! No entanto, ela pode ter acasalado com at� 20 zang�es! Quem � o pai?!");
		}
		else {
			System.out.println("A rainha conheceu seu primeiro e �ltimo amor... que dram�tico!");
		}
		fecundacao = true;
	}
	
	void posturaDeOvos() {
		if (fecundacao == false) {
			System.out.println("A rainha n�o pode botar ovos, pois n�o est� fecundada.");
		}
		else {
			System.out.println("A rainha est� dando a luz! A postura de ovos da rainha pode chegar a dois mil ovos por dia.");
		}
		fecundacao = false;
	}
	
	void comer() {
		System.out.println("Que "+ alimento +" delicioso(a)");
		System.out.println("Afinal, temos todos que comer para sobreviver.");
	}
}
