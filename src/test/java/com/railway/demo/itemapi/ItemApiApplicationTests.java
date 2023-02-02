// package com.lowes.altspace.itemapi;

// import org.junit.jupiter.api.Test;
// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
// import org.springframework.boot.test.context.SpringBootTest;
// import org.springframework.test.web.servlet.MockMvc;

// import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
// import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
// import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

// @SpringBootTest //annotation tells Spring Boot to look for a main configuration class
// @AutoConfigureMockMvc
// class ItemApiApplicationTests {

//     @Autowired
//     private MockMvc mockMvc;

//     @Test
//     public void shouldReturnOkForGetAllItems() throws Exception {

//         this.mockMvc.perform(get("/v1/items/")).andDo(print())
//                 .andExpect(status().isOk());
//     }

//     @Test
//     public void shouldReturnNotFoundReturnCodeWhenItemNotFound() throws Exception {

//         this.mockMvc.perform(get("/v1/items/5239761")).andDo(print())
//                 .andExpect(status().isNotFound());
//     }

//     @Test
//     public void shouldReturnOkForGetItemCategory() throws Exception {

//         this.mockMvc.perform(get("/v1/items/category/Appliances")).andDo(print())
//                 .andExpect(status().isOk());
//     }

// }
