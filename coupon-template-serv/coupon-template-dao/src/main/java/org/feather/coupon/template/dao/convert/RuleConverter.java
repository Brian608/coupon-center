package org.feather.coupon.template.dao.convert;

import com.alibaba.fastjson.JSON;
import org.feather.coupon.template.api.beans.rules.TemplateRule;

import javax.persistence.AttributeConverter;
import javax.persistence.Converter;

/**
 * @projectName: coupon-center
 * @package: org.feather.coupon.template.dao.convert
 * @className: RuleConverter
 * @author: feather
 * @description: TODO
 * @since: 2023-06-02 20:57
 * @version: 1.0
 */
@Converter
public class RuleConverter implements AttributeConverter<TemplateRule, String> {

    @Override
    public String convertToDatabaseColumn(TemplateRule rule) {
            return JSON.toJSONString(rule);
      }

    @Override
    public TemplateRule convertToEntityAttribute(String rule) {
            return JSON.parseObject(rule, TemplateRule.class);
      }
}
