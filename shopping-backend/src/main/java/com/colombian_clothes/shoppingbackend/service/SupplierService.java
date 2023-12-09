package com.colombian_clothes.shoppingbackend.service;

import com.colombian_clothes.shoppingbackend.entity.Supplier;
import com.colombian_clothes.shoppingbackend.repository.SupplierRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class SupplierService {
    private final SupplierRepository sR;

    public Supplier save(Supplier supplier) {
        return sR.save(supplier);
    }

    public Supplier findById(Long id) {
        return sR.findById(id).orElse(null);
    }

    public void deleteById(Long id) {
        sR.deleteById(id);
    }

    public Iterable<Supplier> findAll() {
        return sR.findAll();
    }

    public Supplier editById(Long id, Supplier supplier) {
        Supplier supplierToEdit = sR.findById(id).orElse(null);
        if (supplierToEdit != null) {
            supplierToEdit.setId(supplierToEdit.getId());
            supplierToEdit.setBusinessName(supplier.getBusinessName());
            supplierToEdit.setRuc(supplier.getRuc());
            supplierToEdit.setAddress(supplier.getAddress());
            supplierToEdit.setEmail(supplier.getEmail());
            supplierToEdit.setPhone(supplier.getPhone());
            return sR.save(supplierToEdit);
        }
        return null;
    }
}
