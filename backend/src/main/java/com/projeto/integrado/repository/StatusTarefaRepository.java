package com.projeto.integrado.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projeto.integrado.entity.StatusTarefa;

public interface StatusTarefaRepository extends JpaRepository<StatusTarefa, Integer> {
  Optional<StatusTarefa> findByStatusDescricao(String statusDescricao);
}
