package io.github.mariazevedo88.financialjavaapi.service.v1.transaction.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import io.github.mariazevedo88.financialjavaapi.model.v1.transaction.Transaction;
import io.github.mariazevedo88.financialjavaapi.repository.transaction.TransactionRepository;
import io.github.mariazevedo88.financialjavaapi.service.v1.transaction.TransactionService;

/**
 * Class that implements the transaction's service methods
 * 
 * @author Mariana Azevedo
 * @since 28/03/2020
 */
@Service
public class TransactionServiceImpl implements TransactionService {
	
	@Autowired
	private TransactionRepository repository;

	/**
	 * @see TransactionService#save(Transaction)
	 */
	@Override
	public Transaction save(Transaction transaction) {
		return repository.save(transaction);
	}

	/**
	 * @see TransactionService#findByNsu(String)
	 */
	@Override
	public List<Transaction> findByNsu(String nsu) {
		return repository.findByNsu(nsu);
	}

	/**
	 * @see TransactionService#deleteById(Long)
	 */
	@Override
	public void deleteById(Long transactionId) {
		repository.deleteById(transactionId);		
	}

	/**
	 * @see TransactionService#findById(Long)
	 */
	@Override
	public Optional<Transaction> findById(Long id) {
		return repository.findById(id);
	}

	/**
	 * @see TransactionService#findAll()
	 */
	@Override
	public List<Transaction> findAll() {
		return repository.findAll();
	}

}
