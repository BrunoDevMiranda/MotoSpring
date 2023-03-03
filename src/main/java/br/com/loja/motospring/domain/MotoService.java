package br.com.loja.motospring.domain;

import br.com.loja.motospring.adapter.dto.MotoDto;

import java.util.List;

public interface MotoService {
    MotoDto create(MotoDto motoDto);

    MotoDto update(MotoDto motoDto);

    MotoDto findById(Long id);

    List<MotoDto> getAll();

    void delete(Long id);
}
