package com.mycollection.musicslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mycollection.musicslist.entities.MusicsList;

public interface MusicsListsRepository extends JpaRepository<MusicsList, Long> {

}
