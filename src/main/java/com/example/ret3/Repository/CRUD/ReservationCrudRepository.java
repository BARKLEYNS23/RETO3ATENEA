package com.example.ret3.Repository.CRUD;

import com.example.ret3.Model.Reservation;
import org.springframework.data.repository.CrudRepository;

public interface ReservationCrudRepository  extends CrudRepository<Reservation, Integer> {
}
