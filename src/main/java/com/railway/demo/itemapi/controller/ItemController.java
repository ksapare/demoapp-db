package com.railway.demo.itemapi.controller;

import com.railway.demo.itemapi.domain.Item;
import com.railway.demo.itemapi.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = "*") //Annotation for permitting cross-origin requests
@RestController //It includes the @Controller and @ResponseBody annotations

public class ItemController {

    @Autowired //Inject dependency
            ItemService itemService;

    //maps HTTP GET request with a path to a controller method
    @RequestMapping(value = "/v1/items/", method = RequestMethod.GET)
    public List<Item> getItems(){

        return itemService.getAllItems();
    }

    //Simplify HTTP Get request mapping
    @GetMapping(value = "v1/items/{itemId}")
    public ResponseEntity getItem(@PathVariable Integer itemId) {

        Optional<Item> item = itemService.findItem(itemId);
        if (item.isPresent()) {
           return ResponseEntity.ok(item);
        }
        else
        {
            return (ResponseEntity.status(HttpStatus.NOT_FOUND).build());
        }

    }

    //maps HTTP POST request with a path to a controller method
    @PostMapping(value = "v1/items/")
    public Item addItem(@RequestBody Item item) {
        return itemService.addItem(item);
    }

    //maps HTTP DELETE request with a path to a controller method
    @DeleteMapping(value = "v1/items/{itemId}")
    public void removeItem(@PathVariable Integer itemId ){
        itemService.deleteItem(itemId);
    }

    @GetMapping(value = "v1/items/category/{category}")
    public List getItemFromCategory(@PathVariable String category){
        return itemService.getByItemCategory(category);
    }
}
