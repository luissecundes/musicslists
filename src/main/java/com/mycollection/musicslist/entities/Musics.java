package com.mycollection.musicslist.entities;

import java.util.Objects;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name = "tb_musics")
public class Musics {

		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private Long id;
		private String nome;
		private String artista;
		private Integer anoLancamento;
		private String genero;
		private String urlCapaAlbum;
		
		public Musics() {			
		}

		public Musics(Long id, String nome, String artista, Integer anoLancamento, String genero, String urlCapaAlbum) {
			this.id = id;
			this.nome = nome;
			this.artista = artista;
			this.anoLancamento = anoLancamento;
			this.genero = genero;
			this.urlCapaAlbum = urlCapaAlbum;
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
			Musics other = (Musics) obj;
			return Objects.equals(id, other.id);
		}
		
		
}
