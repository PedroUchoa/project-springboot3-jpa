package com.educandoweb.course.repositories;

import com.educandoweb.course.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.Repository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
