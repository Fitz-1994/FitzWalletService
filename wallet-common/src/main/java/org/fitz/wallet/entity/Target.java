package org.fitz.wallet.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;

/**
 * <p>
 * 标的表
 * </p>
 *
 * @author fitz
 * @since 2022-02-19
 */
@ApiModel(value = "Target对象", description = "标的表")
public class Target implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty("主键")
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    @ApiModelProperty("标的名称")
    private String targetName;

    @ApiModelProperty("标的编码")
    private String targetCode;

    @ApiModelProperty("标的类型 0股票 1基金")
    private Integer targetType;

    @ApiModelProperty("最新价格")
    private BigDecimal uptodatePrice;

    @ApiModelProperty("创建时间")
    private LocalDateTime createTime;

    @ApiModelProperty("最后更新时间")
    private LocalDateTime updateTime;

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
    public Integer getTargetType() {
        return targetType;
    }

    public void setTargetType(Integer targetType) {
        this.targetType = targetType;
    }
    public BigDecimal getUptodatePrice() {
        return uptodatePrice;
    }

    public void setUptodatePrice(BigDecimal uptodatePrice) {
        this.uptodatePrice = uptodatePrice;
    }
    public LocalDateTime getCreateTime() {
        return createTime;
    }

    public void setCreateTime(LocalDateTime createTime) {
        this.createTime = createTime;
    }
    public LocalDateTime getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(LocalDateTime updateTime) {
        this.updateTime = updateTime;
    }

    @Override
    public String toString() {
        return "Target{" +
            "id=" + id +
            ", targetName=" + targetName +
            ", targetCode=" + targetCode +
            ", targetType=" + targetType +
            ", uptodatePrice=" + uptodatePrice +
            ", createTime=" + createTime +
            ", updateTime=" + updateTime +
        "}";
    }
}
