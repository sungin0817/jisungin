package com.example.demo.service;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.example.demo.dto.GoodsResponseDTO;
import com.example.demo.dto.UserResponseDTO;

@Service
public class GoodsService {

    public GoodsResponseDTO getGoodsInfo(String goodsNo) {
        // Simulate logic to get goods information
        String goodsName = "goods-prod-" + goodsNo;

        return new GoodsResponseDTO(goodsNo, goodsName);
    }
}