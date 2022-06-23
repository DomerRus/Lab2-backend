package ru.itmo.gateway.config;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RelocationConfig {

    @Bean
    public RouteLocator customRouteLocator(RouteLocatorBuilder builder) {
        return builder.routes()
                .route(r -> r.path("/ebay/filter/**")
//                        .filters(f -> f.prefixPath("/myPrefix"))
                        .uri("http://manufacture-facade:8083")
                )
                .build();
    }

}
