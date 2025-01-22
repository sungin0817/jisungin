package com.example.demo.dto;
public class GoodsResponseDTO {

    private String goodsNo;
    private String goodsName;
    
    public GoodsResponseDTO() {
    }

    // Constructor
    public GoodsResponseDTO(String goodsNo, String goodsName) {
        this.goodsNo = goodsNo;
        this.goodsName = goodsName;
    }

    // Getters and Setters
    public String getGoodsNo() {
        return goodsNo;
    }

    public void setGoodsNo(String goodsNo) {
        this.goodsNo = goodsNo;
    }

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }
}