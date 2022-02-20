package org.fitz.wallet.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.fitz.wallet.entity.Asset;

import java.util.List;

/**
 * <p>
 * 持仓表 Mapper 接口
 * </p>
 *
 * @author fitz
 * @since 2022-02-19
 */
public interface AssetMapper extends BaseMapper<Asset> {

    List<Asset> queryByAccountId(int accountId);
}
