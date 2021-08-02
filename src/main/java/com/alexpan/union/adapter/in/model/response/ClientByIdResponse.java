package com.alexpan.union.adapter.in.model.response;

import com.alexpan.union.domain.model.Client;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/*
 * @author Alexander Panyshchev
 * @since 31.07.2021
 * @version 1.0
 *Task: Create single client response
 */
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class ClientByIdResponse {
    Client client;
}
