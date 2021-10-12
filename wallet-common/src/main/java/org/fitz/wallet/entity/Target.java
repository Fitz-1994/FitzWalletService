package org.fitz.wallet.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * <p>
 * 标的表
 * </p>
 *
 * @author fitz
 * @since 2021-10-12
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class Target implements Serializable {

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
     * 标的类型 0股票 1基金
     */
    private Integer targetType;

    /**
     * 最新价格
     */
    private BigDecimal uptodatePrice;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 最后更新时间
     */
    private Date updateTime;


}
