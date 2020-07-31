package com.essContext.domain.service;

import com.essContext.controller.request.LegalPersonRequest;
import com.essContext.domain.model.LegalPerson;
import com.essContext.domain.repository.LegalPersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LegalPersonService {
    @Autowired
    LegalPersonRepository legalPersonRepository;

    public LegalPerson register(LegalPersonRequest request) throws Exception {
        LegalPerson legalPerson = transfer(request);
        return legalPersonRepository.save(legalPerson);
    }

    public LegalPerson transfer(LegalPersonRequest request) throws Exception {
        LegalPerson legalPerson = LegalPerson.builder()
                .type(request.getType())
                .companyName(request.getCompanyName())
                .companyCode(request.getCompanyCode())
                .name(request.getName())
                .idType(request.getIdType())
                .idCode(request.getIdCode())
                .build();
        return legalPersonRepository.save(legalPerson);
    }

    public LegalPerson update(LegalPersonRequest request) throws Exception {
        LegalPerson legalPerson = LegalPerson.builder()
                .type(request.getType())
                .companyName(request.getCompanyName())
                .companyCode(request.getCompanyCode())
                .name(request.getName())
                .idType(request.getIdType())
                .idCode(request.getIdCode())
                .build();
        return legalPersonRepository.update(legalPerson);
    }


}
