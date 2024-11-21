package pe.edu.vallegrande.inteligencia.Confi;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class Web {
    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }
}
