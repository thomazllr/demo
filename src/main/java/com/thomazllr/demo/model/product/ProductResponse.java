package com.thomazllr.demo.model.product;

import java.math.BigDecimal;

public record ProductResponse(Long id, String name, String category, BigDecimal price) {
}
