package colmeia;

public class Teste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//ABELHA RAINHA
		
		AbelhaRainha abR = new AbelhaRainha();
		
		abR.especie = "Abelha-europeia";
		abR.tamanho = "20 mm";
		abR.funcao = "Rainha";
		abR.fecundacao = false;
		abR.ferrao = true;
		abR.alimento = "Geleia Real";
		
		/*System.out.println(abR.fecundacao);
		abR.posturaDeOvos();
		
		System.out.println();
		
		abR.acasalar();
		System.out.println(abR.fecundacao);
		
		System.out.println();

		abR.posturaDeOvos();
		System.out.println(abR.fecundacao);
		
		System.out.println();

		abR.comer();*/
		
		//ABELHA OPERÁRIA
		
		AbelhaOperaria abO = new AbelhaOperaria();
		
		abO.especie = "Abelha-europeia";
		abO.tamanho = "12 mm";
		abO.funcao = "Campeira";
		abO.polen = true;
		abO.ferrao = true;
		abO.alimento = "Mel";

		/*abO.polinizar();
		
		System.out.println();
		
		System.out.println(abO.polen);
		abO.produzirMel();
		System.out.println(abO.polen);
		
		System.out.println();
		
		abO.comer();
		
		System.out.println();

		System.out.println(abO.ferrao);
		abO.ferroar();
		System.out.println(abO.ferrao);*/
		
		//ZANGÃO
		
		AbelhaZangao abZ = new AbelhaZangao();

		abZ.especie = "Abelha-europeia";
		abZ.tamanho = "15 mm";
		abZ.fecundacao = true;
		abZ.alimento = "néctar";
		
		/*abZ.comer();
		
		System.out.println();
		
		System.out.println(abZ.fecundacao);
		abZ.acasalar();
		System.out.println(abZ.fecundacao);
		
		System.out.println();
		
		abZ.comer();*/
				
	}

}
