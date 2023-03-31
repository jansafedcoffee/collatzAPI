package com.jan.collatzcontradiction.models.edges.query;

import com.jan.collatzcontradiction.models.edges.Edge;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/edges")
public class EdgeQueryController {

    private final EdgeQueryService service;

    @Autowired
    public EdgeQueryController(EdgeQueryService service) {
        this.service = service;
    }
    @GetMapping
    public List<Edge> getEdges() {
        return service.getEdges();
    }
}
