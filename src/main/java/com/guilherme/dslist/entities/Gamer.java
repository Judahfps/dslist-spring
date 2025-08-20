package com.guilherme.dslist.entities;

import java.util.Objects;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity /*O que essa anotacion faz? Ela vai configurar a minha class Java para que ela seja equivalente a uma tabela do meu banco de dados.*/
@Table(name = "tb_game") /* Aqui eu estou costumizando a tabela do banco.*/
public class Gamer {
	
	@Id /*Estou configurando o id para ser a chave primaria do banco*/
	@GeneratedValue(strategy = GenerationType.IDENTITY) /*Aqui estou dizendo que esse id vai ser auto incremente*/
	
	private Long id;
	private String title;
	
	@Column(name = "game_year") /*Esse nome year é uma palavra reservado do SQL, então se eu deixar assim vai dar problema, então vamos costumizar esse campo, renomeando de year para game_year.*/
	private Integer year;
	private String genre;
	private Double score;
	private String imgUrl;
	private String shortDescription;
	private String longDescription;
	
	public Gamer() {	
		
	}

	public Gamer(Long id, String title, Integer year, String genre, Double score, String imgUrl,
			String shortDescription, String longDescription) {
		// Lembrando que esse this.id e demais estar referenciando o id do object Gamer que nós criamos.
		
		this.id = id; //Aqui eu estou dizendo que o Object da class Gamer recebe o id passado como parâmentro no construtor da class, ou seja o id que o usuario vai digitar.
		this.title = title;
		this.year = year;
		this.genre = genre;
		this.score = score;
		this.imgUrl = imgUrl;
		this.shortDescription = shortDescription;
		this.longDescription = longDescription;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Integer getYear() {
		return year;
	}

	public void setYear(Integer year) {
		this.year = year;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public Double getScore() {
		return score;
	}

	public void setScore(Double score) {
		this.score = score;
	}

	public String getImgUrl() {
		return imgUrl;
	}

	public void setImgUrl(String imgUrl) {
		this.imgUrl = imgUrl;
	}

	public String getShortDescription() {
		return shortDescription;
	}

	public void setShortDescription(String shortDescription) {
		this.shortDescription = shortDescription;
	}

	public String getLongDescription() {
		return longDescription;
	}

	public void setLongDescription(String longDescription) {
		this.longDescription = longDescription;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Gamer other = (Gamer) obj;
		return Objects.equals(id, other.id);
	}
	

}
