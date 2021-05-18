# Spring Session

```sh
임베디드 톰캣은 고유한 세션아이디 즉, JSESSIONID를 웹 브라우저에 쿠키로 전달한다.
이후, 클라이언트에서는 서버에 요청할 때 해당 JSESSIONID를 함께 전달한다.
서버는 전달받은 JSESSIONID를 서버에 이미 저장되어 있는 정보와 비교해 상태를 지속적으로 유지하는 것처럼 만들어준다.

Spring 엔드포인트에서 HttpSession 매개변수를 정의하면, HttpSession 인터페이스 구현체인 StandardSession 클래스 객체를 주입받는다.
HttpSession 인터페이스의 getId() 메소드를 호출하면 JSESSIONID 쿠키의 정보를 확인할 수 있다.
```


## Reference
[에디](https://brunch.co.kr/@springboot/491)