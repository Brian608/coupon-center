package org.feather.coupon.calculation.template.impl;

import lombok.extern.slf4j.Slf4j;
import org.feather.coupon.calculation.api.beans.ShoppingCart;
import org.feather.coupon.calculation.template.AbstractRuleTemplate;
import org.feather.coupon.calculation.template.RuleTemplate;
import org.springframework.stereotype.Component;

/**
 * @projectName: coupon-center
 * @package: org.feather.coupon.calculation.template.impl
 * @className: DummyTemplate
 * @author: feather
 * @description: TODO
 * @since: 2023-06-09 16:30
 * @version: 1.0
 */

@Slf4j
@Component
public class DummyTemplate extends AbstractRuleTemplate implements RuleTemplate {

    @Override
    public ShoppingCart calculate(ShoppingCart order) {
        // 获取订单总价
        Long orderTotalAmount = getTotalPrice(order.getProducts());

        order.setCost(orderTotalAmount);
        return order;
    }


    @Override
    protected Long calculateNewPrice(Long orderTotalAmount, Long shopTotalAmount, Long quota) {
        return orderTotalAmount;
    }
}

