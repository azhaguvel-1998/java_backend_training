package com.ani.unit.testing.demo.service;

import com.ani.unit.testing.demo.domain.App;
import com.ani.unit.testing.demo.repository.AppRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Date;
import java.util.List;

@Service
public class AppService {
    @Autowired
    private AppRepository repository;

    public List<App> finAppsBetween(Date st, Date ed) {
        return repository.findByPubBetween(st, ed);
    }
}


