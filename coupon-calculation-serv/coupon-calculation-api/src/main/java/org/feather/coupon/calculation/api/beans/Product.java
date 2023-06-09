package org.feather.coupon.calculation.api.beans;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @projectName: coupon-center
 * @package: org.feather.coupon.calculation.api.beans
 * @className: Product
 * @author: feather
 * @description: TODO
 * @since: 2023-06-09 15:02
 * @version: 1.0
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Product {

    // 你可以试着搭建一个商品中心，用来存储商品信息，逐步完善这个应用
    private Long productId;

    // 商品的价格
    private long price;

    // 商品在购物车里的数量
    private Integer count;

    // 商品销售的门店
    private Long shopId;

}

