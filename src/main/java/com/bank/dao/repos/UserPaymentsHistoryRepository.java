package com.bank.dao.repos;

import com.bank.dao.domain.UserPaymentsHistory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Optional;
import java.util.Set;

@Repository
public interface UserPaymentsHistoryRepository extends JpaRepository<UserPaymentsHistory, Integer> {
    @Query(value = "SELECT * from user_payments_history WHERE from_card_id = :id LIMIT :limit OFFSET :offset",
            nativeQuery = true)
    Optional<Set<UserPaymentsHistory>> findByFromCardId(@Param("id") Integer id,
                                                        @Param("limit") int limit, @Param("offset") int offset);
    @Query(value = "SELECT COUNT(*) from user_payments_history WHERE from_card_id = :id", nativeQuery = true)
    long countUserPaymentsHistoriesByFromCardId(Integer id);
}

