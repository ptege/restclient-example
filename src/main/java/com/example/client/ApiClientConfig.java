package com.example.client;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.beans.factory.annotation.Value;
import com.ceyoniq.client.invoker.ApiClient;

@Configuration
public class ApiClientConfig {

    @Value("${api.baseUrl:http://localhost:8080}")
    private String baseUrl;

    @Bean
    public ApiClient apiClient() {
        ApiClient client = new ApiClient();
        client.setBasePath(baseUrl);
        // customize timeouts, interceptors etc. here if needed
        return client;
    }
}
