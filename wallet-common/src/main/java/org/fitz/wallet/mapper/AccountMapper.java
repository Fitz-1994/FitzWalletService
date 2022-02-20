package org.fitz.wallet.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.fitz.wallet.entity.Account;

/**
 * <p>
 * 账户表 Mapper 接口
 * </p>
 *
 * @author fitz
 * @since 2022-02-19
 */
public interface AccountMapper extends BaseMapper<Account> {

    Account queryById(int id);
}
