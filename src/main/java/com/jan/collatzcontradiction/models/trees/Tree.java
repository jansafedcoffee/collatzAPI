package com.jan.collatzcontradiction.models.trees;

import com.jan.collatzcontradiction.models.edges.Edge;
import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class Tree {

    private List<Edge> tree;
}
