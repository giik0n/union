package com.alexpan.union.adapter.in.rest;

import com.alexpan.union.adapter.in.model.request.NewClientRequest;
import com.alexpan.union.adapter.in.model.response.NewClientResponse;
import com.alexpan.union.domain.port.in.RegisterNewClientUseCase;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/*
 * @author Alexander Panyshchev
 * @since 31.07.2021
 * @version 1.0
 *Task: Create new entrypoint for client registration
 */
@Controller
@RequiredArgsConstructor
public class NewClientController {

    private final RegisterNewClientUseCase registerNewClientUseCase;

    @RequestMapping(value = "/insured", method = RequestMethod.POST)
    @ResponseBody
    public ResponseEntity<NewClientResponse> registerNewClient(@RequestBody NewClientRequest request){
        Long newClientId = registerNewClientUseCase.register(request);
        return new ResponseEntity<>(new NewClientResponse(newClientId), HttpStatus.OK);
    }
}
