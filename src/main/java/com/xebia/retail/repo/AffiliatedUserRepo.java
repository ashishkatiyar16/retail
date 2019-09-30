package com.xebia.retail.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.xebia.retail.model.AffiliatedUser;

public interface AffiliatedUserRepo extends JpaRepository<AffiliatedUser, Integer> {

}
