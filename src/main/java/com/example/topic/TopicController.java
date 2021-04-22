package com.example.topic;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class TopicController {
    @RequestMapping("/topics")
    public List<Topic> getAllTopics() {
        return Arrays.asList(
                new Topic("spring","Spring Framework","Spring Framework Description"),
                new Topic("Java","Java Framework","Java Framework Description"),
                new Topic("JavaScript","JavaScript Framework","JavaScript Framework Description"),
                new Topic("php","Spring Framework","Spring Framework Description"),
                new Topic("laravel","Spring Framework","Spring Framework Description")
        );
    }
}
