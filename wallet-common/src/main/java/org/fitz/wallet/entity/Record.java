package org.fitz.wallet.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * <p>
 * 历史记录表
 * </p>
 *
 * @author fitz
 * @since 2021-10-12
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class Record implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 标的名称
     */
    private String targetName;

    /**
     * 标的编码
     */
    private String targetCode;

    /**
     * 标的类型 股票 基金
     */
    private String targetType;

    /**
     * 账户名称
     */
    private String accountName;

    /**
     * 当天价格
     */
    private BigDecimal targetPrice;

    /**
     * 当天持有份额
     */
    private BigDecimal num;

    /**
     * 当天持有总市值
     */
    private BigDecimal recordValue;

    /**
     * 创建时间
     */
    private Date createTime;


}
