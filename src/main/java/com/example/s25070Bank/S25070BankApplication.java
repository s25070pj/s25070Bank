package com.example.s25070Bank;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class S25070BankApplication {

	private final BankService bankService;

	public S25070BankApplication(BankService bankService){
		this.bankService = bankService;


		bankService.RegisterNewClient("1",500);
		bankService.RegisterNewClient("2",1000);
		bankService.RegisterNewClient("3",1500);
		bankService.RegisterNewClient("4",700);
		bankService.RegisterNewClient("5",800);


		System.out.println(bankService.getClients());

		System.out.println(bankService.getClients().get(0));

		bankService.MakeTransfer("1",300);

		System.out.println(bankService.getClients().get(0));

		bankService.DepositFounds("1",400);

		System.out.println(bankService.getClients().get(0));

		System.out.println(bankService.getClientById("1"));


	}



	public static void main(String[] args) {
		SpringApplication.run(S25070BankApplication.class, args);
	}

}
