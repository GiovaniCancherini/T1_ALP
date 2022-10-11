import java.util.*;

public class App {
    public static void main(String[] args) {
        int opcao;

        do {

            System.out.println("---|Terminal do T1|---");
            Scanner sc = new Scanner(System.in);

            System.out.println("Escolha uma opcao abaixo:");
            System.out.println("1 = Digitar manualmente entrada da gramatica.");
            System.out.println("2 = Utilizar uma entrada de gramatica setada.");
            System.out.println("0 = Sair.");
            System.out.println();
            opcao = Integer.parseInt(sc.nextLine());

            String simboloProducoes, simboloInicio;

            if (opcao == 1) {

                System.out.println("Digite abaixo os simbolos nao-terminais separados por um espaco (em maiusculas):");
                String linhaNaoTerminais = sc.nextLine();
                String[] arrayNaoTerminais = linhaNaoTerminais.split(" ");
        
                System.out.println("Digite abaixo os simbolos terminais separados por um espaco (em minusculas):");
                String linhaTerminais = sc.nextLine();
                String[] arrayTerminais = linhaTerminais.split(" ");

                System.out.println("Digite abaixo o simbolo que engloba o conjunto de producoes (Exemplo.: P):");
                simboloProducoes = sc.nextLine();

                System.out.println("Digite abaixo o simbolo de inicio de producoes (Exemplo.: S):");
                simboloInicio = sc.nextLine();

                System.out.println("Digite abaixo o conjunto de producoes que engloba a gramatica separados por um espaco (Exemplo.: S:aX|bZ):");
                String linhaConjuntoProducoes = sc.nextLine();
                String[] arrayConjuntoProducoes = linhaConjuntoProducoes.split(" ");

                //instancia a classe com o algoritimo
                Algoritmo algoritmo = new Algoritmo(arrayNaoTerminais, arrayTerminais, simboloProducoes, simboloInicio, arrayConjuntoProducoes);
                algoritmo.Executa();

            } else if (opcao == 2) { 

                String[] arrayNaoTerminais = {"S", "X", "Z"};
                String[] arrayTerminais = {"a", "b"};
                simboloProducoes = "P";
                simboloInicio = "S";
                String[] arrayConjuntoProducoes = {"S:aX|bZ", "X:bS|aX|b", "Z:aS|bZ|a"};

                //instancia a classe com o algoritimo
                Algoritmo algoritmo = new Algoritmo(arrayNaoTerminais, arrayTerminais, simboloProducoes, simboloInicio, arrayConjuntoProducoes);
                algoritmo.Executa();

            } 
            
        } while (opcao != 0);

        //sc.close();
    }
}