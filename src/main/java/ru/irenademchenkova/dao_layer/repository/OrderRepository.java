package ru.irenademchenkova.dao_layer.repository;

import java.util.List;

public interface OrderRepository {
    List<String> getProductName(String name);
}
