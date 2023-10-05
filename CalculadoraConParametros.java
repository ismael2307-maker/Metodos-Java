import java.util.Scanner;
public class CalculadoraConParametros {
    
    byte suma,resta,multiplicacion,division;

    public void Suma(int num1,int num2){
        suma=(byte) (num1+num2);
    }

    public void Resta(int num1,int num2){
     resta=(byte)(num1-num2);
    }

    public void Multiplicar(int num1,int num2){
     multiplicacion=(byte)(num1*num2);
    }

    public void Dividir(int num1, int num2){
        division=(byte) (num1/num2);
    }

    public void MostrarResultados(){
        System.out.println("La suma es: "+suma);
        System.out.println("La resta es: "+resta);
        System.out.println("La multiplicacion es: "+multiplicacion);
         System.out.println("La division es: "+division);
    }
    public static void main(String[] args){
       byte n1,n2;
       Scanner x=new Scanner(System.in);

       System.out.println("Digite el primer numero");
       n1=x.nextByte();

       System.out.println("Digite el segundo numero");
       n2=x.nextByte();

       CalculadoraConParametros op=new CalculadoraConParametros();

       op.Suma(n1,n2);
       op.Resta(n1, n2);
       op.Multiplicar(n1, n2);
       op.Dividir(n1, n2);

       op.MostrarResultados();


        
     x.close();
    }
}
