package ma.enset.compte.commandes.controllers;



import lombok.AllArgsConstructor;
import ma.enset.compte.common_api.commandes.CreateAccountCommand;
import ma.enset.compte.common_api.dtos.CreateAccountDTO;
import ma.enset.compte.common_api.dtos.CreateAccountRequestDTO;
import org.axonframework.commandhandling.CommandBus;
import org.axonframework.commandhandling.gateway.CommandGateway;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;
import java.util.concurrent.CompletableFuture;


@RestController
@RequestMapping("/commandes/account")

public class AccountCommandController {
    private CommandGateway commandGateway;
    @PostMapping(path = "/create")
    private  CompletableFuture<String> createAccount(CreateAccountRequestDTO createAccountDTO){
        CompletableFuture<String> response = commandGateway.send(new CreateAccountCommand(
                UUID.randomUUID().toString(), createAccountDTO.getInitialBalance(), createAccountDTO.getCurrency()
        ));
        return response;
    }

}
