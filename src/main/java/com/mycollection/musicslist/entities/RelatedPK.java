package com.mycollection.musicslist.entities;

import java.util.Objects;

import jakarta.persistence.Embeddable;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Embeddable
public class RelatedPK {

	@ManyToOne
	@JoinColumn(name = "musics_id")
	private Musics musics;
	
	@ManyToOne
	@JoinColumn(name = "lists_id")
	private MusicsList lists;
	
	public RelatedPK() {
		
	}

	public RelatedPK(Musics musics, MusicsList lists) {
		this.musics = musics;
		this.lists = lists;
	}

	public Musics getMusics() {
		return musics;
	}

	public void setMusics(Musics musics) {
		this.musics = musics;
	}

	public MusicsList getLists() {
		return lists;
	}

	public void setLists(MusicsList lists) {
		this.lists = lists;
	}

	@Override
	public int hashCode() {
		return Objects.hash(lists, musics);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		RelatedPK other = (RelatedPK) obj;
		return Objects.equals(lists, other.lists) && Objects.equals(musics, other.musics);
	}
	
	
}
