package com.hatetags.Hatetags.resource;

import com.hatetags.Hatetags.models.Tweet;
import com.hatetags.Hatetags.repository.TweetRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/tweets")
public class TweetResource {

    @Autowired
    private TweetRepository tweetRepository;

    @GetMapping
    public ResponseEntity<?> findAll() {

         List<Tweet> tweets = tweetRepository.findAll();
         return new ResponseEntity<>(tweets,HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> findById(@PathVariable("id") Long id){

        Tweet tweet = tweetRepository.getOne(id);
        if(tweet == null){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(tweet, HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<?> save(@RequestBody Tweet tweet){

        if (tweet.getId() != 0){
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }

        tweet = tweetRepository.save(tweet);

        return new ResponseEntity<>(tweet,HttpStatus.CREATED);

    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> delete(@PathVariable("id") Long id){

        try {
            tweetRepository.deleteById(id);

        }catch (EmptyResultDataAccessException ex){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }

        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
