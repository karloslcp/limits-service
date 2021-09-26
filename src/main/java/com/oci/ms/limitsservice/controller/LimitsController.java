package com.oci.ms.limitsservice.controller;

import com.oci.ms.limitsservice.config.LimitsProperties;
import com.oci.ms.limitsservice.domain.Limits;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
@RequestMapping("limits")
public class LimitsController
{
    private LimitsProperties properties;

    @GetMapping
    public Limits getLimits()
    {
        return new Limits(properties.getMinimum(), properties.getMaximum());
    }
}
