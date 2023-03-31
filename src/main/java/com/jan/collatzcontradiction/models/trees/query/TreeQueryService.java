package com.jan.collatzcontradiction.models.trees.query;

import com.jan.collatzcontradiction.models.edges.Edge;
import org.springframework.stereotype.Service;

import java.util.LinkedList;
import java.util.List;

@Service
public class TreeQueryService {

    public List<Edge> getTree() {
        return new LinkedList<>();
    }
}
