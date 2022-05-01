package com.acme.todolist.domain;

import static org.junit.jupiter.api.Assertions.*;

import java.time.Instant;
import java.time.temporal.ChronoUnit;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class TodoItemTest {
	final TodoItem todoitem = new TodoItem("1", Instant.now().minus(4, ChronoUnit.DAYS), "Todo de test");
	final TodoItem todoitem2 = new TodoItem("1", Instant.now().plus(4, ChronoUnit.DAYS), "Todo de test");
	final String retour = new String("[LATE!] " + todoitem.getContent());
	final String retour2 = new String("Todo de test");
	
	@Test
	void lateTodo() {
		Assertions.assertThat(retour).isEqualTo(todoitem.finalContent());
	}
	
	@Test
	void notLateTodo() {
		Assertions.assertThat(retour).isNotEqualTo(todoitem2.finalContent());
		Assertions.assertThat(retour2).isEqualTo(todoitem2.finalContent());
	}
	
	@Test
	void test() {
		fail("Not yet implemented");
	}

}
