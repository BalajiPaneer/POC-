package com.sample.apiGatewayDB;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.gateway.filter.GatewayFilterChain;
import org.springframework.cloud.gateway.filter.GlobalFilter;
import org.springframework.stereotype.Component;
import org.springframework.web.server.ServerWebExchange;
import reactor.core.publisher.Mono;

@Component
public class GlobalPreFilter implements GlobalFilter {

    final Logger logger = LoggerFactory.getLogger(GlobalPreFilter.class);


    @Override
    public Mono<Void> filter(ServerWebExchange exchange, GatewayFilterChain chain) {
        logger.info("Global Pre Filter executed");
        var exchangevalue = exchange.getRequest().mutate().header("name","globalHeader").build();
        return chain.filter(exchange.mutate().request(exchangevalue).build());
    }
}
