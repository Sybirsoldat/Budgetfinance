package com.example.budgetapp.Budget;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/budget")
public class BudgetController {


    private final budgetappservice budgetappservice;

    @Autowired
    public BudgetController(budgetappservice budgetappservice){
        this.budgetappservice = budgetappservice;
    }

    @PostMapping("/Przychody")
    public void addIncome(@RequestBody Przychody przychody) {
        budgetappservice.addIncome(przychody);

    }
    @PostMapping("/Wydatki")
    public void addExpense(@RequestBody Wydatki wydatki) {
        budgetappservice.addExpense(wydatki);
    }
    @GetMapping("/calculate")
    public double calculateBudget() {
        return budgetappservice.calculateBudget();
    }
}
