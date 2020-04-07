package AppImmo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import AppImmo.entities.Client;

@Repository
public interface IClientRepository extends JpaRepository<Client, Long>{

}