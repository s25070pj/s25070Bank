package com.example.s25070Bank;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

@SpringBootTest
public class BankServiceUnitTests {

    private final BankService bankService = new BankService(new ClientStorage(), new TransferStorage());

    @Test
        //zmniejszenie srodkow na koncie po wyslaniu przelewu
    void test(){
        //given
        ClientStorage clientStorage = new ClientStorage();
        TransferStorage transferStorage = new TransferStorage();
        bankService.RegisterNewClient("1",1000);
        //when
        bankService.MakeTransfer("1",500);
        //then
        assertThat(bankService.getClientById("1").getSaldo()).isEqualTo(500);
    }

    @Test
        //zwiekszenie srodkow na koncie po wplacie
    void test2(){
        //given
        ClientStorage clientStorage = new ClientStorage();
        TransferStorage transferStorage = new TransferStorage();
        bankService.RegisterNewClient("1",1000);
        //when
        bankService.DepositFounds("1",500);
        //then
        assertThat(bankService.getClientById("1").getSaldo()).isEqualTo(1500);
    }

    @Test
        //dodanie nowego uzytkownika
    void test3(){
        //given
        ClientStorage clientStorage = new ClientStorage();
        TransferStorage transferStorage = new TransferStorage();
        //when
        bankService.RegisterNewClient("1",1000);

        //then
        assertThat(bankService.getClientById("1")).isNotNull();
    }

    @Test
        //zwracanie poprawnego uzytkowanika za pomoca metody getClientById
    void test4(){
        //given
        ClientStorage clientStorage = new ClientStorage();
        TransferStorage transferStorage = new TransferStorage();
        //when
        bankService.RegisterNewClient("1",1000);
        bankService.RegisterNewClient("2",300);
        bankService.RegisterNewClient("3",50);

        //then
        assertThat(bankService.getClientById("2")).isEqualTo(bankService.getClients().get(1));
    }
}
