package ru.schepin.sdec.dao;

import org.springframework.stereotype.Repository;
import ru.schepin.sdec.model.Order;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;


@Repository
public class OrderDao {
    private List<Order> orders = new ArrayList<>();


    public List<Order> getAllOrders() {
        return orders;
    }

    public void saveOrder(Order order) {
        orders.add(order);
    }
}
