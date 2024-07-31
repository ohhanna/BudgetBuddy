package com.budgetbuddy.finance.service;

import java.util.List;
import java.util.Map;

import com.budgetbuddy.finance.dto.BudgetDTO;

public interface BudgetService {
	
	public List<BudgetDTO> selectBudgetList(Map<String,Object> params) throws Exception;
	public BudgetDTO getMonthlyTotal(Map<String,Object> params) throws Exception;

}