package ua.lviv.iot.weblab.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ua.lviv.iot.weblab.model.Client;
import ua.lviv.iot.weblab.service.ClientService;

@RestController
@RequestMapping("/clients")
public class ClientController {
   final private ClientService clientService;

   @Autowired
   public ClientController(ClientService clientService) {
      this.clientService = clientService;
   }

   @CrossOrigin
   @PostMapping("/add")
   public void createCamera (@RequestBody Client client) {
      clientService.createClient(client);
   }

}
