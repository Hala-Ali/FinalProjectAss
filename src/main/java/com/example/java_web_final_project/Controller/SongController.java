package com.example.java_web_final_project.Controller;

import com.example.java_web_final_project.Model.Song;
import com.example.java_web_final_project.Service.SongService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static org.springframework.data.jpa.domain.AbstractPersistable_.id;

@RestController
@RequestMapping("/songs")
public class SongController {
    private final SongService songService;
    public SongController(SongService songService1){
        songService = songService1;
    }
    @GetMapping
    public List<Song> findAll(){
        return songService.findAll();
    }
    @PostMapping
    public void saveSong(@RequestBody Song song){
        songService.save(song);
    }
    @DeleteMapping("/{id}")
    public void deleteSong(@PathVariable Long id){
        songService.delete(id);
    }
    @PutMapping
    public void putSong(@RequestBody Song song){
        songService.put(song);
    }
}
