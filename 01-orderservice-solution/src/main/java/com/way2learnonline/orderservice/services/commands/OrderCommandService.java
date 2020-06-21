package com.way2learnonline.orderservice.services.commands;

import java.util.concurrent.CompletableFuture;

import com.way2learnonline.orderservice.dto.commands.OrderCreateDTO;

public interface OrderCommandService {

    public CompletableFuture<String> createOrder(OrderCreateDTO orderCreateDTO);

}
