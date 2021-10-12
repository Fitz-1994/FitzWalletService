package org.fitz.wallet.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * <p>
 * 持仓表
 * </p>
 *
 * @author fitz
 * @since 2021-10-12
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class Asset implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 关联标的表的id
     */
    private Long targetId;

    /**
     * 关联账户表id
     */
    private Long accountId;

    /**
     * 持仓数量
     */
    private BigDecimal num;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 最后更新时间
     */
    private Date updateTime;


}
