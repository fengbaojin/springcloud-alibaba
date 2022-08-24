package com.nacos.springcloud.service;

import org.springframework.cloud.gateway.route.RouteDefinition;

/**
 * 路由配置服务
 *
 * @author : fengbaojin
 * @date : Created in 2022/7/20 11:07
 */
public interface RouteService {

    /**
     * 清理路由
     */
    void clearRoute();

    /**
     * 添加路由配置
     *
     * @param routeDefinition
     */
    void addRoute(RouteDefinition routeDefinition);

    /**
     * 发布事件
     */
    void publish();

    /**
     * 更新路由配置
     *
     * @param routeDefinition
     */
    void update(RouteDefinition routeDefinition);

}
