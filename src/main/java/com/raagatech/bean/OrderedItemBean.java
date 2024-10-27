/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.raagatech.bean;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 *
 * @author sarve
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
public class OrderedItemBean {
    private int item_id;
    
    private int product_id;
    
    private String product_name;
    
    private String part_number;
    
    private float price;
    
    private int quantity;
    
    private int order_id;
    
    private String description;
    
    private int discount;
}
