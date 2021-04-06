package david.augusto.luan;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.data.jpa.JpaRepositoriesAutoConfiguration;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableTransactionManagement
public class BancovirtualApplication {

	public static void main(String[] args) {
		SpringApplication.run(BancovirtualApplication.class, args);
	}

}
