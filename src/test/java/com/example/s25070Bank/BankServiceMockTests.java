package com.example.s25070Bank;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class BankServiceMockTests {

    @Mock
    private ClientStorage clientStorage;

    @Mock
    private TransferStorage transferStorage;

    @InjectMocks
    private BankService bankService;

    @Test
        //zmniejszenie srodkow na koncie po wyslaniu przelewu
    void test(){
        //given
        List<Client> clients = new ArrayList<>();
        List<Transfer> transfers = new ArrayList<>();
        clients.add(new Client("1",1000));
        clients.add(new Client("2",5000));
        clients.add(new Client("3",300));

        when(clientStorage.getClients()).thenReturn(clients);
        //when

        clients.get(0).setSaldo(clients.get(0).getSaldo()-500);
        //then
        assertThat(bankService.getClientById("1").getSaldo()).isEqualTo(500);
    }

    @Test
        //zwiekszenie srodkow na koncie po wplacie
    void test2(){
        //given
        List<Client> clients = new ArrayList<>();
        List<Transfer> transfers = new ArrayList<>();
        clients.add(new Client("1",1000));
        clients.add(new Client("2",5000));
        clients.add(new Client("3",300));
        when(clientStorage.getClients()).thenReturn(clients);

        //when
        clients.get(0).setSaldo(clients.get(0).getSaldo()+500);
        //then
        assertThat(bankService.getClientById("1").getSaldo()).isEqualTo(1500);
    }


}
