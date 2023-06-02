package org.feather.coupon.template.api.beans;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
/**
 * @projectName: coupon-center
 * @package: org.feather.coupon.template.api.beans
 * @className: CouponInfo
 * @author: feather
 * @description: TODO
 * @since: 2023-06-02 21:11
 * @version: 1.0
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CouponInfo {

    private Long id;

    private Long templateId;

    private Long userId;

    private Long shopId;

    private Integer status;

    private CouponTemplateInfo template;

}
