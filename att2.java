package attDOWHILE;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class att2 {                       //verificar entrada de usuário a cada segundo
    public static void main(String[] args) {
        int maxUsers = 2;
        String usuario;
        List<String> usersLogged = new ArrayList<>();
        Scanner us = new Scanner (System.in);
        while (usersLogged.size() < maxUsers) {
            try {
                System.out.println("Digite seu login:");
                usuario = us.nextLine();
                usersLogged.add(usuario);
                Thread.sleep(1000);
                System.out.println("Usuários logados: " + usersLogged);
            } catch (InterruptedException e) {
                System.out.println("Erro: " + e);
            }
        }
        us.close();
     }
}
