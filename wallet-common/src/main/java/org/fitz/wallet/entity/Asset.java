package org.fitz.wallet.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * <p>
 * 持仓表
 * </p>
 *
 * @author fitz
 * @since 2022-02-19
 */
@ApiModel(value = "Asset对象", description = "持仓表")
public class Asset implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty("主键")
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    @ApiModelProperty("关联标的表的id")
    private String targetCode;

    @ApiModelProperty("关联账户表id")
    private Long accountId;

    @ApiModelProperty("持仓数量")
    private BigDecimal num;

    @ApiModelProperty("当前成本")
    private BigDecimal cost;

    @ApiModelProperty("最后更新时间")
    private Date updateTime;

    @ApiModelProperty("创建时间")
    private Date createTime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    public String getTargetCode() {
        return targetCode;
    }

    public void setTargetCode(String targetCode) {
        this.targetCode = targetCode;
    }
    public Long getAccountId() {
        return accountId;
    }

    public void setAccountId(Long accountId) {
        this.accountId = accountId;
    }
    public BigDecimal getNum() {
        return num;
    }

    public void setNum(BigDecimal num) {
        this.num = num;
    }

    public BigDecimal getCost() {
        return cost;
    }

    public void setCost(BigDecimal cost) {
        this.cost = cost;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "Asset{" +
            "id=" + id +
            ", targetCode=" + targetCode +
            ", accountId=" + accountId +
            ", num=" + num +
            ", cost=" + cost +
            ", updateTime=" + updateTime +
            ", createTime=" + createTime +
        "}";
    }
}
