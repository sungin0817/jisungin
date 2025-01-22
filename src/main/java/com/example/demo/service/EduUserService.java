package com.example.demo.service;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.example.demo.dto.GoodsResponse;
import com.example.demo.dto.UserResponse;

@Service
public class EduUserService {

    private final RestTemplate restTemplate;

    public EduUserService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public UserResponse getUser(int userNo) {
        // goods 서비스 호출
        String goodsUrl = "http://edu-goods/api/v1/goods/" + userNo;
        GoodsResponse goodsResponse = restTemplate.getForObject(goodsUrl, GoodsResponse.class);

        // 사용자 응답 구성
        return new UserResponse(userNo, "prod-user" + userNo, goodsResponse.getGoodsNo(), goodsResponse.getGoodsName());
    }
}