import static java.lang.Math.*;
public class EjemploMetodo2 {
    public String imprimirOtroCosa(){
        if(random()>0.5){
            return "Dentro del if";
        }
        return "Desde el final del segundo metodo";    
    }

public static void main(String[]args){
    EjemploMetodo2 ej=new EjemploMetodo2();
    ej.imprimirOtroCosa();
    String cadena=ej.imprimirOtroCosa();
    System.out.println("El metodo que devuelve una cadena, retorno: "+cadena);

 }
}