package com.jan.collatzcontradiction.models.edges;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigInteger;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "EDGES")
public class Edge {
    @Id
    @Column(name = "input")
    private BigInteger input;
    @Column(name = "output")
    private BigInteger output;
    @Column(name = "depth")
    private Integer depth;
}
