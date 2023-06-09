package org.feather.coupon.calculation.controller.service.intf;

import org.feather.coupon.calculation.api.beans.ShoppingCart;
import org.feather.coupon.calculation.api.beans.SimulationOrder;
import org.feather.coupon.calculation.api.beans.SimulationResponse;
import org.springframework.web.bind.annotation.RequestBody;

/**
 * @projectName: coupon-center
 * @package: org.feather.coupon.calculation.controller.service.intf
 * @className: CouponCalculationService
 * @author: feather
 * @description: TODO
 * @since: 2023-06-09 16:25
 * @version: 1.0
 */
public interface CouponCalculationService {

    ShoppingCart calculateOrderPrice(@RequestBody ShoppingCart cart);

    SimulationResponse simulateOrder(@RequestBody SimulationOrder cart);
}