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

    @Override
    public ResponseEntity<String> updateAddress(EnderecoPessoaModel endereco) {
        var enderecoMapper2 = RequestEnderecoMapper.toEndereco(endereco);
        enderecoService.update(enderecoMapper2);

        return ResponseEntity.status(HttpStatus.NOT_IMPLEMENTED).build();
    }

}