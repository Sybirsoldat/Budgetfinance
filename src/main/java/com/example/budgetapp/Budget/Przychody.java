package com.example.budgetapp.Budget;

import jakarta.persistence.*;

@Entity
@Table
public class Przychody {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String description;
    private double amount;

    public Przychody() {
    }

    public Przychody(Long id, String description, double amount) {
        this.id = id;
        this.description = description;
        this.amount = amount;
    }

    public Przychody(String description, double amount) {
        this.description = description;
        this.amount = amount;
    }

    public Long getId() {
            return id;
        }
        public String getDescription() {
            return description;
        }
        public double getAmount() {
            return amount;
        }
        public void setDescription(String description) {
            this.description = description;
        }
        public void setAmount(double amount) {
            this.amount = amount;
        }

}
