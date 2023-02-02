package com.railway.demo.itemapi.domain;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity //Specifies that the class is an entity
@Table(name = "item") //maps to a table in the database

//lombok annotations to add constructors, getters and setts
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Item {
    @Id //entity identifier
    private int itemId; // translates to item_id

    private String itemName; //item_name

    private String itemCategory;

    private String itemDescription;

    private float itemPrice;
}
