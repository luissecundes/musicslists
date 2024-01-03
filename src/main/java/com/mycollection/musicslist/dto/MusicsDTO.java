package com.mycollection.musicslist.dto;

import com.mycollection.musicslist.entities.Musics;

public class MusicsDTO {
	
	private Long id;
	private String nome;
	private String artista;
	
	public MusicsDTO () {
	}

	public MusicsDTO(Musics entity) {
		id = entity.getId();
		nome = entity.getNome();
		artista = entity.getArtista();
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
	
	
}
