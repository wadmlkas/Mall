package com.wenruiwang.mallbuilding.service;

import com.wenruiwang.mallbuilding.nosql.elasticsearch.document.EsProduct;
import org.springframework.data.domain.Page;

import java.util.List;

public interface EsProductService {
    int importAll();

    void delete(Long id);

    EsProduct create(Long id);

    void delete(List<Long> id);

    Page<EsProduct> search(String keyword, Integer pageNum, Integer pageSize);
}
