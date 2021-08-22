
package infodiferente;

import java.util.Scanner;

public class InfoDiferente {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        
        System.out.println("Digite seu nome: ");
        String nome = leia.nextLine();
        System.out.printf("Olá, %s! Por favor, digite sua idade: " , nome);
        int idade = leia.nextInt();
        System.out.println( nome+ " é o seu nome e sua idade é " + idade);
        
    }
    
}
