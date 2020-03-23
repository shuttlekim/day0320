package com.example.demo.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class StockVo {

	private int no;
	private String sname;
	private int pprice;
	private int cprice;
	private int fprice;
}
