package br.com.jdsb.enviararquivo.builder;

import br.com.jdsb.enviararquivo.payload.Content;
import br.com.jdsb.enviararquivo.payload.RequisicaoRequest;

public class RequisicaoRequestBuilder {

    public static RequisicaoRequest RequisicaoRequest(){
       return  RequisicaoRequest.builder().codigoEmpresa(1)
                .codUnimed(976)
                .finalidade("ENVIAR_ARQUIVO")
                .emailAgente("jesse.9001@gmail.com")
                .content(Content.builder()
                        .canal("639094c5222b3570354de96f")
                        .mensagem("teste")
                        .telefone("558197088404")
                        .tipo("media")
                        .build())
               .build();
    }
}
