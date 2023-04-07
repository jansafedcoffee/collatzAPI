package com.jan.collatzcontradiction.models.edges.query;

import com.jan.collatzcontradiction.models.edges.Edge;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/edges")
public class EdgeQueryController {

    private final EdgeQueryService service;
    @GetMapping
    public List<Edge> getEdges() {
        return service.getAllEdges();
    }

    @GetMapping("/depth")
    public List<Edge> getByDepth(@RequestParam("from") final Integer from, @RequestParam("to") final Integer to) {
        return service.getByDepth(from, to);
    }
}
