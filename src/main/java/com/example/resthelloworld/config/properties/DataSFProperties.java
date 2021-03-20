package com.example.resthelloworld.config.properties;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.NotBlank;

@Getter
@Setter
@ConfigurationProperties(prefix = "data-sf")
@Validated
public class DataSFProperties {

    @NotBlank
    private String baseUrl;
    @NotBlank
    private String filmLocationsEndpoint;
    @NotBlank
    private String titleColumnFieldName;
    @NotBlank
    private String locationsColumnFieldName;
}
