package com.sorrentino.workdev.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sorrentino.workdev.entities.Client;

@Repository
public interface ClientRepository extends JpaRepository<Client, Long>{

}
