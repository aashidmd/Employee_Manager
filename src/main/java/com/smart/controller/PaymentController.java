//package com.smart.controller;
//
//
//import java.util.Map;
//
//import org.json.JSONObject;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.ResponseBody;
//
//import com.razorpay.Order;
//import com.razorpay.RazorpayClient;
//
//
//public class PaymentController {
//
//	
//	
//	
//	@PostMapping("/create_order")
//	@ResponseBody
//	public String createOrder(@RequestBody Map<String, Object> data) throws Exception
//	{
//		//System.out.println("Hey order function ex.");
//		System.out.println(data);
//		
//		int amt=Integer.parseInt(data.get("amount").toString());
//		
//		var client=new RazorpayClient("rzp_test_haDRsJIQo9vFPJ", "owKJJes2fwE6YD6DToishFuH");
//		
//		JSONObject ob=new JSONObject();
//		ob.put("amount", amt*100);
//		ob.put("currency", "INR");
//		ob.put("receipt", "txn_235425");
//		
//		//creating new order
//		
//		Order order = client.Orders.create(ob);
//		System.out.println(order);
//		
//			
//		return order.toString();
//	}
//
//}
