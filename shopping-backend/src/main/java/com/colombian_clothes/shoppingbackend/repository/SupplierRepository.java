package com.colombian_clothes.shoppingbackend.repository;

import com.colombian_clothes.shoppingbackend.entity.Supplier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SupplierRepository extends JpaRepository<Supplier, Long> {
}
