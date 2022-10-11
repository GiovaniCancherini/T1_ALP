import java.util.*;

public class App {
    public static void main(String[] args) {
        
        System.out.println("---|Terminal do T1|---");
        Scanner sc = new Scanner(System.in);

        System.out.println("Escolha uma opção abaixo:");
        System.out.println("1 = Digitar manualmente entrada da grámatica.");
        System.out.println("2 = Utilizar uma entrada de grámatica setada.");
        System.out.println("0 = Sair.");
        System.out.println();
        int opcao = Integer.parseInt(sc.nextLine());

        while (opcao != 0) {

            String simboloProducoes, simboloInicio;

            if (opcao == 1) {

                System.out.println("Digite abaixo os símbolos não-terminais separados por um espaço (em maiúsculas):");
                String linhaNaoTerminais = sc.nextLine();
                String[] arrayNaoTerminais = linhaNaoTerminais.split(" ");
        
                System.out.println("Digite abaixo os símbolos terminais separados por um espaço (em minúsculas):");
                String linhaTerminais = sc.nextLine();
                String[] arrayTerminais = linhaTerminais.split(" ");

                System.out.println("Digite abaixo o símbolo que engloba o conjunto de produções (Exemplo.: P):");
                simboloProducoes = sc.nextLine();

                System.out.println("Digite abaixo o símbolo de início de produções (Exemplo.: S):");
                simboloInicio = sc.nextLine();

                System.out.println("Digite abaixo o conjunto de produções que engloba a gramática:");
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
        }

        sc.close();
    }
}