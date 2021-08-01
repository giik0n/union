package com.alexpan.union.adapter.in.rest;

import com.alexpan.union.adapter.in.model.dto.ClientDTO;
import com.alexpan.union.adapter.in.model.response.AllClientsResponse;
import com.alexpan.union.domain.model.Client;
import com.alexpan.union.domain.port.in.LoadAllClientsUseCase;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.stream.Collectors;

/*
 * @author Alexander Panyshchev
 * @since 31.07.2021
 * @version 1.0
 *Task:
 */
@Controller
@RequiredArgsConstructor
public class LoadAllClientsController {

    private final LoadAllClientsUseCase loadAllClientsUseCase;
    private final ModelMapper modelMapper;

    @RequestMapping(value = "/insured", method = RequestMethod.GET)
    @ResponseBody
    public ResponseEntity<AllClientsResponse> getAllClients() {
        List<Client> clients = loadAllClientsUseCase.load();
        List<ClientDTO> clientDTOs = clients.stream().map(
                e -> modelMapper.map(e, ClientDTO.class)
        ).collect(Collectors.toList());
        AllClientsResponse response = new AllClientsResponse(clientDTOs);
        return new ResponseEntity<AllClientsResponse>(response, HttpStatus.OK);
    }
}
