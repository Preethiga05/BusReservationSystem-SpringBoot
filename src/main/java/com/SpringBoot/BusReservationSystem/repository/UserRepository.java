package com.SpringBoot.BusReservationSystem.repository;

import com.SpringBoot.BusReservationSystem.model.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User,Long> {
    @Query("""
            select u
            from User u
            where u.id = ?1 and u.isActive = true
            """)
    Optional<User> findById(long id);
    @Query("""
            select u
            from User u
            where u.isActive = true
            """)
    Page<User> findAll(Pageable pageable);
}
