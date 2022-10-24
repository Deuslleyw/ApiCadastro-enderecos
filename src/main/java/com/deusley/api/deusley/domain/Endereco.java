package com.deusley.api.deusley.domain;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Builder
@Table(name = "TB_ENDERECO")
public class Endereco {

    @Id
    private String idEndereco ;

    @Column(name = "ID_CLIENTE")
    private String idCliente ;

    @Column(name = "TIPO_ENDERECO")
    private Double tipoEndereco ;

    @Column(name = "CEP")
    private String cep ;

    @Column(name = "NUMERO_LOGRADOURO")
    private String numeroLogradouro ;

    @Column(name = "COMPLEMENTO_LOGRADOURO")
    private String complementoLogradouro ;

    @Column(name = "LOGRADOURO")
    private String logradouro ;

    @Column(name = "BAIRRO_LOGRADOURO")
    private String bairroLogradouro ;

    @Column(name = "CIDADE_LOGRADOURO")
    private String cidadeLogradouro ;

    @Column(name = "UF_LOGRADOURO")
    private String ufLogradouro ;

    @Column(name = "PAIS_LOGRADOURO")
    private String paisLogradouro ;

}
