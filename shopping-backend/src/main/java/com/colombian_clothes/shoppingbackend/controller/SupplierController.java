package com.colombian_clothes.shoppingbackend.controller;

import com.colombian_clothes.shoppingbackend.entity.Supplier;
import com.colombian_clothes.shoppingbackend.service.SupplierService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/supplier")
@RequiredArgsConstructor
@CrossOrigin("*")
public class SupplierController {
    private final SupplierService sS;

    @PostMapping
    public Supplier save(@RequestBody Supplier supplier) {
        return sS.save(supplier);
    }

    @GetMapping("/{id}")
    public Supplier findById(@PathVariable Long id) {
        return sS.findById(id);
    }

    @PutMapping("/{id}")
    public Supplier update(@PathVariable Long id, @RequestBody Supplier supplier) {
        return sS.editById(id, supplier);
    }

    @GetMapping
    public Iterable<Supplier> findAll() {
        return sS.findAll();
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable Long id) {
        sS.deleteById(id);
    }
}
