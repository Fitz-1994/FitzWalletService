package org.fitz.wallet.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.fitz.wallet.entity.Account;
import org.fitz.wallet.mapper.AccountMapper;
import org.fitz.wallet.service.IAccountService;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 账户表 服务实现类
 * </p>
 *
 * @author fitz
 * @since 2021-10-12
 */
@Service
public class AccountServiceImpl extends ServiceImpl<AccountMapper, Account> implements IAccountService {

}
