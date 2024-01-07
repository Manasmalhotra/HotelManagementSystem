package com.example.hotelmanagementsystem.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.UUID;
@Entity(name="Bill")
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Bill {
    @Id
    @GeneratedValue(strategy= GenerationType.UUID)
    UUID uuid;
    double amount;
    BillStatus billStatus;
    @OneToMany
    List<Payment> payments;

}
