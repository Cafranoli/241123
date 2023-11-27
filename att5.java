package attDOWHILE;

import java.util.*;

public class att5 {                               //acelerar enquanto viagem não terminou
    public static void main(String[] args) {
        int acelerar = 1;
        int inicio = 0;

        while (inicio <= acelerar) {
            try {
            Thread.sleep(10000);
            System.out.println("Acelerando. Já se passaram " + acelerar + " metros ");
            acelerar++;
            } catch (InterruptedException e) {
                System.out.println("Ops! Houve algum erro...: " + e);
            }
        }
        System.out.println("Fim da viagem.");
    }
}
