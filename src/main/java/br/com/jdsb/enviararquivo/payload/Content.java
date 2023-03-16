package br.com.jdsb.enviararquivo.payload;

import lombok.Builder;

@Builder
public class Content {
        public String telefone;
        public String canal;
        public String tipo;
        public String mensagem;
}
