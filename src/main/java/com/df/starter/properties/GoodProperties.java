package com.df.starter.properties;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @author 东风
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ConfigurationProperties(prefix = "helloworld")
public class GoodProperties {
    private Long goodId;

    private String goodName;

    private Long skuId;

}
