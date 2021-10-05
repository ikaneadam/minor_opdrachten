package com.example.minor_opdrachten.data.repository;

import com.example.minor_opdrachten.data.entity.Rekening;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface rekeningRepository extends JpaRepository<Rekening, Long> {


}
