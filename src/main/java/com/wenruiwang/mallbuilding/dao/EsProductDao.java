package com.wenruiwang.mallbuilding.dao;

import com.wenruiwang.mallbuilding.nosql.elasticsearch.document.EsProduct;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface EsProductDao {
    List<EsProduct> getAllEsProductList(@Param("id") Long id);
}
