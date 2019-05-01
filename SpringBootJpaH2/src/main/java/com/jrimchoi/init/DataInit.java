package com.jrimchoi.init;

import com.jrimchoi.entity.Person;
import com.jrimchoi.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataInit implements ApplicationRunner {
    private PersonRepository personRepository;
//    @Autowired
//    public DataInit(PersonRepository personRepository)
//    {
//
//    }
    @Override
    public void run(ApplicationArguments args)
    {
        long count = personRepository.count();
        if(count == 0)
        {
            Person p = new Person();
            p.setName("jungrim.choi");
            personRepository.save(p);
            Person p2 = new Person();
            p2.setName("jrimchoi");
            personRepository.save(p2);
        }
    }

}
