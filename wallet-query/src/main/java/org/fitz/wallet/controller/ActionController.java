package org.fitz.wallet.controller;


import cn.hutool.core.util.NumberUtil;
import cn.hutool.core.util.StrUtil;
import org.fitz.wallet.dto.BaseResult;
import org.fitz.wallet.entity.Asset;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;

/**
 * <p>
 * 操作记录表 前端控制器
 * </p>
 *
 * @author fitz
 * @since 2022-02-19
 */
@RestController
@RequestMapping("/action")
public class ActionController {

    @RequestMapping(value = "/buy")
    public BaseResult buy(String targetCode, BigDecimal num, BigDecimal cost) {
        if (StrUtil.isBlank(targetCode) || NumberUtil.isLessOrEqual(num, BigDecimal.ZERO) || NumberUtil.isLessOrEqual(cost, BigDecimal.ZERO)) {
            return BaseResult.fail("参数输入不正确，请检查");
        }
        Asset asset = new Asset();
        asset.setTargetCode(targetCode);
        asset.setNum(num);
        asset.setCost(cost);


        return null;
    }
}
