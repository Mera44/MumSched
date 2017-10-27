package mum.edu.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import mum.edu.domain.Comment;

public interface CommentRepository extends CrudRepository<Comment, Integer> {
	
	List<Comment> findAll();

}