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
 * 操作记录表
 * </p>
 *
 * @author fitz
 * @since 2022-02-19
 */
@ApiModel(value = "Action对象", description = "操作记录表")
public class Action implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    @ApiModelProperty("标的编号")
    private String targetCode;

    @ApiModelProperty("标的名称")
    private String targetName;

    @ApiModelProperty("1买入；2卖出")
    private Integer actionType;

    @ApiModelProperty("操作数量")
    private BigDecimal num;

    @ApiModelProperty("操作价格")
    private BigDecimal cost;

    @ApiModelProperty("操作时间")
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
    public String getTargetName() {
        return targetName;
    }

    public void setTargetName(String targetName) {
        this.targetName = targetName;
    }
    public Integer getActionType() {
        return actionType;
    }

    public void setActionType(Integer actionType) {
        this.actionType = actionType;
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

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "Action{" +
            "id=" + id +
            ", targetCode=" + targetCode +
            ", targetName=" + targetName +
            ", actionType=" + actionType +
            ", num=" + num +
            ", cost=" + cost +
            ", createTime=" + createTime +
        "}";
    }
}
