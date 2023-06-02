package org.feather.coupon.template;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

/**
 * @projectName: coupon-center
 * @package: org.feather.coupon.template
 * @className: TemplateApplication
 * @author: feather
 * @description: TODO
 * @since: 2023-06-02 20:51
 * @version: 1.0
 */
@SpringBootApplication
@EnableJpaAuditing
@ComponentScan(basePackages = {"org.feather"})
public class TemplateApplication {
    public static void main(String[] args) {
        SpringApplication.run(TemplateApplication.class, args);
    }
}
