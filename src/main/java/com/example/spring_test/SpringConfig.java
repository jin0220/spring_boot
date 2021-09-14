package com.example.spring_test;

import com.example.spring_test.repository.BoardRepository;
import com.example.spring_test.repository.JpaBoardRepository;
import com.example.spring_test.service.BoardService;
import com.example.spring_test.service.BoardServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.transaction.PlatformTransactionManager;

import javax.persistence.EntityManager;
import java.util.Properties;

@Configuration
public class SpringConfig {

//    private EntityManager em;
//
//    @Autowired
//    public SpringConfig(EntityManager em) {
//        this.em = em;
//    }
//
//    @Bean
//    public BoardRepository boardRepository(){
//        return new JpaBoardRepository(em);
//    }

}
