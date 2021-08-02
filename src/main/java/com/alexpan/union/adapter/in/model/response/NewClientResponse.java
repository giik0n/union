package com.alexpan.union.adapter.in.model.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/*
 * @author Alexander Panyshchev
 * @since 31.07.2021
 * @version 1.0
 *Task: Create new client registration response
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class NewClientResponse {
    Long newClientId;
}
