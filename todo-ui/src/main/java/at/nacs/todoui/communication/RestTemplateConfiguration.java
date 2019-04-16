package at.nacs.todoui.communication;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class RestTemplateConfiguration {
    @Bean
    RestTemplate restTemplate() {
        return new RestTemplate();
    }
}