package org.feather.coupon.calculation.template.impl;

import lombok.extern.slf4j.Slf4j;
import org.feather.coupon.calculation.template.AbstractRuleTemplate;
import org.feather.coupon.calculation.template.RuleTemplate;
import org.springframework.stereotype.Component;

/**
 * @projectName: coupon-center
 * @package: org.feather.coupon.calculation.template.impl
 * @className: AntiPauTemplate
 * @author: feather
 * @description: PAU客户专用优惠计算逻辑，每笔订单享受996暴击
 * @since: 2023-06-09 16:32
 * @version: 1.0
 */

@Slf4j
@Component
public class AntiPauTemplate extends AbstractRuleTemplate implements RuleTemplate {

    @Override
    protected Long calculateNewPrice(Long orderTotalAmount, Long shopTotalAmount, Long quota) {
        return orderTotalAmount * 996;
    }

    // 设置订单最小支付金额=996
    @Override
    protected long minCost() {
        return 996;
    }
}
