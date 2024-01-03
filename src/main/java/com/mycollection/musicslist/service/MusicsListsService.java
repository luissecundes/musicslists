package com.mycollection.musicslist.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mycollection.musicslist.dto.MusicsListDTO;
import com.mycollection.musicslist.dto.MusicsMinDTO;
import com.mycollection.musicslist.entities.MusicsList;
import com.mycollection.musicslist.repositories.MusicsListsRepository;

@Service
public class MusicsListsService {
	
	@Autowired
	MusicsListsRepository musicsListsRepository;

		@Transactional(readOnly = true)
		public List<MusicsListDTO> findAll(){
			List<MusicsList> response = musicsListsRepository.findAll();
			List<MusicsListDTO> dto = response.stream().map(x -> new MusicsListDTO(x)).toList();
			return dto;
		}
		
}
