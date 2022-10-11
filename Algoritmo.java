import java.util.*;

public class Algoritmo {

    private Integer variavel;
    private List<Integer> lista;

    public Algoritmo(String[] arrayNaoTerminais, String[] arrayTerminais, String simboloProducoes, String simboloInicio, String[] arrayConjuntoProducoes) {
        System.out.println("Resolvendo...");
        
    }

    public void Executa() {
        //TODO: metodo de execucao
        
    }

    public void ToStringGramatica() {
        //TODO: G = ({ S, B, C}, { a, b }, P, S)
        System.out.print("G = ({arrayNaoTerminais}, {arrayTerminais}, simboloProducoes, simboloInicio)");
        System.out.println();
    }

    public boolean ValidaGramatica() {
        //TODO: teste se a gramática é válida ou não
        
        return false;
    }

    public void TipoDeGramatica() {
        //TODO: teste se é uma Gramática Regular ou uma Gramática Livre de Contexto
    }

    public void GeradorDeSentencas() {
        //TODO: geração de sentenças a partir das produções, como exemplo (mínimo 2).
        // Exemplo: S → aA → aaA → aaa
    }
}