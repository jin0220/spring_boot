package com.example.spring_test.domain;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Data //롬복의 어노테이션으로 모든 필드의 getter와 setter를 생성하고 toString, hashCode, equals 메소드도 생성
@Entity //클래스롤 테이블과 매핑한다고 JPA에게 알려주는 어노테이션
@Table(name = "board") //클래스에 매핑할 테이블 정보를 알려줌
public class BoardDto {

    @Id //식별자 필드, 테이블의 기본키와 매핑
    @GeneratedValue //테이블에 auto_increment 사용
    private Long boardIdx;
    private String title;
    private String contents;
    private int hitCnt;
    private String creatorId;
    private String createdDatetime;
    private String updaterId;
    private String updatedDatetime;
}
