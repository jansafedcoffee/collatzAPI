package com.jan.collatzcontradiction.models.edges;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.math.BigInteger;
import java.util.List;

@Repository
public interface EdgeRepository extends JpaRepository<Edge, BigInteger> {
    @Query("SELECT e FROM Edge e ORDER BY e.depth ASC")
    List<Edge> findAllSorted();

    List<Edge> findEdgesByDepthBetween(final Integer from, final Integer to);

    List<Edge> findByDepth(final Integer depth);


}
