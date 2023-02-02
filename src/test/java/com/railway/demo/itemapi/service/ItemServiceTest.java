 package com.railway.demo.itemapi.service;

 import com.railway.demo.itemapi.domain.Item;
 import com.railway.demo.itemapi.model.ItemListing;
 import com.railway.demo.itemapi.repository.ItemRepository;
 import org.junit.Assert;
 import org.junit.jupiter.api.BeforeEach;
 import org.junit.jupiter.api.Test;
 import org.junit.jupiter.api.extension.ExtendWith;
 import org.mockito.InjectMocks;
 import org.mockito.Mock;
 import org.mockito.Mockito;
 import org.mockito.junit.jupiter.MockitoExtension;

 import java.util.ArrayList;
 import java.util.List;

 @ExtendWith(MockitoExtension.class)
 class ItemServiceTest {

     @InjectMocks
     private ItemService itemService; //service that will be testing

     @Mock
     private ItemRepository mockItemRepository; //mocked the dependency of the service that is being tested

     List<Item> itemList = new ArrayList<>();

     @BeforeEach
     void setUp() {
         Item item = Item.builder()
                 .itemId(1231)
                 .itemName("Samsung")
                 .itemDescription("Some random description")
                 .itemCategory("Refrigerator")
                 .itemPrice(100f)
                 .build();

         itemList.add(item);
     }

     @Test
     void getByItemCategory() {

         //Arrange
         Mockito.when(mockItemRepository.findByItemCategory("Refrigerator"))
                 .thenReturn(itemList);

         //Act
         List<ItemListing> response = itemService.getByItemCategory("Refrigerator");

         //Assert
         Assert.assertEquals("Samsung",response.get(0).getItemName());

     }

 }