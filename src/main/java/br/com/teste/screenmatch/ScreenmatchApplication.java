package br.com.teste.screenmatch;

import br.com.teste.screenmatch.model.DadosEpisodio;
import br.com.teste.screenmatch.model.DadosSerie;
import br.com.teste.screenmatch.model.DadosTemporada;
import br.com.teste.screenmatch.principal.Principal;
import br.com.teste.screenmatch.service.ConsumoApi;
import br.com.teste.screenmatch.service.ConverteDados;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class ScreenmatchApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(ScreenmatchApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Principal principal = new Principal();
		principal.exibemenu();
	}
}
