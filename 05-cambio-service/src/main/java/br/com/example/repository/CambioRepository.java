package br.com.example.repository;

import br.com.example.model.Cambio;
import org.springframework.data.jpa.repository.JpaRepository;


public interface CambioRepository extends JpaRepository<Cambio, Long> {

    Cambio findByFromAndTo(String from, String to);
}
