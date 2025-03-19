
package arrayex11;

       import java.util.ArrayList;

public class ArrayEx11 {
    public static void main(String[] args) {
       
        ArrayList<Double> numeros = new ArrayList<>();
        numeros.add(10.5);
        numeros.add(20.3);
        numeros.add(30.7);
        numeros.add(40.2);
        numeros.add(50.8);

        double soma = 0;

        for (Double numero : numeros) {
            soma += numero;
        }

        System.out.println("A soma de todos os valores é: " + soma);
    }
}

    
    

