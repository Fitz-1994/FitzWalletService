package org.fitz.wallet.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 * 账户表 前端控制器
 * </p>
 *
 * @author fitz
 * @since 2022-02-19
 */
@RestController
@RequestMapping("/account")
public class AccountController {

    @RequestMapping("/test")
    public String test(){
        return "test";
    }
}
