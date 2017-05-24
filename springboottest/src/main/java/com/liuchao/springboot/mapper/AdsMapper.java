package com.liuchao.springboot.mapper;

import org.apache.ibatis.annotations.Mapper;

import com.liuchao.springboot.mapper.model.AdsEntity;

/**
 * @author liuchao
 */
@Mapper
public interface AdsMapper{
    
    AdsEntity findById(Long id);
}
