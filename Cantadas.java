/*
==> Algorithm: Algumas brincadeiras legais
=> Author: Lucas Mateus
=> Creted at: 24/03/2023
==> Updated at: 29/06/2023
*/

// Imports
import java.util.Random;
import java.util.Scanner;

public class Cantadas {
    public static void main(String[] args){
        System.out.println("Aopa meu patrão, POO rodando");
        Scanner reader = new Scanner(System.in);

        // Pega um text inserido pelo user
        System.out.print("Escreva seu nome, meu nobre: ");
        String p1 = reader.nextLine();
        System.out.print("Escreva o nome de seu/sua amado(a): ");
        String p2 = reader.nextLine();

        // Gera e mostra a frase, e gg
        System.out.println(frases(p1, p2));
    }

    static String frases(String p1, String p2){
        String[] introducao = {"Salve salve gatinha, ", "Koé felina, ", "Eai gatosa, ", "Olá moça, sabia que ",
                            "Ai mina, ", "Ô moça, ", "Pss pss, ei gatinha ", "AAAAAAAAAi papai, xonei em como... "};
        String[] frases = {
            "estou aqui! Quais são os seus outros dois desejos?",
            "tem alguma coisa errada com o meu celular. Não consigo encontrar o seu número nele...",
            "além de me deixar sem ar, o que mais você faz?",
            "estou sentindo uma dor no peito... Espero que seja amor, porque se for infarto, eu nunca mais te verei!",
            "teu olhar é tão penetrante quanto a luz do sol >///<",
            "teu olhar é tão penetrante quanto uma faca Tramontina <3",
            "teus cabelos são tão cabeludos quanto o algodão é algodoso.",
            "ao olhar-te, sinto-me na velocidade da luz, porque meu corpo parece desintegrar-se com tua beleza.",
            "não sou pedreiro e você não é uma marmita, mas nós dois combinamos muito.",
            "se o céu e azul... e o universo é infinito... teu pai é um cabrito.",
        };

        // Gera uma frase random
        Random nRand = new Random();
        String frase = introducao[nRand.nextInt(introducao.length)] + frases[nRand.nextInt(frases.length)] +
                       "\nDe: "+p1+"\nPara: "+p2+". '3'";

        // Retorna a frase gerada
        return frase;
    }
}
