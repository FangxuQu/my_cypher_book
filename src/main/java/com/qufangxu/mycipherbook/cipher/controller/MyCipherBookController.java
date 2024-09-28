package com.qufangxu.mycipherbook.cipher.controller;

import com.qufangxu.mycipherbook.cipher.entity.MyCipherBook;
import com.qufangxu.mycipherbook.cipher.service.MyCipherBookService;
import com.qufangxu.mycipherbook.result.Result;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/cipher")
@Api(tags = "密码本")
public class MyCipherBookController {

    @Autowired
    private MyCipherBookService myCipherBookService;


    @GetMapping("/getMyPassword")
    @ApiOperation("根据账户名称、应用名称获取密码")
        public Result getMyPassword(String account,String application) {
        Result result = new Result();
        List<MyCipherBook> list = myCipherBookService.getAccountPassword(account,application);
        return result.success("查询成功！",list);
    }

    @PutMapping("/setMyPassword")
    @ApiOperation("存储密码")
    public Result setMyPassword(MyCipherBook myCipherBook) {
        myCipherBookService.save(myCipherBook);
        return Result.success("密码存储成功！");
    }
}
