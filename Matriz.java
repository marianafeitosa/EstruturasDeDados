
public class Main
{
	public static void main(String[] args) {
	    Object elementos[][] = new Object[2][3]; // usando Object(variavel suprema) para criar uma matriz na com 2 linhas 3 colunas
	    
	    elementos[0][0]= 10; //add o número 19 na posição x=0 e y=0 da matriz
	    elementos[1][2] = "elemento";// add a string "elemento" na posição x=2 e y=3 da matriz
	    
	    //montando a matriz x= linha e y=coluna
		System.out.println(elementos[0][0]+","+ elementos [1][0]);
	    System.out.println(elementos[0][1]+","+ elementos [1][1]);
	    System.out.println(elementos[0][2]+","+ elementos [1][2]);
            

	}
}
