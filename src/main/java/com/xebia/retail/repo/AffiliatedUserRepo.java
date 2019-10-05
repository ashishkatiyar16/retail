package com.xebia.retail.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.xebia.retail.model.AffiliatedUser;
/**
 * 
 * @author ashish
 * 
 * Affiliated user Repository
 *
 */
public interface AffiliatedUserRepo extends JpaRepository<AffiliatedUser, Integer> {

}
