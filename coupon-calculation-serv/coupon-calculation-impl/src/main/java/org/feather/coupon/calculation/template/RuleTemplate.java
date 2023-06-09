package org.feather.coupon.calculation.template;

import org.feather.coupon.calculation.api.beans.ShoppingCart;

/**
 * @projectName: coupon-center
 * @package: org.feather.coupon.calculation.template
 * @className: RuleTemplate
 * @author: feather
 * @description: TODO
 * @since: 2023-06-09 16:16
 * @version: 1.0
 */

public interface RuleTemplate {

    // 计算优惠券
    ShoppingCart calculate(ShoppingCart settlement);
}

