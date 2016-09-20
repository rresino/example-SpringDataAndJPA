package com.rresino.example.config.com.rresino.example.repository;

import com.rresino.example.config.com.rresino.example.domain.Home;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by rresino on 20/09/2016.
 */
@Transactional
@Repository
public interface HomeDao extends CrudRepository<Home, Integer> {

    public Home findByName(String name);

}
