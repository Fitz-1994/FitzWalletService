package org.fitz.wallet.controller;


import org.fitz.wallet.entity.Asset;
import org.fitz.wallet.service.IAssetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

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

    @RequestMapping
    public List<Asset> test() {
        return assetService.list();
    }
}
