package com.mycollection.musicslist.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mycollection.musicslist.dto.MusicsDTO;
import com.mycollection.musicslist.service.MusicsService;

@RestController
@RequestMapping(value = "/musics")
public class MusicsController {
	
	@Autowired
	MusicsService musicsService;
	
	@GetMapping
	public List<MusicsDTO> findAll() {
		var result = musicsService.findAll();
		return result;
	}

}
