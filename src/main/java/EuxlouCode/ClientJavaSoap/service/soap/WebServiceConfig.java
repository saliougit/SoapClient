package EuxlouCode.ClientJavaSoap.service.soap;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.ws.client.core.WebServiceTemplate;

@Configuration
public class WebServiceConfig {

    @Bean
    public WebServiceTemplate webServiceTemplate() {
        return new WebServiceTemplate(); // Vous pouvez personnaliser la configuration ici si nécessaire
    }
}
