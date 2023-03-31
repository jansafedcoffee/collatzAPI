package com.jan.collatzcontradiction.models.edges.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.math.BigInteger;
@Getter
@Setter
@AllArgsConstructor
public class EdgeCreateDTO {

    @JsonProperty("source")
    private BigInteger input;
}
