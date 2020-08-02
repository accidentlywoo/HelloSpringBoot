package hello.hellospring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HelloSpringApplication {
// 기본 설정에서는 @SpringBootApplication 가 붙은 Starting Point의 패키지 기준 -> hello.hellospring 하위 패키지의 클래스들만 Component Scanning을한다.
	public static void main(String[] args) {
		SpringApplication.run(HelloSpringApplication.class, args);
	}

}
