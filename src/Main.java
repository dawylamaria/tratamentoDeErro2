import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {

        String texto = "abc";

        try{
            int numero = Integer.parseInt(texto);
            System.out.println(numero);

        }catch (NumberFormatException e){
            System.err.printf("Uma string nao pode ser convertida para um numero inteiro");
        }

    }
}