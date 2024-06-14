package br.com.thiagoramos.minhasmusicas.modelos;

public class MinhasPreferidas {

    public void incluir(Audio audio) {
        if(audio.getClassificacao() >= 9){
            System.out.println(audio.getTitulo() + " é considerado sucesso absoluto");
        } else {
            System.out.println(audio.getTitulo() + " também é um dos que está sendo curtido");
        }
    }
}
