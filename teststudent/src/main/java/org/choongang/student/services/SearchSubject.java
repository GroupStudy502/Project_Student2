package org.choongang.student.services;

import lombok.Builder;
import lombok.Data;
@Data
@Builder
public class SearchSubject {
    private long subCode;
    private String subNm;
    private String teacherNm;
    private String subDiv;
}
//실행