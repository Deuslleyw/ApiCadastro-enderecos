package com.deusley.api.deusley.controller;


import com.deusley.api.deusley.mapper.RequestEnderecoMapper;
import com.deusley.api.deusley.provider.api.EnderecosApi;
import com.deusley.api.deusley.provider.model.EnderecoPessoaModel;
import com.deusley.api.deusley.services.EnderecoService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@RequestMapping("/api/v1/enderecos")
@RestController
@RequiredArgsConstructor
public class EnderecoController implements EnderecosApi {

    private final EnderecoService enderecoService;

    @Override
    public ResponseEntity<Void> createAddress(EnderecoPessoaModel endereco) {
        var enderecoMapper = RequestEnderecoMapper.toEndereco(endereco);

        enderecoService.create(enderecoMapper);

        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

}
