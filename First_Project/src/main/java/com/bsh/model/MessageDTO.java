package com.bsh.model;

import java.math.BigDecimal;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Getter
@AllArgsConstructor
@RequiredArgsConstructor
public class MessageDTO {

	
	private BigDecimal q_seq;
	@NonNull private String q_title;
	@NonNull private String q_content;
	private String q_date;
	@NonNull private String mb_id;
	
	public MessageDTO(String mb_id) {
		this.mb_id = mb_id;
	}
	
}
