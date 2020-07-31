package com.essContext.domain.repository;

import com.essContext.domain.model.LegalPerson;

public interface LegalPersonRepository {

    LegalPerson save(LegalPerson legalPerson);

    LegalPerson update(LegalPerson legalPerson);

}
