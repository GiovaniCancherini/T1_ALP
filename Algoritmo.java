import java.util.*;

public class Algoritmo {

    private String simboloProducoes, simboloInicio;
    private String[] arrayNaoTerminais, arrayTerminais, arrayConjuntoProducoes;

    public Algoritmo(String[] arrayNaoTerminais, String[] arrayTerminais, String simboloProducoes, String simboloInicio, String[] arrayConjuntoProducoes) {
        System.out.println("Resolvendo...");
        
        this.arrayNaoTerminais = arrayNaoTerminais;
        this.arrayTerminais = arrayTerminais;
        this.simboloProducoes = simboloProducoes;
        this.simboloInicio = simboloInicio;
        this.arrayConjuntoProducoes = arrayConjuntoProducoes;
    }

    public void Executa() {
        //TODO: metodo de execucao
        this.ToStringGramatica();
    }

    public void ToStringGramatica() {
        //TODO: G = ({ S, B, C}, { a, b }, P, S)
        System.out.println("G = (" + this.ToStringArray(arrayNaoTerminais) + ", " + 
                                this.ToStringArray(arrayTerminais) + ", " + 
                                simboloProducoes + ", " + simboloInicio + ", " + 
                                this.ToStringArray(arrayConjuntoProducoes) + ")");
        System.out.println();
    }

    public String ToStringArray(String[] array) {
        String output = "{";
        for (int i = 0; i < array.length-1; i++) {
            output += array[i] + ", ";
        }
        output += array[array.length-1] + "}";

        return output;
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