package com.ebenz.userservice.service;

import com.ebenz.userservice.dto.DepartmentDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(value = "DEPARTMENT-SERVICE", url = "http://localhost:8080")
public interface APIClient {
    @GetMapping("/api/departments/{id}")
     DepartmentDto getDepartmentById(@PathVariable("id") String departmentId);
}
