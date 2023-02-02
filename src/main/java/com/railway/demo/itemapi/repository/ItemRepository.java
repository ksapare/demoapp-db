package com.railway.demo.itemapi.repository;

import com.railway.demo.itemapi.domain.Item;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ItemRepository extends JpaRepository<Item, Integer> {
    List<Item> findByItemCategory(String categoryName);
}
