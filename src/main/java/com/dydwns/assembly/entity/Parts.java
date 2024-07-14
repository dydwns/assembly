package com.dydwns.assembly.entity;


import jakarta.persistence.*;
import lombok.*;

@ToString
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "parts")
@Entity
public class Parts {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 200, nullable  = false)
    private String name;

    @Column(length = 200, nullable  = false)
    private String type;

    @Column(length = 200, nullable  = true)
    private Integer price;

    @Column(length = 200, nullable  = true)
    private String model;


}
