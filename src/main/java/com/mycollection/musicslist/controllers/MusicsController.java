package com.mycollection.musicslist.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mycollection.musicslist.dto.MusicsDTO;
import com.mycollection.musicslist.dto.MusicsMinDTO;
import com.mycollection.musicslist.service.MusicsService;

@RestController
@RequestMapping(value = "/musics")
public class MusicsController {
	
	@Autowired
	MusicsService musicsService;
	
	@GetMapping
	public List<MusicsMinDTO> findAll() {
		var result = musicsService.findAll();
		return result;
	}
	
	@GetMapping(value = "/{id}")
	public MusicsDTO findById (@PathVariable Long id) {
		MusicsDTO result = musicsService.findById(id);
		return result;
	}

}
