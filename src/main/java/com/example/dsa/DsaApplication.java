package com.example.dsa;

import com.example.dsa.collection.linkedList.DoubleLinkedList;
import com.example.dsa.collection.linkedList.LinkedList;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DsaApplication {
	public static void main(String[] args) {
//		LinkedList<Integer> linkedList = new LinkedList();
		DoubleLinkedList<Integer> linkedList=new DoubleLinkedList<>();
		linkedList.add(55);
		linkedList.add(88);
		linkedList.add(1,100);
		linkedList.add(2,75);
		linkedList.add(0,750);
		linkedList.add(880);
		linkedList.remove(3);
		for (int  i=0;i< linkedList.size();i++){
			System.out.println(linkedList.get(i));
		}
		System.out.println(linkedList.size());
		SpringApplication.run(DsaApplication.class, args);
	}

}
