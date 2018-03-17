package api.server;

import feign.Request;
import feign.Retryer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class ApiApplication {
    @Bean
    Retryer feignRetry() {
        return Retryer.NEVER_RETRY;
    }

    @Bean
    Request.Options feignOptions() {
        return new Request.Options(10 * 1000, 10 * 1000);
    }

    public static void main(String[] args) {
        SpringApplication.run(ApiApplication.class, args);
    }
}
