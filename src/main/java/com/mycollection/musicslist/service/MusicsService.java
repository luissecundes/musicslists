package com.mycollection.musicslist.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mycollection.musicslist.dto.MusicsDTO;
import com.mycollection.musicslist.dto.MusicsMinDTO;
import com.mycollection.musicslist.entities.Musics;
import com.mycollection.musicslist.repositories.MusicsRepository;

@Service
public class MusicsService {
	
	@Autowired
	MusicsRepository musicsRepository;

		@Transactional(readOnly = true)
		public List<MusicsMinDTO> findAll(){
			List<Musics> response = musicsRepository.findAll();
			List<MusicsMinDTO> dto = response.stream().map(x -> new MusicsMinDTO(x)).toList();
			return dto;
		}
		
		@Transactional(readOnly = true)
		public MusicsDTO findById(Long id){
			Musics result = musicsRepository.findById(id).get();
			MusicsDTO dto = new MusicsDTO(result);
			return dto;
		}
}
