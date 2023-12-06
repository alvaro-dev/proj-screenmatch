package br.com.teste.screenmatch.model;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
@JsonIgnoreProperties(ignoreUnknown = true)
public record DadosSerie(@JsonAlias({"Title", "Titulo"}) String titulo,
                         @JsonAlias("totalSeasons") Integer totalTemporadas,
                         //, @JsonProperty("imdbVotes") String votos,
                         @JsonAlias("imdbRating") String avalicacao ){
}
