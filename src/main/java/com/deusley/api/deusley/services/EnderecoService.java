package com.deusley.api.deusley.services;

import com.deusley.api.deusley.domain.Endereco;
import org.springframework.stereotype.Service;

@Service
public interface EnderecoService {

    void create (Endereco endereco);

    void update (Endereco endereco);

}
