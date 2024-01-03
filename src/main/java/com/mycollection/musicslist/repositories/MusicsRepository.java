package com.mycollection.musicslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mycollection.musicslist.entities.Musics;

public interface MusicsRepository extends JpaRepository<Musics, Long> {

}
