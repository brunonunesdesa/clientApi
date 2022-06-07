package com.devsuperior.clientApi.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.devsuperior.clientApi.entities.Client;

@Repository
public interface ClientRepository extends JpaRepository<Client,Long> {

}
