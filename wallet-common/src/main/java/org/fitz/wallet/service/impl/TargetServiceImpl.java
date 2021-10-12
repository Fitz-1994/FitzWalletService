package org.fitz.wallet.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.fitz.wallet.entity.Target;
import org.fitz.wallet.mapper.TargetMapper;
import org.fitz.wallet.service.ITargetService;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 标的表 服务实现类
 * </p>
 *
 * @author fitz
 * @since 2021-10-12
 */
@Service
public class TargetServiceImpl extends ServiceImpl<TargetMapper, Target> implements ITargetService {

}
