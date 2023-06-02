package org.feather.coupon.template.api.beans.rules;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
/**
 * @projectName: coupon-center
 * @package: org.feather.coupon.template.api.beans.rules
 * @className: TemplateRule
 * @author: feather
 * @description: TODO
 * @since: 2023-06-02 20:21
 * @version: 1.0
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class TemplateRule {
    /** 可以享受的折扣 */
    private Discount discount;

    // 每个人最多可以领券数量
    private Integer limitation;

    // 过期时间
    private Long deadline;
}
