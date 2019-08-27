package com.training.bioritm.repository;

import com.training.bioritm.model.Bioritm;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BioritmRepository extends JpaRepository<Bioritm, Long> {
}
