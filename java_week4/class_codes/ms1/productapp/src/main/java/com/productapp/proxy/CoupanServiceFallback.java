package com.productapp.proxy;

import com.productapp.dto.Coupon;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
@Component
public class CoupanServiceFallback implements CoupanServiceProxy {
    @Override
    public Coupon getCouponByCode(String couponCode) {
        return new Coupon("SUP5",5, LocalDateTime.now());
    }
}
