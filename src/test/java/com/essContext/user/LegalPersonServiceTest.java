package com.essContext.user;

import com.essContext.BaseTest;
import com.essContext.controller.request.LegalPersonRequest;
import com.essContext.domain.model.LegalPerson;
import com.essContext.domain.service.LegalPersonService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * @ClassName LegalPersonServiceTest
 * @Description 单元测试
 * @Author fanp
 * @Date 2020/7/25 14:39
 * @Version 1.0
 */
public class LegalPersonServiceTest extends BaseTest {
    @Autowired
    LegalPersonService legalPersonService;

    @Test
    void register_when_all_is_correct() throws Exception{
        LegalPersonRequest request = new LegalPersonRequest();
        request.setType("1");
        request.setCompanyName("1");
        request.setCompanyCode("11220000682643432N");
        request.setName("1");
        request.setIdType("1");
        request.setIdCode("1");

        LegalPerson legalPerson = legalPersonService.register(request);
        assertTrue(legalPerson.getId().length()>0);

    }

    @Test
    void register_when_Required_field_is_null() throws Exception{
        LegalPersonRequest request = new LegalPersonRequest();
        request.setType(null);
        request.setCompanyName(null);
        request.setCompanyCode(null);
        request.setName(null);
        request.setIdType(null);
        request.setIdCode(null);

        LegalPerson legalPerson = legalPersonService.register(request);
        assertTrue(legalPerson.getId().length()<0);

    }

    @Test
    void register_when_CompanyCode_exist() throws Exception{
        LegalPersonRequest request = new LegalPersonRequest();
        request.setType("1");
        request.setCompanyName("1");
        request.setCompanyCode("11220000682643432N");
        request.setName("1");
        request.setIdType("1");
        request.setIdCode("1");

        LegalPerson legalPerson = legalPersonService.register(request);
        assertTrue(legalPerson.getId().length()<0);

    }


    @Test
    void update() throws Exception{
        LegalPersonRequest request = new LegalPersonRequest();
        request.setType("1");
        request.setCompanyName("1");
        request.setCompanyCode("1");
        request.setName("1");
        request.setIdType("1");
        request.setIdCode("1");

        LegalPerson legalPerson = legalPersonService.update(request);
        assertTrue(legalPerson.getId().length()>0);

    }
}

