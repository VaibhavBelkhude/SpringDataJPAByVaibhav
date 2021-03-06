package com.nt.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Document
@Data
@RequiredArgsConstructor
@NoArgsConstructor
@AllArgsConstructor
public class Customer {
	@Id
	private String id;
	@NonNull
	private Integer cno;
	@NonNull
	private String cname;
	private  Float billAmt;
	private  String cadd;

}