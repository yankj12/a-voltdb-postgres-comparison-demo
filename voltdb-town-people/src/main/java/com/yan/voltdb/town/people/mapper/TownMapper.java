package com.yan.voltdb.town.people.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.yan.voltdb.town.people.schema.Town;

@Mapper
public interface TownMapper {

	List<Town> findFirstX(Integer first);
}
