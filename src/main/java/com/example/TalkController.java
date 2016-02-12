package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by radek on 10.02.2016.
 */
@RestController
@RequestMapping("/talks")
public class TalkController {

    private final TalkRepository talkRepository;

    @Autowired
    public TalkController(TalkRepository talkRepository) {
        this.talkRepository = talkRepository;
    }

    @RequestMapping(method = RequestMethod.POST)
    public void addTopic(@RequestBody Talk talk) {
        talkRepository.save(talk);
    }

    @RequestMapping(method = RequestMethod.GET)
    public List<Talk> getAll() {
        return talkRepository.findAll();
    }
}
