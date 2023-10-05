import java.util.Scanner;

public class Calculadora {
    Scanner x = new Scanner(System.in);
    int numero1, numero2;

    public void LeerNumeros() {
        System.out.println("Digite el valor del primer numero");
        numero1 = x.nextInt();

        System.out.println("Digite el valor del segundo numero");
        numero2 = x.nextInt();
    }

    public int Suma() {
        int suma = numero1 + numero2;
        return suma;
    }

    public int Resta() {
        int Resta = numero1 - numero2;
        return Resta;
    }

    public int Multiplicacion() {
        int Multiplicacion = numero1 * numero2;
        return Multiplicacion;
    }

    public int Division() {
        int Division = numero1 / numero2;
        return Division;
    }

    public void MostrarResultadosSuma() {
        System.out.println("La suma es: " + Suma());
    }

    public void MostrarResultadosResta() {
        System.out.println("La resta es: " + Resta());
    }

    public void MostrarResultadosMultiplicacion() {
        System.out.println("La multiplicacion es: " + Multiplicacion());
    }

    public void MostrarResultadosDivision() {
        System.out.println("La division es: " + Division());
    }

    
}
