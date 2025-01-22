package com.example.demo.service;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.example.demo.dto.GoodsResponseDTO;
import com.example.demo.dto.UserResponseDTO;

@Service
public class UserService {

    private final RestTemplate restTemplate;

    public UserService(RestTemplateBuilder restTemplateBuilder) {
        this.restTemplate = restTemplateBuilder.build();
    }

    public UserResponseDTO getUserInfo(String userNo) {
        // Create goodsNo based on userNo
        String goodsNo = "goods-" + userNo;

        // Call the goods service
        String goodsServiceUrl = "http://localhost:8080/api/v1/goods/" + goodsNo;
        GoodsResponseDTO goodsResponse = restTemplate.getForObject(goodsServiceUrl, GoodsResponseDTO.class);

        // Map response to UserResponseDTO
        return new UserResponseDTO(
            userNo,
            "prod-" + userNo,
            goodsNo,
            goodsResponse != null ? goodsResponse.getGoodsName() : "Unknown Goods"
        );
    }
}