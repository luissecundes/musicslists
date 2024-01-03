package com.mycollection.musicslist.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mycollection.musicslist.dto.MusicsListDTO;
import com.mycollection.musicslist.service.MusicsListsService;

@RestController
@RequestMapping(value = "/lists")
public class MusicsListsController {
	
	@Autowired
	private MusicsListsService musicsListsService;
	
	
	@GetMapping
	public List<MusicsListDTO> findall () {
		var result = musicsListsService.findAll();
		return result;
	}
	

}