package io.swagger.repository;

import io.swagger.model.Compagnie;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CompagnieRepository extends PagingAndSortingRepository<Compagnie, Long> {
}
