package com.productapp.proxy;

import com.productapp.dto.Coupon;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name="coupons",fallback = CoupanServiceFallback.class)
public interface CoupanServiceProxy {
    @GetMapping("coupon/{couponCode}")
    public Coupon getCouponByCode(@PathVariable String couponCode) ;

}
