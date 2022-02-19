package org.fitz.wallet.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.fitz.wallet.entity.Asset;
import org.fitz.wallet.mapper.AssetMapper;
import org.fitz.wallet.service.IAssetService;
import org.springframework.stereotype.Service;

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

}
