package com.example.kjh.study.exam;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapTest {


    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        // key(고유,유일성) 키(모든자료형) : 값(모든자료형)
        map.put("국어", 100);
        map.put("영어", 100);
        map.put("수학", 100);
        map.put("국어", 90);// 같은 키인 경우 기존값을 덮어쓴다.

        // 타입 (자료형 또는 클래스)
        System.out.println("국어점수는: " + map.get("국어"));
        // 평균점수 cast - casting - 형변환 ==> 이 행위 자체가 안전하지 않음!
        int 국어점수 = map.get("국어");
        int 영어점수 = map.get("영어");
        int 수학점수 = map.get("수학");
        int 총점 = 국어점수 + 영어점수 + 수학점수;
        int 평균 = 총점 / 3;
        System.out.println("총점: " + 총점);
        System.out.println("평균: " + 평균);
    }
}
