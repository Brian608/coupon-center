package org.feather.coupon.template.convert;


import org.feather.coupon.template.api.beans.CouponTemplateInfo;

/**
 * @projectName: coupon-center
 * @package: org.feather.coupon.template.convert
 * @className: CouponTemplateConverter
 * @author: feather
 * @description: TODO
 * @since: 2023-06-02 21:14
 * @version: 1.0
 */

public class CouponTemplateConverter {
    public static CouponTemplateInfo convertToTemplateInfo(org.feather.coupon.template.dao.entity.CouponTemplate template) {

        return CouponTemplateInfo.builder()
                .id(template.getId())
                .name(template.getName())
                .desc(template.getDescription())
                .type(template.getCategory().getCode())
                .shopId(template.getShopId())
                .available(template.getAvailable())
                .rule(template.getRule())
                .build();
    }
}
