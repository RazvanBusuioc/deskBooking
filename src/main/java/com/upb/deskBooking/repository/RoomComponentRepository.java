package com.upb.deskBooking.repository;

import com.upb.deskBooking.repository.model.RoomComponent;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoomComponentRepository extends JpaRepository<RoomComponent, Long> {
}
