package com.mycollection.musicslist.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mycollection.musicslist.dto.MusicsDTO;
import com.mycollection.musicslist.entities.Musics;
import com.mycollection.musicslist.repositories.MusicsRepository;

@Service
public class MusicsService {
	
	@Autowired
	MusicsRepository musicRepository;

		public List<MusicsDTO> findAll(){
			List<Musics> response = musicRepository.findAll();
			List<MusicsDTO> dto = response.stream().map(x -> new MusicsDTO(x)).toList();
			return dto;
		}
}
