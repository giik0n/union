package com.alexpan.union.adapter.in.rest;

import com.alexpan.union.adapter.in.model.dto.ClientDTO;
import com.alexpan.union.adapter.in.model.response.AllClientsResponse;
import com.alexpan.union.adapter.in.model.response.ClientByIdResponse;
import com.alexpan.union.domain.model.Client;
import com.alexpan.union.domain.port.in.LoadAllClientsUseCase;
import com.alexpan.union.domain.port.in.LoadClientByIdUseCase;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.stream.Collectors;

/*
 * @author Alexander Panyshchev
 * @since 01.08.2021
 * @version 1.0
 *Task: Create controller with id param
 */
@Controller
@RequiredArgsConstructor
public class LoadClientByIdController {

    private final LoadClientByIdUseCase loadClientByIdUseCase;

    @RequestMapping(value = "/insured/{id}", method = RequestMethod.GET)
    @ResponseBody
    public ResponseEntity<ClientByIdResponse> getClientById(@PathVariable Long id) {
        Client client = loadClientByIdUseCase.load(id);
        ClientByIdResponse response = new ClientByIdResponse(client);
        return new ResponseEntity<ClientByIdResponse>(response, HttpStatus.OK);
    }
}
