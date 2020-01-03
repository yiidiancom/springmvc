package com.yiidian.domain;

/**
 * 封装用户的地址信息
 * 一点教程网 - www.yiidian.com
 */
public class Address {
    private String province;
    private String city;

    public String getProvince() {
        return province;
    }
    public void setProvince(String province) {
        this.province = province;
    }
    public String getCity() {
        return city;
    }
    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "Address{" +
                "province='" + province + '\'' +
                ", city='" + city + '\'' +
                '}';
    }
}
