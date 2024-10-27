/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.raagatech.bean;

import java.util.ArrayList;
import java.util.Date;
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
public class OrderDataBean {
    private int order_id;

    private long customer_id;

    private int vendor_id;

    private Date order_date;

    private Date delivery_date;

    private String delivery_time;

    private String delivery_person;
    
    private String delivery_address;

    private double price;

    private String status;

    private String comments;

    private ArrayList<OrderedItemBean> items;

    private CustomerAddressBean customerAddress;
    
    private String couponCode;
}
