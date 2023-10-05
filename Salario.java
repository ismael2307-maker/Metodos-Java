import java.util.Scanner;

public class Salario{
    static final double IR=0.156;
    static final double Inss=0.07,InssPatronal=0.225;
     static double Monto,Antiguedad,AfilacionDeSindicato,DeduccionIr,IngresoTotal,DeduccionInss,TotalDeduc,Patronal,Neto;
     
    public static Scanner x=new Scanner(System.in);

    public static double leerEntradas(){
        System.out.println("Digite su monto mensual");
        Monto=x.nextDouble();   
        return Monto;
    }

    public static double calcularAntiguedad(){
       Antiguedad=Monto*0.15;
       return Antiguedad;
    }

    public static double TotalDeducciones(){
     IngresoTotal=Monto+Antiguedad;

     DeduccionIr=IngresoTotal*IR;
     DeduccionInss=IngresoTotal*Inss;
     AfilacionDeSindicato=Monto*0.01;
     TotalDeduc=DeduccionInss+DeduccionIr+AfilacionDeSindicato;


     Patronal=IngresoTotal*InssPatronal;    
     Neto=IngresoTotal-TotalDeduc;
     return TotalDeduc;  

    }

    public static void MostrarResultados(){
        System.out.println("El ingreso neto a pagar es: "+Neto);
        System.out.println("La antigueda es: "+Antiguedad);
        System.out.println("El ingreso total es: "+IngresoTotal);
        System.out.println(" ");
        System.out.println("La Deduccion IR es: "+DeduccionIr);
        System.out.println("La Deduccion Inss es: "+DeduccionInss);
        System.out.println("La afilacion del sindicato es: "+AfilacionDeSindicato);
        System.out.println("El total de deducciones es: "+TotalDeduc);
        System.out.println(" ");
        System.out.println("El inss patronal es: "+Patronal); 
    }
    public static void main(String[] args){

        leerEntradas();
        calcularAntiguedad();
        TotalDeducciones();
        MostrarResultados();

    }
}