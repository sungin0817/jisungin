package com.example.demo.dto;
public class UserResponseDTO {

    private String userNo;
    private String userName;
    private String goodsNo;
    private String goodsName;

    public UserResponseDTO() {
    }
    
    // Constructor
    public UserResponseDTO(String userNo, String userName, String goodsNo, String goodsName) {
        this.userNo = userNo;
        this.userName = userName;
        this.goodsNo = goodsNo;
        this.goodsName = goodsName;
    }

    // Getters and Setters
    public String getUserNo() {
        return userNo;
    }

    public void setUserNo(String userNo) {
        this.userNo = userNo;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

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
