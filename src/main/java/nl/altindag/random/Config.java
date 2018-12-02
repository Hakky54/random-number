package nl.altindag.random;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;

@Configuration
public class Config {

    @Bean
    public SecureRandom secureRandom() throws NoSuchAlgorithmException {
        return SecureRandom.getInstanceStrong();
    }

}
