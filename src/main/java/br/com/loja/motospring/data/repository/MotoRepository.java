package br.com.loja.motospring.data.repository;

import br.com.loja.motospring.data.model.MotoModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MotoRepository extends JpaRepository<MotoModel, Long> {
}
