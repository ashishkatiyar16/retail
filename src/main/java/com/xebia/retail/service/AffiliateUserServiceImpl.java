package com.xebia.retail.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xebia.retail.model.AffiliatedUser;
import com.xebia.retail.repo.AffiliatedUserRepo;

/**
 * 
 * @author ashish
 *
 */

@Service
public class AffiliateUserServiceImpl implements AffiliateUserService {
	@Autowired
	private AffiliatedUserRepo affiliatedUserRepo;

	@Override
	public boolean isUserExists(Integer userId) {
		Optional<AffiliatedUser> findById = affiliatedUserRepo.findById(userId);
		return findById.isPresent();
	}

}
