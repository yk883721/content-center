package com.yk.content.model.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * <p>
 * 分享表
 * </p>
 *
 * @author yangk
 * @since 2022-08-16
 */
@Getter
@Setter
@ApiModel(value = "Share对象", description = "分享表")
public class Share {

    @ApiModelProperty("id")
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @ApiModelProperty("发布人id")
    private Integer userId;

    @ApiModelProperty("标题")
    private String title;

    @ApiModelProperty("创建时间")
    private LocalDateTime createTime;

    @ApiModelProperty("修改时间")
    private LocalDateTime updateTime;

    @ApiModelProperty("是否原创 0:否 1:是")
    private Boolean isOriginal;

    @ApiModelProperty("作者")
    private String author;

    @ApiModelProperty("封面")
    private String cover;

    @ApiModelProperty("概要信息")
    private String summary;

    @ApiModelProperty("价格（需要的积分）")
    private Integer price;

    @ApiModelProperty("下载地址")
    private String downloadUrl;

    @ApiModelProperty("下载数 ")
    private Integer buyCount;

    @ApiModelProperty("是否显示 0:否 1:是")
    private Boolean showFlag;

    @ApiModelProperty("审核状态 NOT_YET: 待审核 PASSED:审核通过 REJECTED:审核不通过")
    private String auditStatus;

    @ApiModelProperty("审核不通过原因")
    private String reason;


}
