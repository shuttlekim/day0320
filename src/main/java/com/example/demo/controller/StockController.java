package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.db.DbManager;
import com.google.gson.Gson;

@RestController
public class StockController {

	@RequestMapping("/listStock")
	public String listStock() {
		return (new Gson()).toJson(DbManager.listStock());
	}
}
