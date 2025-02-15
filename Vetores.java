
public class Main
{
	public static void main(String[] args) {
	    
	    //criando um vetor (variavel) que consegue guardar varias variaveis dentro dele, nesse caso 4
	    Object nomes[] = new Object [4]; //usando o Object (variavel suprema) abrange todos "String", "int", etc
	    
	    //dando valor para a variavel que sempre começa pela posição 0 no vetor , nesse ex vai de 0 a 3 
	    nomes[0] = "André";
	    nomes[1] = "Mariana";
	    nomes[2] = "Giovana";
	    nomes[3] = "Andrei";
	    
		System.out.println("Posição 0:" + nomes[0]);// vai mostrar que o Andre esta na posição 0 do vetor
		System.out.println("Posição 1:" + nomes[1]);// vai mostrar que a Mariana esta na posição 1 do vetor
		System.out.println("Posição 2:" + nomes[2]);// vai mostrar que a Giovana esta na posição 2 do vetor
		System.out.println("Posição 3:" + nomes[3]);// vai mostrar que o Andrei esta na posição 3 do vetor
			System.out.println("");//aspas p dar espaço
		System.out.println("Tamanho do vetor:"+ nomes.length); // length é usado para saber o tamanho do vetor
	}
}
