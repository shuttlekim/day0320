package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.db.DbManager;
import com.example.demo.vo.CartVo;
import com.example.demo.vo.MemberVo;
import com.google.gson.Gson;

@RestController
public class CartController {

	@RequestMapping("/insertCart")
	public String insertCart(CartVo c) {
		String str = "ok";
		DbManager.insertCart(c);
		System.out.println("장바구니에 담긴 상품번호 : " + c.getGno() +", 상품수량 : " + c.getQty());
		return str;
	}
	
	@RequestMapping("/login")
	public String login(MemberVo m)	{
		String str = "false";
		MemberVo r = DbManager.isMember(m);
		if(r != null) {
			System.out.println("로그인 성공!");
			str = r.getName();
			System.out.println("회원이름 :"+str);
		}else {
			System.out.println("로그인 실패!");
		}
		return str;
	}
}
