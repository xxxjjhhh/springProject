//패키지 생성 src/main/java/com.example.project1/repository
//클래스(인터페이스 : Interface) 생성 HelloRepository.java (jpa crud 클래스를 상속 받기 위해서 인터페이스로 생성)

package com.example.project1.repository;

import com.example.project1.entity.helloEntity; //entity클래스 import
import org.springframework.data.repositiry.CrudRepository;
  
public interface HelloRepository extends CrudRepository<HelloEntity, Long> { //<entity이름, id값데이터타입>
  
    
}
