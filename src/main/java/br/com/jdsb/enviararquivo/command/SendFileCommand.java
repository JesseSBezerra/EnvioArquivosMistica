package br.com.jdsb.enviararquivo.command;

import br.com.jdsb.enviararquivo.payload.RequisicaoRequest;
import br.com.jdsb.enviararquivo.utils.Constante;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.*;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.util.Map;

@Component
public class SendFileCommand {
    @Autowired
    private RestTemplate restTemplate;
    public HttpStatusCode send(RequisicaoRequest root){
        RestTemplate restTemplate = new RestTemplate();
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        HttpEntity<RequisicaoRequest> request = new HttpEntity<>(root, headers);
        ResponseEntity<Map> response = restTemplate.postForEntity(Constante.URL_END_POINT_ENVIO, request, Map.class);
        return response.getStatusCode();
    }


}
