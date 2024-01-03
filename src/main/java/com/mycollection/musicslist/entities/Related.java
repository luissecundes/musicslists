package com.mycollection.musicslist.entities;

import java.util.Objects;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;


@Entity
@Table(name = "tb_related")
public class Related {

	@EmbeddedId
	private RelatedPK id = new RelatedPK();
	
	private Integer position;
	
	
	public Related () {
		
	}


	public Related(Musics musics, MusicsList lists, Integer position) {
		id.setMusics(musics);
		id.setLists(lists);
		this.position = position;
	}


	public RelatedPK getId() {
		return id;
	}


	public void setId(RelatedPK id) {
		this.id = id;
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
		Related other = (Related) obj;
		return Objects.equals(id, other.id);
	}
	
	
	
}
