package izo.wtamanagementsystem.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class ProgramSub {   //소분류
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idDetail;   //세부교육과정코드
    private String lessonName;  //교육명
    private int lessonMember;   //수강정원
    private String lessonStart; //강의시작일
    private String lessonEnd;   //강의종료일
    private int idProf; //교수id
    private String recStart;    //접수시작일
    private String recEnd;  //접수종료일
    private String lessonDay;   //수업요일
    private String lessonTime;  //수업시간
}
