package br.com.thiagoramos.minhasmusicas.main;

import br.com.thiagoramos.minhasmusicas.modelos.MinhasPreferidas;
import br.com.thiagoramos.minhasmusicas.modelos.Musica;
import br.com.thiagoramos.minhasmusicas.modelos.Podcast;

public class Main {
    public static void main(String[] args) {
        Musica minhaMusica = new Musica();
        minhaMusica.setTitulo("Brain Damage");
        minhaMusica.setCantor("Pink Floyd");

        for (int i = 0; i < 1000; i++) {
            minhaMusica.reproduz();
        }

        for (int i = 0; i < 50 ; i++) {
            minhaMusica.curtir();
        }

        Podcast meuPodcast = new Podcast();
        meuPodcast.setTitulo("Flow");
        meuPodcast.setApresentador("Igor");

        for (int i = 0; i < 5000 ; i++) {
            meuPodcast.reproduz();
        }

        for (int i = 0; i < 1000; i++) {
            meuPodcast.curtir();
        }

        MinhasPreferidas preferidas = new MinhasPreferidas();
        preferidas.incluir(meuPodcast);
        preferidas.incluir(minhaMusica);

    }
}
