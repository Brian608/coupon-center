package org.feather.coupon.calculation.api.beans;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.feather.coupon.template.api.beans.CouponInfo;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.util.List;

/**
 * @projectName: coupon-center
 * @package: org.feather.coupon.calculation.api.beans
 * @className: SimulationOrder
 * @author: feather
 * @description: 试算最优的优惠券
 * @since: 2023-06-09 15:08
 * @version: 1.0
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
public class SimulationOrder {

    @NotEmpty
    private List<Product> products;

    @NotEmpty
    private List<Long> couponIDs;

    private List<CouponInfo> couponInfos;

    @NotNull
    private Long userId;
}
