package com.jan.collatzcontradiction.models.trees.query;

import com.jan.collatzcontradiction.models.edges.Edge;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequiredArgsConstructor
@RequestMapping("/tree")
public class TreeQueryController {

    private TreeQueryService queryService;

    @GetMapping
    public List<Edge> getTree() {
        return queryService.getTree();
    }

}
