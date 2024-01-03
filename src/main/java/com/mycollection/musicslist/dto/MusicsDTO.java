package com.mycollection.musicslist.dto;

import org.springframework.beans.BeanUtils;

import com.mycollection.musicslist.entities.Musics;

public class MusicsDTO {

	private Long id;
	private String nome;
	private String artista;
	private Integer anoLancamento;
	private String genero;
	private String urlCapaAlbum;
	
	public MusicsDTO () {
		
	}

	public MusicsDTO(Musics entity) {
		BeanUtils.copyProperties(entity, this);
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getArtista() {
		return artista;
	}

	public void setArtista(String artista) {
		this.artista = artista;
	}

	public Integer getAnoLancamento() {
		return anoLancamento;
	}

	public void setAnoLancamento(Integer anoLancamento) {
		this.anoLancamento = anoLancamento;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getUrlCapaAlbum() {
		return urlCapaAlbum;
	}

	public void setUrlCapaAlbum(String urlCapaAlbum) {
		this.urlCapaAlbum = urlCapaAlbum;
	}
	
	
	
	
}
