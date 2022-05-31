package io.swagger.repository;

import io.swagger.model.Arret;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ArretRepository extends PagingAndSortingRepository<Arret, Long> {
}
