package com.oryx.repository;

import com.oryx.model.bu.sale.Product;
import com.oryx.model.system.ref.Contact;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.List;
import java.util.UUID;

public interface ProductRepository extends PagingAndSortingRepository<Product, UUID> {
    List<Product> findByProductCode(String productCode);
}