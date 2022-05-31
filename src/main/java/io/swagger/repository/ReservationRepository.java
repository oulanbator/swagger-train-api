package io.swagger.repository;

import io.swagger.model.Reservation;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReservationRepository extends PagingAndSortingRepository<Reservation, Long> {
}
