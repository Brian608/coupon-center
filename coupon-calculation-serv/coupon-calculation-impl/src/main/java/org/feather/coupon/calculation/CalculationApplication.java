package org.feather.coupon.calculation;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * @projectName: coupon-center
 * @package: org.feather.coupon.calculation
 * @className: Application
 * @author: feather
 * @description: TODO
 * @since: 2023-06-09 17:00
 * @version: 1.0
 */

@SpringBootApplication
@ComponentScan(basePackages = {"org.feather"})
public class CalculationApplication {

    public static void main(String[] args) {
        SpringApplication.run(CalculationApplication.class, args);
    }
}
