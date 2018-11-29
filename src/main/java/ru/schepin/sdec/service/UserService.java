package ru.schepin.sdec.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.schepin.sdec.dao.OrderDao;
import ru.schepin.sdec.model.Order;


import java.util.List;


@Service
public class UserService {
    @Autowired
    private OrderDao orderDao;

    public List<Order> getAllOrders() {
        return orderDao.getAllOrders();
    }

    public void saveOrder(Order order) {
        orderDao.saveOrder(order);
    }
}
