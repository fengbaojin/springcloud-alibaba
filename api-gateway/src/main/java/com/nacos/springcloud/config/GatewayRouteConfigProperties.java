package com.nacos.springcloud.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @author : fengbaojin
 * @date : Created in 2022/7/20 14:44
 */
@ConfigurationProperties(prefix = "spring.cloud.gateway.dynamic-route")
@Component
@Data
public class GatewayRouteConfigProperties {

    private String dataId;

    private String group;

    private String namespace;
}
