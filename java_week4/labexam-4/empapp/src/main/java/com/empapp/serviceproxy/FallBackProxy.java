package com.empapp.serviceproxy;

import com.empapp.dto.Department;
import org.springframework.stereotype.Component;

@Component
public class FallBackProxy implements DeptServiceProxy{
    @Override
    public Department getByName(String name) {
        return new Department(0, "Support", "Bangalore");
    }
}
