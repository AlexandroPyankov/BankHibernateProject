package bank.controllers;

import bank.model.Client;
import bank.service.ClientService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class FirstController {

    ClientService clientService = new ClientService();

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public ModelAndView allFilms() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("clients");
        Client client  = clientService.findClientById(6);
        modelAndView.addObject("firstClient",client);
        return modelAndView;
    }

    @RequestMapping(value = "/accounts", method = RequestMethod.GET)
    public ModelAndView editPage() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("accounts");
        return modelAndView;
    }


}
