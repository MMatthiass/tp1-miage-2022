package com.acme.todolist;

import java.util.List;
import java.util.Optional;
import javax.inject.Named;

import org.springframework.data.repository.CrudRepository;;



/**
 * DAO d'accès aux TodoItem
 * @author bflorat
 *
 */
@Named // Permet de rendre l'interface utilisable 
public interface TodoItemRepository extends CrudRepository<TodoItem,String> {
	
	List<TodoItem> findAll(); 
	
	Optional<TodoItem> findById(String id);
	
	
}
