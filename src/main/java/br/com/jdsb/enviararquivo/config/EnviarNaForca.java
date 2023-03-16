package br.com.jdsb.enviararquivo.config;

import br.com.jdsb.enviararquivo.service.EnviarArquivoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.io.IOException;

@Configuration
public class EnviarNaForca {

    @Autowired
    private EnviarArquivoService enviarArquivoService;

    @Bean
    public void teste() throws IOException {
        enviarArquivoService.enviarArquivos();
    }
}
