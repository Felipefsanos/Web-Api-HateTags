package com.hatetags.Hatetags.resource;

import com.hatetags.Hatetags.models.Tweets;
import com.hatetags.Hatetags.repository.TweetRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/tweets")
public class TweetResource {

    @Autowired
    private TweetRepository tweetRepository;

    @GetMapping
    public ResponseEntity<?> findAll() {
         List<Tweets> tweets = tweetRepository.findAll();

         return new ResponseEntity<>(tweets,HttpStatus.OK);
    }
}
