package com.alexpan.union.domain.port.in;

import com.alexpan.union.adapter.in.model.request.NewAddressRequest;

/*
 * @author Alexander Panyshchev
 * @since 31.07.2021
 * @version 1.0
 *Task: Create use case for registration new address
 */
public interface RegisterNewAddressUseCase {
     Long register(NewAddressRequest request);
}
