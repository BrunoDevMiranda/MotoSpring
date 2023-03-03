package br.com.loja.motospring.domain;

import br.com.loja.motospring.adapter.dto.MotoDto;
import br.com.loja.motospring.adapter.mapper.MotoMapper;
import br.com.loja.motospring.data.model.MotoModel;
import br.com.loja.motospring.data.repository.MotoRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class MotoServiceImpel implements MotoService {

    private final MotoRepository repository;
    private final MotoMapper mapper;

    public MotoServiceImpel(MotoRepository repository, MotoMapper mapper) {
        this.repository = repository;
        this.mapper = mapper;
    }

    @Override
    public MotoDto create(MotoDto motoDto) {
        MotoModel moto = mapper.toEntity(motoDto);
        MotoModel motoSaved = repository.save(moto);
        return mapper.toDto(motoSaved);
    }

    @Override
    public MotoDto update(MotoDto motoDto) {
        MotoModel moto = mapper.toEntity(motoDto);
        MotoModel motoUpdate = repository.save(moto);
        return mapper.toDto(motoUpdate);
    }

    @Override
    public MotoDto findById(Long id) {
        Optional<MotoModel> motoId = repository.findById(id);
        return mapper.toDto(motoId.get());
    }

    @Override
    public List<MotoDto> getAll() {
        List<MotoModel> motoModels = repository.findAll();
        List<MotoDto> motoDtos = new ArrayList<>();
        for (MotoModel model : motoModels){
            motoDtos.add(mapper.toDto(model));
        }
        return motoDtos;
    }

    @Override
    public void delete(Long id) {
        repository.deleteById(id);

    }
}
