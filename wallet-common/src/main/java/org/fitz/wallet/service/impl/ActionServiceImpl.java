package org.fitz.wallet.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.fitz.wallet.entity.Action;
import org.fitz.wallet.entity.Asset;
import org.fitz.wallet.mapper.ActionMapper;
import org.fitz.wallet.service.IActionService;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 操作记录表 服务实现类
 * </p>
 *
 * @author fitz
 * @since 2022-02-19
 */
@Service
public class ActionServiceImpl extends ServiceImpl<ActionMapper, Action> implements IActionService {

    @Override
    public void buy(Asset asset) {

    }
}
