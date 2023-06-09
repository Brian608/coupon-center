package org.feather.coupon.calculation.template.impl;

import lombok.extern.slf4j.Slf4j;
import org.feather.coupon.calculation.template.AbstractRuleTemplate;
import org.feather.coupon.calculation.template.RuleTemplate;
import org.springframework.stereotype.Component;

import java.util.Calendar;

/**
 * @projectName: coupon-center
 * @package: org.feather.coupon.calculation.template.impl
 * @className: LonelyNightTemplate
 * @author: feather
 * @description:
 * 在这个寂寞的夜晚，你需要金钱的陪伴
 *  * 午夜10点到次日凌晨2点之间下单，优惠金额翻倍
 * @since: 2023-06-09 16:29
 * @version: 1.0
 */

@Slf4j
@Component
public class LonelyNightTemplate extends AbstractRuleTemplate implements RuleTemplate {


    @Override
    protected Long calculateNewPrice(Long orderTotalAmount, Long shopTotalAmount, Long quota) {
        Calendar calendar = Calendar.getInstance();
        int hourOfDay = calendar.get(Calendar.HOUR_OF_DAY);

        if (hourOfDay >= 23 || hourOfDay < 2) {
            quota *= 2;
        }

        Long benefitAmount = shopTotalAmount < quota ? shopTotalAmount : quota;
        return orderTotalAmount - benefitAmount;
    }
}

