package study.api_member;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@MapperScan(basePackages = "study.api_member.mapper")
@SpringBootApplication
public class ApiMemberApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiMemberApplication.class, args);
	}

}
