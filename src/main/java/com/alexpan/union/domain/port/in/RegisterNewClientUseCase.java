package com.alexpan.union.domain.port.in;

import com.alexpan.union.adapter.in.model.request.NewAddressRequest;
import com.alexpan.union.adapter.in.model.request.NewClientRequest;

/*
 * @author Alexander Panyshchev
 * @since 31.07.2021
 * @version 1.0
 *Task: Create new registration use case
 */
public interface RegisterNewClientUseCase {
     Long register(NewClientRequest request);
}
