package com.mahesh.mahesh.repo;



	import java.util.Optional;

	import org.springframework.data.jpa.repository.JpaRepository;
	import org.springframework.stereotype.Repository;

import com.mahesh.mahesh.Entity.UserInfo;

	

	@Repository
	public interface UserInfoRepository extends JpaRepository<UserInfo, Integer> { 
	    Optional<UserInfo> findByName(String username); 
	}


