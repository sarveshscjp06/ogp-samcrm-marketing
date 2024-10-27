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
public class CustomerAddressBean {
    private int address_id;
    
    private String recepient;
    
    private String street;
    
    private String city;
    
    private String state;
    
    private String zipcode;
    
    private String country;
    
    private String addresstype;
    
    private long mobile;
}
