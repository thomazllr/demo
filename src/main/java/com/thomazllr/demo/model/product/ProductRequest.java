package com.thomazllr.demo.model.product;

import java.math.BigDecimal;

public record ProductRequest(String name, String category, BigDecimal price) {
}
