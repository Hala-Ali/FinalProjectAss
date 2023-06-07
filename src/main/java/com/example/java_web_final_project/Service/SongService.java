package com.example.java_web_final_project.Service;

import com.example.java_web_final_project.Model.Song;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SongService {
    private final SongRepository songRepository;

    public SongService(SongRepository repository) {
        songRepository = repository;
    }
    public List<Song> findAll(){
        return songRepository.findAll();
    }
    public void save(Song song){
        songRepository.save(song);
    }
    public void put(Song song){
        Long id = song.getId();
        Song foundSong = songRepository.getReferenceById(id);
        foundSong.setName(song.getName());
        foundSong.setTitle(song.getTitle());
        songRepository.save(foundSong);
    }
    public void delete(Long id){
        songRepository.deleteById(id);
    }
}
