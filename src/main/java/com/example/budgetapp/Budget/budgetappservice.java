package com.example.budgetapp.Budget;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class budgetappservice {
    private final IncomeRepository incomeRepository;
    private final ExpenseRepository expenseRepository;

    @Autowired
    public budgetappservice(IncomeRepository incomeRepository, ExpenseRepository expenseRepository) {
        this.incomeRepository = incomeRepository;
        this.expenseRepository = expenseRepository;
    }

    public void addIncome(Przychody przychody) {
        incomeRepository.save(przychody);
    }
    public void addExpense(Wydatki wydatki) {
        expenseRepository.save(wydatki);
    }

    public double calculateBudget() {
        double incomeSum = incomeRepository.findAll().stream().mapToDouble(Przychody::getAmount).sum();
        double expenseSum = expenseRepository.findAll().stream().mapToDouble(Wydatki::getAmount).sum();
        return incomeSum - expenseSum;
    }
}
