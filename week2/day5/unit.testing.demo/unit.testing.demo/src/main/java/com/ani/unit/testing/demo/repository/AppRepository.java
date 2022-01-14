package com.ani.unit.testing.demo.repository;

import com.ani.unit.testing.demo.domain.App;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Date;
import java.util.List;

public interface AppRepository extends JpaRepository<App, Long> {
    List<App> findByPubBetween(Date st, Date ed);

    ;
}
