package org.feather.coupon.calculation.template.impl;

import lombok.extern.slf4j.Slf4j;
import org.feather.coupon.calculation.template.AbstractRuleTemplate;
import org.feather.coupon.calculation.template.RuleTemplate;
import org.springframework.stereotype.Component;

import java.util.Random;

/**
 * @projectName: coupon-center
 * @package: org.feather.coupon.calculation.template.impl
 * @className: RandomReductionTemplate
 * @author: feather
 * @description: 随机减钱
 * @since: 2023-06-09 16:28
 * @version: 1.0
 */

@Slf4j
@Component
public class RandomReductionTemplate extends AbstractRuleTemplate implements RuleTemplate {

    @Override
    protected Long calculateNewPrice(Long totalAmount, Long shopAmount, Long quota) {
        // 计算使用优惠券之后的价格
        Long maxBenefit = Math.min(shopAmount, quota);
        int reductionAmount = new Random().nextInt(maxBenefit.intValue());
        Long newCost = totalAmount - reductionAmount;

        log.debug("original price={}, new price={}", totalAmount, newCost );
        return newCost;
    }
}

