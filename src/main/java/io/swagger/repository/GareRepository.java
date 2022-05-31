package io.swagger.repository;

import io.swagger.model.Gare;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GareRepository extends PagingAndSortingRepository<Gare, Long> {
}
