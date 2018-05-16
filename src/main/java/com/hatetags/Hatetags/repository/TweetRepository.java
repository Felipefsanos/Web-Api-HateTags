package com.hatetags.Hatetags.repository;

import com.hatetags.Hatetags.models.Tweets;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TweetRepository extends JpaRepository<Tweets, Long> {

}
