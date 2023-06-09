package org.feather.coupon.calculation.controller;

import com.alibaba.fastjson.JSON;
import lombok.extern.slf4j.Slf4j;
import org.feather.coupon.calculation.api.beans.ShoppingCart;
import org.feather.coupon.calculation.api.beans.SimulationOrder;
import org.feather.coupon.calculation.api.beans.SimulationResponse;
import org.feather.coupon.calculation.controller.service.intf.CouponCalculationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @projectName: coupon-center
 * @package: org.feather.coupon.calculation.controller
 * @className: CouponCalculationController
 * @author: feather
 * @description: TODO
 * @since: 2023-06-09 16:24
 * @version: 1.0
 */

@Slf4j
@RestController
@RequestMapping("calculator")
public class CouponCalculationController {

    @Autowired
    private CouponCalculationService calculationService;

    // 优惠券结算
    @PostMapping("/checkout")
    @ResponseBody
    public ShoppingCart calculateOrderPrice(@RequestBody ShoppingCart settlement) {
        log.info("do calculation: {}", JSON.toJSONString(settlement));
        return calculationService.calculateOrderPrice(settlement);
    }

    // 优惠券列表挨个试算
    // 给客户提示每个可用券的优惠额度，帮助挑选
    @PostMapping("/simulate")
    @ResponseBody
    public SimulationResponse simulate(@RequestBody SimulationOrder simulator) {
        log.info("do simulation: {}", JSON.toJSONString(simulator));
        return calculationService.simulateOrder(simulator);
    }
}
