package com.qufangxu.mycipherbook.cipher.service;

import com.qufangxu.mycipherbook.cipher.entity.MyCipherBook;
import com.qufangxu.mycipherbook.cipher.mapper.MyCipherBookMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MyCipherBookService {

    @Autowired
    private MyCipherBookMapper myCipherBookMapper;

    public void save(MyCipherBook myCipherBook) {
        myCipherBookMapper.save(myCipherBook);
    }

    public List<MyCipherBook> getAccountPassword(String account, String application) {
        List<MyCipherBook> list = myCipherBookMapper.getAccountPassword(account,application);
        return list;
    }
}
