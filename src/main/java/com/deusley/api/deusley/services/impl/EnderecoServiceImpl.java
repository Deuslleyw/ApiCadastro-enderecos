package com.deusley.api.deusley.services.impl;

import com.deusley.api.deusley.domain.Endereco;
import com.deusley.api.deusley.repository.EnderecoRepository;
import com.deusley.api.deusley.services.EnderecoService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class EnderecoServiceImpl implements EnderecoService {


    private final EnderecoRepository enderecoRepository;

    @Override
    public void create(Endereco endereco) {
        try {
            enderecoRepository.save(endereco);

        }catch (Exception exception){
            System.out.println("Erro ao salvar");
        }

    }

    @Override
    public void update(Endereco endereco) {

    }
}
