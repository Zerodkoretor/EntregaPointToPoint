package com.webEntrega.Entrega.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.webEntrega.Entrega.model.EntregaEntity;



@Repository
public interface EntregaRepository extends JpaRepository<EntregaEntity, Long> {

}
