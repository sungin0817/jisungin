package com.example.demo.controller;

import org.springframework.web.bind.annotation.*;

import com.example.demo.dto.GoodsResponseDTO;
import com.example.demo.service.GoodsService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;

@RestController
@RequestMapping("/api/v1/goods")
public class GoodsController {

    private final GoodsService goodsService;

    public GoodsController(GoodsService goodsService) {
        this.goodsService = goodsService;
    }

    @GetMapping("/{goodsNo}")
    public ResponseEntity<GoodsResponseDTO> getGoodsInfo(@PathVariable("goodsNo") String goodsNo) {
        GoodsResponseDTO response = goodsService.getGoodsInfo(goodsNo);
        return ResponseEntity.ok(response);
    }
}