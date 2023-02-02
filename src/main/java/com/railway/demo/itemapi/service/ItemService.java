package com.railway.demo.itemapi.service;

import com.railway.demo.itemapi.domain.Item;
import com.railway.demo.itemapi.model.ItemListing;
import com.railway.demo.itemapi.repository.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class ItemService {
    @Autowired
    ItemRepository itemRepository;
  
    public List<Item> getAllItems(){

        return itemRepository.findAll();
    }

    public Item addItem(Item item) {

        return itemRepository.save(item);
    }

    public void deleteItem(Integer itemId) {

        itemRepository.deleteById(itemId);
    }

    public Optional<Item> findItem(Integer itemId) {

        return itemRepository.findById(itemId);
    }

    public List getByItemCategory(String category) {


        List<Item> items = itemRepository.findByItemCategory(category);

        ArrayList itemList = new ArrayList();

        for(Item item : items){
//            Item item1 = new Item()
//                    .builder()
//                    .itemId(item.getItemId())
//                    .itemName(item.getItemName())
//                    .build();

            ItemListing item1 = new ItemListing()
                    .builder()
                    .itemId(item.getItemId())
                    .itemName(item.getItemName())
                    .build();

            itemList.add(item1);

        }

        return itemList;
    }
}
