package com.example.topic;

import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class TopicService {
    private List<Topic> topics = Arrays.asList(
            new Topic("spring", "Spring Framework", "Spring Framework Description"),
            new Topic("Java", "Java Framework", "Java Framework Description"),
            new Topic("JavaScript", "JavaScript Framework", "JavaScript Framework Description"),
            new Topic("php", "Spring Framework", "Spring Framework Description"),
            new Topic("laravel", "Spring Framework", "Spring Framework Description")
    );

    public List<Topic> getAllTopics() {
        return topics;
    }
}
