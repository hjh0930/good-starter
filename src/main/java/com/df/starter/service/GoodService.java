package com.df.starter.service;

import com.df.starter.properties.GoodProperties;
import lombok.Data;

/**
 * @author 东风
 */
@Data
public class GoodService {
    private GoodProperties goodProperties;

    public GoodService(GoodProperties goodProperties) {
        this.goodProperties = goodProperties;
    }
    public String getGood(GoodProperties goodProperties) {
        return goodProperties.getGoodId()+":"+goodProperties.getGoodName()+":"+goodProperties.getSkuId();
    }
}
