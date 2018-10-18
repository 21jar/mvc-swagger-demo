package com.ainijar.controller;

import com.ainijar.ResponseHelper;
import com.ainijar.ResponseModel;
import com.ainijar.dto.UserDTO;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/demo")
@Api(description = "接口文档")
public class SwaggerController {

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    @ApiOperation(value = "添加", notes = "增加")
    public ResponseModel<UserDTO> add(@ApiParam(name = "userName", value = "用户昵称", required = true) @RequestParam(name = "userName", required = true) String userName,
                                      @ApiParam(name = "mobile", value = "手机", required = true) @RequestParam(name = "mobile", required = true) String mobile) {

        return ResponseHelper.buildResponseModel(new UserDTO());
    }

}
