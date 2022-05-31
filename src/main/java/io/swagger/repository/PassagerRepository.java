package io.swagger.repository;

import io.swagger.model.Passager;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PassagerRepository extends PagingAndSortingRepository<Passager, Long> {
}
