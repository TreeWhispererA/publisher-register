package io.relectoring.publisher_register.controller;

import io.relectoring.publisher_register.model.Publisher;
import io.relectoring.publisher_register.repository.PublisherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
@RestController
@CrossOrigin
@RequestMapping("/publisher")

public class PublisherController {
    @Autowired
    private PublisherRepository publisherRepository;

    @PostMapping("/create")
    public Publisher create(@RequestBody Publisher publisher){
        return publisherRepository.save(publisher);
    }

    @GetMapping("/all")
    public List<Publisher> getAllAuthor(){
        return publisherRepository.findAll();
    }

    @GetMapping("/{id}")
    public Optional<Publisher> findOneById(@PathVariable String id){
        return publisherRepository.findById(id);
    }

    @PutMapping("/update")
    public Publisher update(@RequestBody Publisher publisher){
        return publisherRepository.save(publisher);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteById(@PathVariable String id){
        publisherRepository.deleteById(id);
    }
}
