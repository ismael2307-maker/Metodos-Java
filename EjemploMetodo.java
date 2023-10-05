import static java.lang.Math.*;
public class EjemploMetodo{

    public void imprimirAlgo(){
      if(random()>0.5){
        System.out.println("Numero muy grande");
        return;
      }else {
        System.out.println("Numero muy pequeño");
    }
    System.out.println("Desde el final del primer metodo");
    }

    public static void main(String[]args){
        EjemploMetodo ej=new EjemploMetodo();
        ej.imprimirAlgo();
    }
}