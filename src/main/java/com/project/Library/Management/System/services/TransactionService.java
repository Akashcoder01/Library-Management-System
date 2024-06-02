package com.project.Library.Management.System.services;

import com.project.Library.Management.System.entity.Transaction;
import com.project.Library.Management.System.repository.TransactionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TransactionService {
        @Autowired
        private TransactionRepository transactionRepository;

        public Transaction saveTransaction(Transaction transaction) {
            return transactionRepository.save(transaction);
        }

        public List<Transaction> getAllTransactions() {
            return transactionRepository.findAll();
        }
}
