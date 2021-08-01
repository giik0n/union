package com.alexpan.union.adapter.in.rest;

import com.alexpan.union.adapter.in.model.request.NewAddressRequest;
import com.alexpan.union.adapter.in.model.request.NewClientRequest;
import com.alexpan.union.adapter.in.model.response.NewAddressResponse;
import com.alexpan.union.domain.port.in.RegisterNewAddressUseCase;
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
 *Task: Create new entrypoint for new address registration
 */
//@Controller
@RequiredArgsConstructor
public class NewAddressController {

    private final RegisterNewAddressUseCase registerNewAddressUseCase;

    @RequestMapping(value = "/register-new-address", method = RequestMethod.POST)
    @ResponseBody
    public ResponseEntity<NewAddressResponse> registerNewClientAddress(@RequestBody NewAddressRequest request){
        Long newAddressId = registerNewAddressUseCase.register(request);
        return new ResponseEntity<>(new NewAddressResponse(newAddressId), HttpStatus.OK);
    }
}
