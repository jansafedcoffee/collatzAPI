package com.jan.collatzcontradiction.models.edges.command;

import com.jan.collatzcontradiction.models.edges.Edge;
import com.jan.collatzcontradiction.models.edges.dto.EdgeCreateDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/edge")
public class EdgeCommandController {

    private final EdgeCommandService service;

    @PostMapping()
    public Edge postEdge(@RequestBody final EdgeCreateDTO dto) {
        return service.postEdge(dto);
    }

}
