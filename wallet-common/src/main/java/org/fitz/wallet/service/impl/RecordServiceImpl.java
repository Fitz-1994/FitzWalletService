package org.fitz.wallet.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.fitz.wallet.entity.Record;
import org.fitz.wallet.mapper.RecordMapper;
import org.fitz.wallet.service.IRecordService;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 历史记录表 服务实现类
 * </p>
 *
 * @author fitz
 * @since 2021-10-12
 */
@Service
public class RecordServiceImpl extends ServiceImpl<RecordMapper, Record> implements IRecordService {

}
