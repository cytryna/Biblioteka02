package com.example;

import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

/**
 * Created by radek on 10.02.2016.
 */
@Component
public interface TalkRepository extends JpaRepository<Talk, Integer> {

}
