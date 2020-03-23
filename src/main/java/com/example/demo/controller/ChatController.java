package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.db.DbManager;
import com.example.demo.vo.ChatVo;
import com.google.gson.Gson;

@RestController
public class ChatController {

	@RequestMapping("/chatInsert")
	public String chatInsert(ChatVo c) {
		
		DbManager.insertChat(c);
		
		return "ok";
	}
	
	@RequestMapping(value="/chatList", produces="application/json;charset=UTF-8")
	public String chatList() {
		return (new Gson()).toJson(DbManager.listChatl());
	}
}

