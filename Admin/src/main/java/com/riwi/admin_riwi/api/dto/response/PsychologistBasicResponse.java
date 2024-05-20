package com.riwi.admin_riwi.api.dto.response;

import java.math.BigInteger;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class PsychologistBasicResponse {
    
    private String id;
    private String name;
    private String photo;
    private BigInteger cc;
    private String email;

}