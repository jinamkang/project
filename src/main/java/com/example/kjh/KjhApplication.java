package com.example.kjh;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class KjhApplication {

	public static void main(String[] args) {
		SpringApplication.run(KjhApplication.class, args);
	}

}

// git init 깃 프로젝트를 초기화 (없는 경우 생성)
// -> 로컬 저장소가 생성.(현재 컴퓨터 하드에 git 저장소가 생성됨)
// git remote add 원격 저장소를 추가

// 원격저장소는 현재 https://github.com/jinamkang/project.git

// commit 커밋, -> 로컬저장소에 변경을 저장
// push 푸쉬 -> 로컬저장소에 커밋된 내용을 원격저장소로 업로드


/**
 * 커리큘럼:
 * DB CRUD(create, read, update, delete) 프레임워크: Mybatis, JPA 크게 두가지
 *
 * 프로젝트:
 * Mybatis, Oracle,
 */