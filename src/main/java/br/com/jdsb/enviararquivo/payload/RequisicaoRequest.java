package br.com.jdsb.enviararquivo.payload;

import lombok.Builder;
import lombok.Setter;

@Builder
@Setter
public class RequisicaoRequest {
    public String finalidade;
    public int codigoEmpresa;
    public int codUnimed;
    public String emailAgente;
    public Content content;
    public String nomeArquivo;
    public byte[] dados;
}
