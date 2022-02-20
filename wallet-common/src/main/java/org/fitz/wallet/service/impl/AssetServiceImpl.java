package org.fitz.wallet.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.fitz.wallet.dto.AssetDto;
import org.fitz.wallet.entity.Account;
import org.fitz.wallet.entity.Asset;
import org.fitz.wallet.mapper.AccountMapper;
import org.fitz.wallet.mapper.AssetMapper;
import org.fitz.wallet.service.IAssetService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.math.BigDecimal;
import java.util.List;

/**
 * <p>
 * 持仓表 服务实现类
 * </p>
 *
 * @author fitz
 * @since 2022-02-19
 */
@Service
public class AssetServiceImpl extends ServiceImpl<AssetMapper, Asset> implements IAssetService {
    @Resource
    private AssetMapper assetMapper;
    @Resource
    private AccountMapper accountMapper;

    @Override
    public BigDecimal assetSum() {
        // 这个函数既要查询 account表，又要查询asset


        //////////////////
        return BigDecimal.ZERO;
    }

    @Override
    public AssetDto queryByAccountId(int accountId) {
        Account account = accountMapper.queryById(accountId);
        List<Asset> assetList = assetMapper.queryByAccountId(accountId);

        AssetDto assetDto = new AssetDto();
        assetDto.setAccount(account);
        assetDto.setAssets(assetList);
        return assetDto;
    }
}
