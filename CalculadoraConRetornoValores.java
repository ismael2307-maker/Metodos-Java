

import javax.swing.JOptionPane;
public class CalculadoraConRetornoValores {
    public int Suma(int num1,int num2){
        int sumar=num1+num2;
        return sumar;
   }
   
   public int Restar(int num1,int num2){
       int resta=num1-num2;
       return resta;
   }
   
   public int Dividir(int num1,int num2){
       int division=num1/num2;
       return division;
   }
   
   public int Multiplicacion(int num1, int num2){
       int multiplicar=num1*num2;
       return multiplicar;
   }

   public void MostrarResultados(int sumar, int resta, int division, int multiplicar){
    System.out.println("La suma es: "+sumar);
     System.out.println("La resta es: "+resta);
      System.out.println("La division es: "+division);
     System.out.println("La multiplicacion es: "+multiplicar);
   }

   public static void main(String[] args){
    CalculadoraConRetornoValores cal=new CalculadoraConRetornoValores();

    int n1=Integer.parseInt(JOptionPane.showInputDialog("digite el numero 1"));
    int n2=Integer.parseInt(JOptionPane.showInputDialog("digite el numero 2"));

    int suma=cal.Suma(n1,n2);
    int res=cal.Restar(n1,n2);
    int mul=cal.Multiplicacion(n1,n2);
    int div=cal.Dividir(n1,n2);
    cal.MostrarResultados(suma, res, div, mul);
   }
    
}
