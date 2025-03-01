package com.thomazllr.demo.repository;

import com.thomazllr.demo.entity.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client, Long> {
}
