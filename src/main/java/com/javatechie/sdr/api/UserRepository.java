package com.javatechie.sdr.api;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "users",path = "users")
public interface UserRepository extends PagingAndSortingRepository<ApplicationUser,Integer> {

    public ApplicationUser findByEmail(@Param("email") String email);
}
