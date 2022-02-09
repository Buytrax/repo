import java.util.Scanner;
public class Codi{
	public static void main (String []args) {
		Scanner lector = new Scanner(System.in);
		int nVariables=0;
        int contador=0;
        double aContador=0;
        double result1=0;
        double result=0;
		try {
			nVariables = lector.nextInt();
		}catch(Exception e){
			System.out.println("Error: Formato de variable no valido");
		}
        int[] aVariables = new int[nVariables];
        if(nVariables>0) {
            while (contador < nVariables){
                aVariables[contador] = lector.nextInt();
                contador++;
            }
            contador = 0;
        }else{
            System.out.println("Error: Numero vacio");
        }
        System.out.println();
        while (contador < nVariables){
            aContador=aVariables[contador];
            result1=(1 + (1/aContador));
            result=Math.pow(result1,aContador);
            System.out.println(result + " ");
            contador++;
        }
        lector.close();
	}
}