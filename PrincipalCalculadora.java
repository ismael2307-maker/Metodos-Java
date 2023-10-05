import java.util.Scanner;

public class PrincipalCalculadora {
    public static void main(String[] args) {
        Calculadora op = new Calculadora();
        Scanner x = new Scanner(System.in);
        int operacion;

        System.out.println("1.-Suma 2.-Resta 3.-Multiplicacion 4.-Division");
        System.out.println("Seleccione su opcion");
        operacion = x.nextInt();
        while (operacion <= 0 || operacion > 4) {
            System.out.println("\n No puede metener negativos ni exceder el limite permitido"
                    + "\n Seleccione de nuevo su opcion");
            operacion = x.nextInt();
        }

        switch (operacion) {
            case 1: {
                op.LeerNumeros();
                op.Suma();
                op.MostrarResultadosSuma();
                break;
            }
            case 2: {
                op.LeerNumeros();
                op.Resta();
                op.MostrarResultadosResta();
                break;
            }
            case 3: {
                op.LeerNumeros();
                op.Multiplicacion();
                op.MostrarResultadosMultiplicacion();
                break;
            }
            case 4: {
                op.LeerNumeros();
                op.Division();
                op.MostrarResultadosDivision();
                break;
            }
            default:
                System.out.println("No ha digitado ningun valor permitido");
        }
        x.close();
    }

}
