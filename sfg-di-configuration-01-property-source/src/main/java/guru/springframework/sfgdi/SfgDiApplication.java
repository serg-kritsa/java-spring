package guru.springframework.sfgdi;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.boot.SpringApplication;

import guru.springframework.sfgdi.datasource.FakeDataSource;

@SpringBootApplication
public class SfgDiApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(SfgDiApplication.class, args);

		FakeDataSource fakeDataSource = ctx.getBean(FakeDataSource.class);
        System.out.println("2) >>>>>>>>>>>>>>>>>> reading values from @PropertySource file");
		System.out.println(fakeDataSource.getUsername());
		System.out.println(fakeDataSource.getPassword());
		System.out.println(fakeDataSource.getJdbcurl());

	}

}
