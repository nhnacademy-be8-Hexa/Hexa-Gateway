package com.nhnacademy.hexagateway.feignclient;

import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(name = "shoppingmallApi", url = "http://localhost:8081/api")
public interface ShoppingmallApi {

}
