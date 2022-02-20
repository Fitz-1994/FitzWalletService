package org.fitz.wallet.service;

import com.baomidou.mybatisplus.extension.service.IService;
import org.fitz.wallet.dto.AssetDto;
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

    /**
     * 根据账户id查询该账户下的所有资产 及 账号信息
     *
     * @return
     */
    AssetDto queryByAccountId(int accountId);
}
