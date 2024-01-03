package com.mycollection.musicslist.dto;

import org.springframework.beans.BeanUtils;

import com.mycollection.musicslist.entities.MusicsList;

public class MusicsListDTO {

	private Long id;
	private String name;
	
	public MusicsListDTO() {
		
	}

	public MusicsListDTO(MusicsList entity) {
		BeanUtils.copyProperties(entity, this);
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}
