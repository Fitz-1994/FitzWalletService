package org.fitz.wallet.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;

/**
 * <p>
 * 历史记录表
 * </p>
 *
 * @author fitz
 * @since 2022-02-19
 */
@TableName("asset_record")
@ApiModel(value = "AssetRecord对象", description = "历史记录表")
public class AssetRecord implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty("主键")
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    @ApiModelProperty("标的名称")
    private String targetName;

    @ApiModelProperty("标的编码")
    private String targetCode;

    @ApiModelProperty("标的类型 股票 基金")
    private String targetType;

    @ApiModelProperty("账户名称")
    private String accountName;

    @ApiModelProperty("当天价格")
    private BigDecimal targetPrice;

    @ApiModelProperty("当天成本")
    private BigDecimal cost;

    @ApiModelProperty("当天持有份额")
    private BigDecimal num;

    @ApiModelProperty("创建时间")
    private LocalDateTime createTime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    public String getTargetName() {
        return targetName;
    }

    public void setTargetName(String targetName) {
        this.targetName = targetName;
    }
    public String getTargetCode() {
        return targetCode;
    }

    public void setTargetCode(String targetCode) {
        this.targetCode = targetCode;
    }
    public String getTargetType() {
        return targetType;
    }

    public void setTargetType(String targetType) {
        this.targetType = targetType;
    }
    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }
    public BigDecimal getTargetPrice() {
        return targetPrice;
    }

    public void setTargetPrice(BigDecimal targetPrice) {
        this.targetPrice = targetPrice;
    }
    public BigDecimal getCost() {
        return cost;
    }

    public void setCost(BigDecimal cost) {
        this.cost = cost;
    }
    public BigDecimal getNum() {
        return num;
    }

    public void setNum(BigDecimal num) {
        this.num = num;
    }
    public LocalDateTime getCreateTime() {
        return createTime;
    }

    public void setCreateTime(LocalDateTime createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "AssetRecord{" +
            "id=" + id +
            ", targetName=" + targetName +
            ", targetCode=" + targetCode +
            ", targetType=" + targetType +
            ", accountName=" + accountName +
            ", targetPrice=" + targetPrice +
            ", cost=" + cost +
            ", num=" + num +
            ", createTime=" + createTime +
        "}";
    }
}
