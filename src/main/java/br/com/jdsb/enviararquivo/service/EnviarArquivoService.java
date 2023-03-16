package br.com.jdsb.enviararquivo.service;

import br.com.jdsb.enviararquivo.builder.RequisicaoRequestBuilder;
import br.com.jdsb.enviararquivo.command.SendFileCommand;
import br.com.jdsb.enviararquivo.utils.Constante;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

@Service
@Log4j2
public class EnviarArquivoService {

    @Autowired
    private SendFileCommand sendFileCommand;

    @Autowired
    private ObjectMapper mapper;
    public void enviarArquivos() throws IOException {
        enviarPDF();
        enviarTXT();
        enviarAUDIO();
        enviarPNG();
    }
    private void enviarTXT() throws IOException {
        var request = RequisicaoRequestBuilder.RequisicaoRequest();
        request.setDados(Files.readAllBytes(Paths.get(Constante.TESTE_TXT)));
        request.setNomeArquivo(Constante.TESTE_TXT);
        var status = sendFileCommand.send(request);
        log.info("status de envio para {} {}",Constante.TESTE_TXT,status);
        System.out.println(mapper.writeValueAsString(request));
    }

    private void enviarPDF() throws IOException {
        var request = RequisicaoRequestBuilder.RequisicaoRequest();
        request.setDados(Files.readAllBytes(Paths.get(Constante.EXAMPLE_PDF)));
        request.setNomeArquivo(Constante.EXAMPLE_PDF);
        var status = sendFileCommand.send(request);
        log.info("status de envio para {} {}",Constante.EXAMPLE_PDF,status);
        System.out.println(mapper.writeValueAsString(request));
    }

    private void enviarAUDIO() throws IOException {
        var request = RequisicaoRequestBuilder.RequisicaoRequest();
        request.setDados(Files.readAllBytes(Paths.get(Constante.AUDIO_OGG)));
        request.setNomeArquivo(Constante.AUDIO_OGG);
        var status = sendFileCommand.send(request);
        log.info("status de envio para {} {}",Constante.AUDIO_OGG,status);
        System.out.println(mapper.writeValueAsString(request));
    }

    private void enviarPNG() throws IOException {
        var request = RequisicaoRequestBuilder.RequisicaoRequest();
        request.setDados(Files.readAllBytes(Paths.get(Constante.SMILE_PNG)));
        request.setNomeArquivo(Constante.SMILE_PNG);
        var status = sendFileCommand.send(request);
        log.info("status de envio para {} {}",Constante.SMILE_PNG,status);
        System.out.println(mapper.writeValueAsString(request));
    }

}
