package br.com.loja.motospring.adapter.mapper;

import br.com.loja.motospring.adapter.dto.MotoDto;
import br.com.loja.motospring.data.model.MotoModel;

public interface MotoMapper {
    MotoDto toDto(MotoModel model);
    MotoModel toEntity(MotoDto motoDto);
}
