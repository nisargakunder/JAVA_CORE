package com.peaks.dto.repo;

import com.peaks.dto.Mountains;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.data.repository.query.FluentQuery;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;
@Repository
public interface PeaksRepo extends MongoRepository<Mountains, String> {
    //name is everest
    @Query("{'name':'Everest'}")
    List<Mountains> findByNameEverest();

    @Query("{'name':{$ne:'Everest'}}")
    List<Mountains> findByNameNotEverest();

    @Query("{'height':{$gt:8000}}")
    List<Mountains> findByHeightGreaterThan8000();

    @Query("{ 'name': 'Everest', 'height': 8848 }")
    List<Mountains> findByEverestAndHeight8848();


    @Query("{ $or: [ { 'name': 'Everest' }, { 'height': 8848 } ] }")
    List<Mountains> findByEverestOrHeight8848();


    @Query("{ 'location': { $all: ['China', 'Nepal'] } }")
    List<Mountains> findByLocationChinaAndNepal();


    @Query("{ 'ascents': { $gt: 1000 } }")
    List<Mountains> findByAscentsGreaterThan1000();
}

    

