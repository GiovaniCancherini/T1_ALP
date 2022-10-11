import java.util.*;

public class Algoritmo {

    private Integer variavel;
    private List<Integer> listaAtual;

    public Algoritmo(String[] arrayNaoTerminais, String[] arrayTerminais, String simboloProducoes, String simboloInicio, String[] arrayConjuntoProducoes) {
        System.out.println("Resolvendo...");
        
        
    }

    public void Executa() {
        
        printlista();
    }


    public void printlista() {
        System.out.print("Lista: ");
        for (Integer integer : listaAtual) {
            System.out.print(integer+" ");
        }
        System.out.println();
    }
}