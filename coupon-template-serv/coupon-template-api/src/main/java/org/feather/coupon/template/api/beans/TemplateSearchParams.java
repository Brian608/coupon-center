package org.feather.coupon.template.api.beans;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
/**
 * @projectName: coupon-center
 * @package: org.feather.coupon.template.api.beans
 * @className: TemplateSearchParams
 * @author: feather
 * @description: TODO
 * @since: 2023-06-02 21:11
 * @version: 1.0
 */

/**
 * 创建优惠券模板
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class TemplateSearchParams {

    private Long id;

    private String name;

    private String type;

    private Long shopId;

    private Boolean available;

    private int page;

    private int pageSize;

}