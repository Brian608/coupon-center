package org.feather.coupon.template.api.beans;

/**
 * @projectName: coupon-center
 * @package: org.feather.coupon.template.api.beans
 * @className: PagedCouponTemplateInfo
 * @author: feather
 * @description: TODO
 * @since: 2023-06-02 21:10
 * @version: 1.0
 */

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * 创建优惠券模板
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class PagedCouponTemplateInfo {
    public List<CouponTemplateInfo> templates;

    public int page;

    public long total;
}
