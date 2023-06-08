package com.example.java_web_final_project.Service;

import com.example.java_web_final_project.Model.Song;
import com.example.java_web_final_project.Model.songDTO;
import jakarta.persistence.metamodel.SingularAttribute;
import org.springframework.data.jpa.domain.AbstractPersistable;
import org.springframework.stereotype.Service;

import java.io.Serializable;
import java.util.List;

import static org.springframework.data.jpa.domain.AbstractPersistable_.id;

@Service


public class SongService {
    private final SongRepository repository;

    public SongService(SongRepository songRepository) {
          repository= songRepository;
    }
    public List<Song> findAll(){
        return repository.findAll();
                   }
    public void save(songDTO newSong) {
        Song songToAdd = new Song();
        songToAdd.setName(newSong.name());
        songToAdd.setTitle(newSong.title());

        repository.save(songToAdd);
    }
    //public void addSong(songDTO newSong) {
      //  Song songToAdd = new Song();

        public void putSong(Song putSong){
            Long id = putSong.getId();
            Song foundSong = repository.findById(id).orElseThrow();
            //getReferenceById(id);
            foundSong.setName(putSong.getName());
            foundSong.setTitle(putSong.getTitle());
            repository.save(foundSong);
        }


        public void delete(Long id){
            repository.deleteById(id);
        }

    public void putSong(songDTO song, Long id) {

        Song foundSong = repository.findById(id).orElseThrow();
        //getReferenceById(id);
        foundSong.setName(song.name());
        foundSong.setTitle(song.title());
        repository.save(foundSong);
    }

}


