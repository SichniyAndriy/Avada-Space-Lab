package edu.avada.course.service;

import edu.avada.course.repository.SomeRepos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SomeService {
    @Autowired
    SomeRepos someRepos;
}
