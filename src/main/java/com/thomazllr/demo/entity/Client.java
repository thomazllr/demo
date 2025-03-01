package com.thomazllr.demo.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity(name = "tb_client")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class Client {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String cpf;

    private String email;

    @OneToMany(mappedBy = "client", cascade = CascadeType.ALL)
    private List<Product> products;
}
