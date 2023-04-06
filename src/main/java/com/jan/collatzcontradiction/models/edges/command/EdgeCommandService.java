package com.jan.collatzcontradiction.models.edges.command;

import com.jan.collatzcontradiction.models.edges.Edge;
import com.jan.collatzcontradiction.models.edges.EdgeRepository;
import com.jan.collatzcontradiction.models.edges.dto.EdgeCreateDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.math.BigInteger;

@Service
@RequiredArgsConstructor
@Component
public class EdgeCommandService {

    private final EdgeRepository edgeRepository;

    public Edge postEdge(EdgeCreateDTO dto) {
        return edgeRepository.save(createEdge(dto.getInput()));
    }

    private Edge createEdge(final BigInteger input) {
        final var edge = new Edge();
        edge.setInput(input);
        edge.setOutput(calculateOutput(input));
        return edge;
    }

    private BigInteger calculateOutput(final BigInteger input) {
        if(checkIfEven(input)) {
            return input.divide(BigInteger.valueOf(2));
        }
        return input.multiply(BigInteger.valueOf(3)).add(BigInteger.valueOf(1));
    }

    private boolean checkIfEven(final BigInteger input) {
        return input.mod(BigInteger.valueOf(2)).equals(BigInteger.valueOf(0));
    }
}
