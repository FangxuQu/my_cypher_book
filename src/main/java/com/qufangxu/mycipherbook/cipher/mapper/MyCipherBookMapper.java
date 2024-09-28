package com.qufangxu.mycipherbook.cipher.mapper;

import com.qufangxu.mycipherbook.cipher.entity.MyCipherBook;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface MyCipherBookMapper {

    void save(MyCipherBook myCipherBook);

    List<MyCipherBook> getAccountPassword(@Param("account") String account, @Param("application") String application);

//    void deleteById(int id);
//
//    void updateById(int id);
//
//    void selectById(int id);

}
