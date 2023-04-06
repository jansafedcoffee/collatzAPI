package com.jan.collatzcontradiction.models.edges.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.math.BigInteger;
@AllArgsConstructor
@NoArgsConstructor
@Getter
public class EdgeCreateDTO {

    @JsonProperty("input")
    private BigInteger input;
}

