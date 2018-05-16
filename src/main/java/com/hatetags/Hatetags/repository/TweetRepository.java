package com.hatetags.Hatetags.repository;

import com.hatetags.Hatetags.models.Tweet;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TweetRepository extends JpaRepository<Tweet, Long> {

}
