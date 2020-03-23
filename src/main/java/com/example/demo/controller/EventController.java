package com.example.demo.controller;

import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.db.DbManager;
import com.example.demo.vo.EventVo;
import com.google.gson.Gson;

@RestController
public class EventController {

	@RequestMapping(value="/eventList", produces="application/json;charset=UTF-8")
	public String eventList(){
		
		return (new Gson()).toJson(DbManager.listEvent());
	}
	
	@RequestMapping("/eventInsert")
	public String eventInsert(EventVo e) {
		DbManager.insertEvent(e);
		return "ok";
	}
}
