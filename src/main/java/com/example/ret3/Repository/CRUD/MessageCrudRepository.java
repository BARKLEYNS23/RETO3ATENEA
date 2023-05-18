package com.example.ret3.Repository.CRUD;

import com.example.ret3.Model.Message;
import org.springframework.data.repository.CrudRepository;

public interface MessageCrudRepository  extends CrudRepository<Message, Integer> {
}
