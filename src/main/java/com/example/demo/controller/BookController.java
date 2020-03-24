package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.db.DbManager;
import com.example.demo.vo.BookVo;
import com.google.gson.Gson;

@RestController
public class BookController {

	@RequestMapping("/updateBook")
	public String upateBook(String oper, BookVo b) {
		String str = "";		
		if(oper.equals("add"))
		{
			DbManager.insertBook(b);
		
		}else if(oper.equals("edit")) {
			DbManager.updateBook(b);
		}else if(oper.equals("del")) {
			DbManager.deleteBook(b);
		}	
		return str;
	}
	
	
	
	@RequestMapping(value="/getBook", produces="application/xml;charset=UTF-8")
	public String listBook() {
		
		
		String str = "";
		str += "<rows>";
		str += "<page>1</page>";
		str += "<total>10</total>";
		str += "<records>15</records>";
		
		for(BookVo b : DbManager.listBook()) {
			str += "<row>";
			str += "<cell>"+b.getBookid()+"</cell>";
			str += "<cell>"+b.getBookname()+"</cell>";
			str += "<cell>"+b.getPublisher()+"</cell>";
			str += "<cell>"+b.getPrice()+"</cell>";
			str += "</row>";
		}
		
		str += "</rows>";
		return str;
	}
}

