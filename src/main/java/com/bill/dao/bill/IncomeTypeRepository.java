package com.bill.dao.bill;

import com.bill.entity.bill.IncomeType;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by sky on 2018/7/9.
 */
@Repository
public interface IncomeTypeRepository extends CrudRepository<IncomeType,Integer> {
}
