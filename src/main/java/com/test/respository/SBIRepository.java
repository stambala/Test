package com.test.respository;

import com.test.entity.SbiEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SBIRepository extends JpaRepository<SbiEntity,String> {

}
