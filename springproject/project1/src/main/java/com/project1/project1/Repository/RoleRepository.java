package com.project1.project1.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project1.project1.Model.Role;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long>
{
    Role findByName(Role name);
}
