package com.oci.ms.limitsservice;

import com.oci.ms.limitsservice.config.LimitsProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties(LimitsProperties.class)
public class LimitsServiceApplication
{
    public static void main(String[] args)
    {
        SpringApplication.run(LimitsServiceApplication.class, args);
    }
}
