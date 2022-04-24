package com.example.kjh.study.exam;

import java.util.ArrayList;
import java.util.List;

public class ListTest {

    public static void main(String[] args) {
        List<Email> list = new ArrayList<>();
        // "a", "b", "c", "d", "e" list 목록
        Email email1 = new Email("제목1", "1", "닌자", "거북이", "하하하");
        Email email2 = new Email("제목2", "2", "홍길", "동", "하하하");
        Email email3 = new Email("제목3", "3", "임꺽", "정", "하하하");
        Email email4 = new Email("제목4", "4", "하하", "바보", "하하하");
        Email email5 = new Email("제목5", "5", "경찰", "도둑", "하하하");
        list.add(email1);//인덱스: 0
        list.add(email2);//인덱스: 1
        list.add(email3);//인덱스: 2
        list.add(email4);//인덱스: 3
        list.add(email5);//인덱스: 4
        // 제목, 날짜, 보낸이, 받는이, 내용

        for (int i = 0; i < list.size(); i++) {
            // 제목만 찍고 싶음
            Email tempEmail = list.get(i);
            System.out.println(tempEmail.get제목());
        }
//        for (Object obj : list) {
//            System.out.println(obj);
//        }
    }

}
