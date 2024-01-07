# 스프링 입문 토이프로젝트 정리

### <사용 스택 버전>
#### spring boot : 2.7.16
#### H2 Database : 1.4.200

## 1. 클래스 구성도
![class diagram](https://github.com/helloJosh/spring-intro-study/assets/37134368/88c0ac24-f090-408c-84d5-899a3adcd7ac)

## 2. API 설계
|Feature|Request|API|about|
|:---:|:---:|:---:|:---:|
|회원가입폼호출|GET|/members/new||
|회원가입|POST|members/new||
|회원목록조회|GET|/members||

## 3. Service 기능
![스크린샷 2024-01-07 141738](https://github.com/helloJosh/spring-intro-study/assets/37134368/14b1eba1-7115-4f61-8e76-cc10ff76cb67)
1) 회원가입
2) 중복 회원 검사
3) 모든 회원 찾기
4) 회원 찾기
   
## 4. 배운점
1) AOP, Service, Controller가 구현체를 의존하지 않고 인터페이스를 의존함으로써 DIP(의존역전의원칙)은 지켰지만 OCP(개방폐쇠의 원칙)까진 지키지 못했다.
   이것을 Spring의 Annotation으로 해결할 수 있고 객체지향 프로그래밍의 설계 원칙을 기반으로 만들어진 프레임워크인 만큼 매력적인 프레임워크라는 것을 깨닳았다.
2) View반환, API Responsebody 반환의 차이점, RestController와 Controller의 차이점을 알게되었다.
3) Controller와 View에서 모델을 주고받는 코드를 알게되었다.
