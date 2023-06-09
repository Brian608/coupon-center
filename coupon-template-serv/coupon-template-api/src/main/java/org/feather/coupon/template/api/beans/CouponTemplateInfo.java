package org.feather.coupon.template.api.beans;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.feather.coupon.template.api.beans.rules.TemplateRule;

import javax.validation.constraints.NotNull;
/**
 * @projectName: coupon-center
 * @package: org.feather.coupon.template.api
 * @className: CouponTemplateInfo
 * @author: feather
 * @description: TODO
 * @since: 2023-06-02 20:23
 * @version: 1.0
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CouponTemplateInfo {
    private Long id;

    @NotNull
    private String name;

    // 优惠券描述
    @NotNull
    private String desc;

    // 优惠券类型
    @NotNull
    private String type;

    // 适用门店 - 若无则为全店通用券
    private Long shopId;

    /** 优惠券规则 */
    @NotNull
    private TemplateRule rule;

    private Boolean available;
}
