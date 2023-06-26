package com.nilesh.springCRUD.repository;

import com.nilesh.springCRUD.model.CategoryEntity;
import com.nilesh.springCRUD.model.ProductDetailEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CategoryRepository extends JpaRepository<CategoryEntity, Integer> {
    @Query(value = "select * from category where id =?1", nativeQuery = true)
    CategoryEntity findById(int id);
}
