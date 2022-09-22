//원격지 db에 있는 스키마를 query해서 view에 띄우는 코드

//application.properties에 db 설정을 마치고
//controller , entity , repository , html 4가지 속성만 있으면 된다. (dto는 없어도 동작함)

//Controller
package com.example.testproject1.controller;

import com.example.testproject1.entity.testEntity;
import com.example.testproject1.repository.testRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;


@Controller
public class testPage {

    @Autowired
    private testRepository testRepository;

    @GetMapping("/test")
    public String testPage (Model model){

        List<testEntity> data = (List<testEntity>) testRepository.findAll();
        model.addAttribute("data", data);
        return "test";
    }
}

//Entity
package com.example.testproject1.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "users")
@Getter
@Setter
@ToString
public class testEntity {

    @Id

    @Column(name = "userid", nullable = false)
    private String userid;

    @Column(name = "password", nullable = false)
    private String password;

    @Column(name = "username", nullable = false)
    private String username;

    public testEntity() {
    }

    public testEntity(String userid, String password, String username) {
        this.userid = userid;
        this.password = password;
        this.username = username;
    }
}


//Repository
package com.example.testproject1.repository;

import com.example.testproject1.entity.testEntity;
import org.springframework.data.repository.CrudRepository;

public interface testRepository extends CrudRepository<testEntity, String> {
}


//html의 경우 mustache로 controller에서 보낸 model값을 받으면 된다.
