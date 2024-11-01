package com.zunigatomas.barilibro.purchase_service.model;


import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.math.BigDecimal;
import java.time.LocalDate;

@Data
@Document(collection = "purchases")
public class Purchase {
    @Id
    private String id;
    private String userId;
    private String bookId;
    private BigDecimal amount;
    private LocalDate date;
}
