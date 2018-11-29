package ru.schepin.sdec.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import ru.schepin.sdec.model.Order;

import ru.schepin.sdec.service.UserService;

import java.util.Date;
import java.util.List;


@Controller
@RequestMapping("/courier")
public class CourierController {
    @Autowired
    private UserService userService;

    @RequestMapping(value = "/send_message", method = RequestMethod.GET)
    public ModelAndView validateMessage() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("orderFromServer", new Order());
        modelAndView.setViewName("courier/courier_interface");

        return modelAndView;
    }

    @RequestMapping(value = "/result", method = RequestMethod.POST)
    public @ResponseBody
    ModelAndView check(@ModelAttribute("orderFromServer") Order order) {
        ModelAndView modelAndView = new ModelAndView();
        if (order.getNumber().length() == 0) {
            modelAndView.setViewName("courier/courier_interface");
            return modelAndView;
        } else {
            order.setDate(new Date());
            userService.saveOrder(order);
            modelAndView.setViewName("courier/message_sent");
            return modelAndView;
        }
    }
}
