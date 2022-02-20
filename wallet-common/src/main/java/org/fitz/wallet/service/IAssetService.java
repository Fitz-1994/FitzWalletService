package org.fitz.wallet.service;

import com.baomidou.mybatisplus.extension.service.IService;
import org.fitz.wallet.entity.Asset;

import java.math.BigDecimal;

/**
 * <p>
 * 持仓表 服务类
 * </p>
 *
 * @author fitz
 * @since 2022-02-19
 */
public interface IAssetService extends IService<Asset> {

    /**
     * 求我的所有资产总和
     *
     * @return
     */
    BigDecimal assetSum();
}
