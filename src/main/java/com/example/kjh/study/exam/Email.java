package com.example.kjh.study.exam;

public class Email {

    private String 제목;
    private String 날짜;
    private String 보낸이;
    private String 받는이;
    private String 내용;

    public Email(String 제목, String 날짜, String 보낸이, String 받는이, String 내용) {
        this.제목 = 제목;
        this.날짜 = 날짜;
        this.보낸이 = 보낸이;
        this.받는이 = 받는이;
        this.내용 = 내용;
    }

    @Override
    public String toString() {
        return "Email{" +
                "제목='" + 제목 + '\'' +
                ", 날짜='" + 날짜 + '\'' +
                ", 보낸이='" + 보낸이 + '\'' +
                ", 받는이='" + 받는이 + '\'' +
                ", 내용='" + 내용 + '\'' +
                '}';
    }

    public String get제목() {
        return 제목;
    }

    public void set제목(String 제목) {
        this.제목 = 제목;
    }

    public String get날짜() {
        return 날짜;
    }

    public void set날짜(String 날짜) {
        this.날짜 = 날짜;
    }

    public String get보낸이() {
        return 보낸이;
    }

    public void set보낸이(String 보낸이) {
        this.보낸이 = 보낸이;
    }

    public String get받는이() {
        return 받는이;
    }

    public void set받는이(String 받는이) {
        this.받는이 = 받는이;
    }

    public String get내용() {
        return 내용;
    }

    public void set내용(String 내용) {
        this.내용 = 내용;
    }
}
