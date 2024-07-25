package com.collage.repository;


import com.collage.entity.ParentsDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ParentsDetailsRepository extends JpaRepository<ParentsDetails, Long> {
}
