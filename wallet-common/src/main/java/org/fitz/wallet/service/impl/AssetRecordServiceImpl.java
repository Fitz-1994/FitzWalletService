package org.fitz.wallet.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.fitz.wallet.entity.AssetRecord;
import org.fitz.wallet.mapper.AssetRecordMapper;
import org.fitz.wallet.service.IAssetRecordService;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 历史记录表 服务实现类
 * </p>
 *
 * @author fitz
 * @since 2022-02-19
 */
@Service
public class AssetRecordServiceImpl extends ServiceImpl<AssetRecordMapper, AssetRecord> implements IAssetRecordService {

}
