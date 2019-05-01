package com.jrimchoi;

import com.jrimchoi.entity.Person;
import com.jrimchoi.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class PersonController {

//    @Autowired
    private PersonRepository personRepository;
    @ResponseBody
    @RequestMapping("/")
    public String index() {
        List<Person> list = personRepository.findAll();
        StringBuilder sb = new StringBuilder();
        list.forEach(p->sb.append(p.getName()).append("<br>"));
        return sb.toString();
    }
}
