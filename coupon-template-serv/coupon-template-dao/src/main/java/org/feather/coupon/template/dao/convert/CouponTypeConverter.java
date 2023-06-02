package org.feather.coupon.template.dao.convert;

import org.feather.coupon.template.api.enums.CouponType;

import javax.persistence.AttributeConverter;
import javax.persistence.Converter;

/**
 * @projectName: coupon-center
 * @package: org.feather.coupon.template.dao.convert
 * @className: CouponTypeConverter
 * @author: feather
 * @description: TODO
 * @since: 2023-06-02 20:58
 * @version: 1.0
 */

@Converter
public class CouponTypeConverter  implements AttributeConverter<CouponType, String> {

    @Override
    public String convertToDatabaseColumn(CouponType couponCategory) {
        return couponCategory.getCode();
    }

    @Override
    public CouponType convertToEntityAttribute(String code) {
        return CouponType.convert(code);
    }
}
