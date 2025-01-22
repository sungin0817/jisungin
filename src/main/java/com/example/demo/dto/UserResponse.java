package com.example.demo.dto;

public class UserResponse {
    private int userNo;
    private String userName;
    private int goodsNo;
    private String goodsName;

    public UserResponse(int userNo, String userName, int goodsNo, String goodsName) {
        this.setUserNo(userNo);
        this.setUserName(userName);
        this.setGoodsNo(goodsNo);
        this.setGoodsName(goodsName);
    }

	public int getUserNo() {
		return userNo;
	}

	public void setUserNo(int userNo) {
		this.userNo = userNo;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public int getGoodsNo() {
		return goodsNo;
	}

	public void setGoodsNo(int goodsNo) {
		this.goodsNo = goodsNo;
	}

	public String getGoodsName() {
		return goodsName;
	}

	public void setGoodsName(String goodsName) {
		this.goodsName = goodsName;
	}

    // Getters and Setters
}