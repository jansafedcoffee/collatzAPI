package com.jan.collatzcontradiction.models.edges;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigInteger;
import java.util.UUID;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name="EDGES")
public class Edge {
    @Id
    @GeneratedValue(generator = "UUID")
    private UUID id;
    @Column(name="input")
    private BigInteger input;
    @Column(name="output")
    private BigInteger output;
    @Column (name = "depth")
    private Integer depth;
}
