package com.cg.daos;

import java.util.List;

import com.cg.entities.Country;

public interface CountryDAO {
	void save(Country country);
	Country findByCode(String code);
	List<Country> findByContinent(String con);
	void update(Country c);
}
