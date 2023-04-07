package com.jan.collatzcontradiction.models.edges.command;

import com.jan.collatzcontradiction.exceptions.InputExistsException;
import com.jan.collatzcontradiction.models.edges.Edge;
import com.jan.collatzcontradiction.models.edges.EdgeRepository;
import com.jan.collatzcontradiction.models.edges.dto.EdgeCreateDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.math.BigInteger;
import java.util.*;

@Service
@RequiredArgsConstructor
@Component
public class EdgeCommandService {

    private final EdgeRepository edgeRepository;

    public Edge postEdge(final EdgeCreateDTO dto) {
        return calculateAndSaveEdge(dto.getInput());
    }
    private Edge calculateAndSaveEdge(BigInteger n) {
        Map<BigInteger, Integer> depth = new HashMap<>();
        depth.put(BigInteger.ONE, 0);

        BigInteger input = n;
        int inputDepth = 0;
        while (!depth.containsKey(input)) {
            inputDepth++;
            depth.put(input, inputDepth);
            input = input.mod(BigInteger.TWO).equals(BigInteger.ZERO) ? input.divide(BigInteger.TWO) : input.multiply(BigInteger.valueOf(3)).add(BigInteger.ONE);
        }
        inputDepth += depth.get(input);

        List<Edge> edgesWithDepth = edgeRepository.findByDepth(inputDepth);
        for (Edge edge : edgesWithDepth) {
            if (edge.getInput().equals(n)) {
                throw new InputExistsException(edge.getInput());
            }
        }

        BigInteger output = n.mod(BigInteger.TWO).equals(BigInteger.ZERO) ? n.divide(BigInteger.TWO) : n.multiply(BigInteger.valueOf(3)).add(BigInteger.ONE);
        Edge edge = new Edge(n, output, inputDepth);
        return edgeRepository.save(edge);
    }
}
