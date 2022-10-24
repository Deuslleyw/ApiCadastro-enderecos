package com.deusley.api.deusley.mapper;

import com.deusley.api.deusley.domain.Endereco;
import com.deusley.api.deusley.provider.model.EnderecoPessoaModel;

public class RequestEnderecoMapper {


    public static Endereco toEndereco(EnderecoPessoaModel request){

       return Endereco.builder()
                .idEndereco(request.getId())
                .cep(request.getCep())
                .tipoEndereco(request.getTipoEndereco())
                .bairroLogradouro(request.getBairroLogradouro())
                .complementoLogradouro(request.getComplementoLogradouro())
                .cidadeLogradouro(request.getCidadeLogradouro())
                .logradouro(request.getLogradouro())
                .numeroLogradouro(request.getNumeroLogradouro())
                .paisLogradouro(request.getPaisLogradouro())
                .ufLogradouro(request.getUfLogradouro())
                .idCliente(request.getIdCliente())
                .build();

    }

    }

