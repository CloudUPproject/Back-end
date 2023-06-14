package ua.lviv.iot.weblab.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ua.lviv.iot.weblab.model.Client;
import ua.lviv.iot.weblab.repository.ClientRepository;

@Service
public class  ClientService{

   final private ClientRepository clientRepository;

   @Autowired
   public ClientService(ClientRepository clientRepository) {
      this.clientRepository = clientRepository;
   }

   public void createClient(Client client) {
      clientRepository.save(client);
   }


}
