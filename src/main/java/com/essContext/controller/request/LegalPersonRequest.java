package com.essContext.controller.request;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

@Data
@NoArgsConstructor
public class LegalPersonRequest {
    @NonNull
    private String type;
    @NonNull
    private String companyName;
    @NonNull
    private String companyCode;
    @NonNull
    private String name;
    @NonNull
    private String idType;
    @NonNull
    private String idCode;

}

