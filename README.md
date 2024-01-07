# 회원 등록, 조회 웹사이트 토이프로젝트

## 사용 스택 버전
### spring boot : 2.7.16
### H2 Database : 1.4.200

## 1. 구성도
### AOP       Jdbc, JdbcTemplate, JPA, Spring DataJPA
### Controller -> Service -> Repository Interface -> h2 DB
### Domain

## 2. AOP
|적용패키지|적용기능|
|:---:|:---:|
|hello/hellospring|프록시 시작 시간부터 실제 빈 끝나는 시간|

## 3. Controller
### helloController
|HTTP요청메서드|URL|VIEW|MODEL|
|:---:|:---:|:---:|:---:|
|GET|hello|hello.html|hello!!!|
|GET|hello-mvc?name=Param|hello-template.html|name|
|GET|hello-string?name=Param|hello Param|name|
|GET|hello-api?name=Param|hello.json|hello|

## 배운점
