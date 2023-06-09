package org.feather.coupon.calculation.api.beans;

import com.google.common.collect.Maps;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Map;

/**
 * @projectName: coupon-center
 * @package: org.feather.coupon.calculation.api.beans
 * @className: SimulationResponse
 * @author: feather
 * @description: TODO
 * @since: 2023-06-09 15:09
 * @version: 1.0
 */


@Data
@NoArgsConstructor
public class SimulationResponse {

    // 最省钱的coupon
    private Long bestCouponId;

    // 每一个coupon对应的order价格
    private Map<Long, Long> couponToOrderPrice = Maps.newHashMap();

}

