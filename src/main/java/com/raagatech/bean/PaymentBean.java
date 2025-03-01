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
public class PaymentBean {
    private int orderId;
    
    private String couponCode;
    
    private String paymentMode;
    
    private double grossTotalPayment;
    
    private double gst;
    
    private double sgst;
    
    private double serviceCharges;
    
    private String transactionNo;
    
    private String invoiceNo;
    
    private String transactionDate;
}
