package com.alexpan.union.adapter.in.model.response;

import com.alexpan.union.adapter.in.model.dto.ClientDTO;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

/*
 * @author Alexander Panyshchev
 * @since 31.07.2021
 * @version 1.0
 *Task:Create response for list of clients
 */
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class AllClientsResponse {
    List<ClientDTO> clients;
}
