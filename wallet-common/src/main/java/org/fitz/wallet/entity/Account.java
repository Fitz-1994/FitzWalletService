package org.fitz.wallet.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;
import java.util.Date;

/**
 * <p>
 * 账户表
 * </p>
 *
 * @author fitz
 * @since 2021-10-12
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class Account implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 账户名称
     */
    private String accountName;

    /**
     * 账户类型 0股票 1基金
     */
    private Integer accountType;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 最后更新时间
     */
    private Date updateTime;


}
