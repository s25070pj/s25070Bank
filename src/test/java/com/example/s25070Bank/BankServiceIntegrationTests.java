package com.example.HelpDesk;


import com.example.s25070Bank.BankService;
import com.example.s25070Bank.ClientStorage;
import com.example.s25070Bank.TransferStorage;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.when;

@SpringBootTest
class BankServiceIntegrationTests{

    @Autowired
    private BankService bankService

    @MockBean
    private ClientStorage clientStorage;

    @MockBean
    private TransferStorage transferStorage;




}