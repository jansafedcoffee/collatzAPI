package com.jan.collatzcontradiction.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.ProblemDetail;
import org.springframework.web.ErrorResponseException;

import java.math.BigInteger;
import java.net.URI;
import java.time.Instant;

public class InputExistsException extends ErrorResponseException {

    public InputExistsException(final BigInteger input) {
        super(HttpStatus.BAD_REQUEST, buildProblem(input), null);
    }

    private static ProblemDetail buildProblem(final BigInteger input) {
        ProblemDetail problem =ProblemDetail.forStatusAndDetail(HttpStatus.NOT_FOUND, String.valueOf(input));
        problem.setType(URI.create("/input-exists"));
        problem.setTitle("Number already exists: " + input.toString());
        problem.setProperty("timestamp", Instant.now());
        problem.setDetail("The value " + input + " was already calculated. Please enter a different natural number. Please note that decimal values will be cut out.");
        return problem;
    }
}
