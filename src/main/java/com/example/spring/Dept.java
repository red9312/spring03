package com.example.spring;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@ToString
@Getter
@Setter
@AllArgsConstructor	// Default 생성자 없이 생성자를 만드는것이다.
//@NoArgsConstructor	// Default 생성자를 만드는것이다.
public class Dept {
	int deptno;
	String dname;
	String loc;
	
	public Dept() {
		System.out.println("###");
		System.out.println("### Dept().... ###");
		System.out.println("###");
	}
	
	public void print() {
		System.out.println(toString());
	}
	public void print2() {
		System.out.println(toString());
	}
	
}
