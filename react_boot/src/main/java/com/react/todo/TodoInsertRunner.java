package com.react.todo;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import com.react.todo.entity.Todo;
import com.react.todo.repository.TodoRepository;

@Component
public class TodoInsertRunner implements ApplicationRunner{
	@Autowired 
	private TodoRepository repository;
	
	@Override
	public void run(ApplicationArguments args) throws Exception {
		List<Todo> todoList = Arrays.asList(new Todo("오늘의 할일1", false), new Todo("오늘의 할일2", true));
		
		//람다식 적용
		todoList.forEach(todo-> repository.save(todo));
	}
}
