package nl.altindag.random;

import java.util.Random;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.bcrypt.BCrypt;

@Configuration
public class Config {

    @Bean
    public Random random() {
        return new Random();
    }

}
