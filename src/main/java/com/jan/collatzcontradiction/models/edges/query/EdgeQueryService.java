package com.jan.collatzcontradiction.models.edges.query;

import com.jan.collatzcontradiction.models.edges.Edge;
import com.jan.collatzcontradiction.models.edges.EdgeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EdgeQueryService {

    private final EdgeRepository edgeRepository;
    @Autowired
    public EdgeQueryService(EdgeRepository edgeRepository) {
        this.edgeRepository = edgeRepository;
    }

    public List<Edge> getAllEdges() {
        return edgeRepository.findAllSorted();
    }

    public List<Edge> getByDepth(final Integer from, final Integer to) {
        return edgeRepository.findEdgesByDepthBetween(from, to);
    }
}
