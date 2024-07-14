package com.dydwns.assembly.repository;

import com.dydwns.assembly.entity.Parts;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PartsRepository extends JpaRepository<Parts, Integer> {
}
