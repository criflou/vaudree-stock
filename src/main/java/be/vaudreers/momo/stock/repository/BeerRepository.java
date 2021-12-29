package be.vaudreers.momo.stock.repository;

import org.springframework.data.repository.CrudRepository;

import be.vaudreers.momo.stock.domain.Beer;

public interface BeerRepository extends CrudRepository<Beer, Integer> {


}
