package com.bill.dao.user;

import com.bill.entity.user.RolePermission;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by sky on 2018/7/9.
 */
@Repository
public interface RolePermissionRepository extends CrudRepository<RolePermission,Integer> {
}
