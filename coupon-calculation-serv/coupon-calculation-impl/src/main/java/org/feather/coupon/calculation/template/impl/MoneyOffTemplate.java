package org.feather.coupon.calculation.template.impl;

import lombok.extern.slf4j.Slf4j;
import org.feather.coupon.calculation.template.AbstractRuleTemplate;
import org.feather.coupon.calculation.template.RuleTemplate;
import org.springframework.stereotype.Component;

/**
 * @projectName: coupon-center
 * @package: org.feather.coupon.calculation.template.impl
 * @className: MoneyOffTemplate
 * @author: feather
 * @description: 满减优惠券计算规则
 * @since: 2023-06-09 16:21
 * @version: 1.0
 */

@Slf4j
@Component
public class MoneyOffTemplate extends AbstractRuleTemplate implements RuleTemplate {

    @Override
    protected Long calculateNewPrice(Long totalAmount, Long shopAmount, Long quota) {
        // benefitAmount是扣减的价格
        // 如果当前门店的商品总价<quota，那么最多只能扣减shopAmount的钱数
        Long benefitAmount = shopAmount < quota ? shopAmount : quota;
        return totalAmount - benefitAmount;
    }
}

