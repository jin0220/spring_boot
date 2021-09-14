package com.example.spring_test.domain;

import com.sun.istack.NotNull;
import lombok.Data;

import javax.persistence.*;
import java.util.Date;


@Data //롬복의 어노테이션으로 모든 필드의 getter와 setter를 생성하고 toString, hashCode, equals 메소드도 생성
@Entity //클래스롤 테이블과 매핑한다고 JPA에게 알려주는 어노테이션
@Table(name = "board") //클래스에 매핑할 테이블 정보를 알려줌
public class Board {

    @Id //식별자 필드, 테이블의 기본키와 매핑
    @GeneratedValue //테이블에 auto_increment 사용
    private Long boardIdx; //글 번호

    @Column(nullable = false) //테이블 생성시 not null 적용
    private String title; //제목

    @NotNull //@Column(nullable = false)와 똑같이 not null을 적용해준다.
            // 둘의 차이점은 nullable = false는 유효성 검사를 해주지 않지만, @NotNull는 유효성 검사를 해준다.
    private String contents; //내용

    @Column(nullable = false, columnDefinition = "0") //columnDefinition 기본값 설정
    private int hitCnt; //조회수

    @Column(nullable = false)
    private String creatorId; //작성자

    @Column(nullable = false)
    @Temporal(TemporalType.TIMESTAMP) //날짜와 시간
    private Date createdDatetime; //작성시간

    private String updaterId; //수정자

    @Temporal(TemporalType.TIMESTAMP)
    private Date updatedDatetime; //수정시간

    @Column(nullable = false, columnDefinition = "N")
    private String deleted_yn; //삭제 여부부
}
