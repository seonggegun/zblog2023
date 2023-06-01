// /sbootblog/src/main/java/com/sg/kim/dto/ResponseDTO.java

package com.sg.kim.dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ResponseDTO<T> {
	private int status;
	private T data;
}