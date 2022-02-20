package org.fitz.wallet.controller;


import org.fitz.wallet.service.IAssetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;

/**
 * <p>
 * 持仓表 前端控制器
 * </p>
 *
 * @author fitz
 * @since 2022-02-19
 */
@RestController
@RequestMapping("/asset")
public class AssetController {
    @Autowired
    private IAssetService assetService;

    /**
     * 只做参数传递、参数校验
     * 不做业务逻辑处理
     *
     * @return
     */
    @RequestMapping
    public BigDecimal assetSum() {
        return assetService.assetSum();
    }
}
