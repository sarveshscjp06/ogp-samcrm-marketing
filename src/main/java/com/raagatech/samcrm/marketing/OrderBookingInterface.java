/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.raagatech.samcrm.marketing;

import com.raagatech.bean.CustomerAddressBean;
import com.raagatech.bean.OrderDataBean;
import com.raagatech.bean.OrderTrackerBean;
import com.raagatech.bean.OrderedItemBean;
import com.raagatech.bean.PaymentBean;
import java.util.ArrayList;

/**
 *
 * @author sarve
 * The services of this sub-project is about Marketing Application under SAMCRM project
 */
public interface OrderBookingInterface {
    public void createOrder(OrderDataBean orderDataBean) throws Exception;

    public int createItems(ArrayList<OrderedItemBean> items, int order_id) throws Exception;

//    public int createCustomer(String customerDetails) throws Exception;
//    public void createAddress(int customerId, CustomerAddressBean address) throws Exception;
    public int createNewAddress(int vendorId, int customerId, int orderId, CustomerAddressBean address) throws Exception;

//    public int updateCustomerAddressTable(int customerId, int addressId) throws Exception;
    public String completeTransaction(PaymentBean paymentBean) throws Exception;

    public String generateInvoice(String transactionNo) throws Exception;

    public ArrayList<OrderDataBean> getOrdersList(String mobile, int customerId, String status) throws Exception;

    public int updateCartItemQuantity(int itemId, int quantity, int orderId) throws Exception;

    public boolean confirmOrder(int vendor_id, int customer_id, int order_id, String couponCode, double total_price) throws Exception;

    public int updateOrderDelivery(int order_id, int delivery_person_id, String recepient, long contact_no) throws Exception;

    public int removeItem(int order_id, int vendor_id, int customer_id, int item_id) throws Exception;

    public int cancelOrder(int order_id, String comment, int delivery_person_id) throws Exception;

    public boolean updateDeliveryStatus(int order_id, int delivery_person_id, int step) throws Exception;

    public ArrayList<OrderTrackerBean> getOrderDeliveryStatus(int order_id, int customer_id) throws Exception;

}
