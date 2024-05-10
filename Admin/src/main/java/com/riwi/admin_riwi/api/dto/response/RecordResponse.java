package com.riwi.admin_riwi.api.dto.response;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class RecordResponse {
 
    private Long id;
    private LocalDate dateRecord;
    private String registration;
    private String observation;
    private CoderResponse coder;

}