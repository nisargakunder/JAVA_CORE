package com.productapp.service;

import com.productapp.dto.Coupon;
import com.productapp.dto.Product;
import com.productapp.proxy.CoupanServiceProxy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductServiceImpl implements ProductService{


    private CoupanServiceProxy coupanServiceProxy;

    @Autowired
    public ProductServiceImpl(CoupanServiceProxy coupanServiceProxy) {
        this.coupanServiceProxy = coupanServiceProxy;
    }


    @Override
    public Product getById(int id, String couponCode) {


        Product productToReturn = new Product(id, "Laptop",
                "Dell", 100000.00, null, 0.0);


        Coupon coupon = coupanServiceProxy.getCouponByCode(couponCode);

        double discountedPrice = (100 - coupon.getDiscountPercentage()) * productToReturn.getPrice() / 100;

        productToReturn.setDiscountCoupon(coupon.getCouponCode());
        productToReturn.setDiscountedPrice(discountedPrice);

        return productToReturn;

    }
}
