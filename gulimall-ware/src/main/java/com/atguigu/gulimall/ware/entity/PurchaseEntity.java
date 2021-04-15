package com.atguigu.gulimall.ware.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * ?ɹ???Ϣ
 *
 * @author ksqb112233
 * @email 824323293@qq.com
 * @date 2021-04-14 02:27:59
 */
@Data
@TableName("wms_purchase")
public class PurchaseEntity implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * ?ɹ???id
     */
    @TableId
    private Long id;
    /**
     * ?ɹ???id
     */
    private Long assigneeId;
    /**
     * ?ɹ?????
     */
    private String assigneeName;
    /**
     * ??ϵ??ʽ
     */
    private String phone;
    /**
     * ???ȼ?
     */
    private Integer priority;
    /**
     * ״̬
     */
    private Integer status;
    /**
     * ?ֿ?id
     */
    private Long wareId;
    /**
     * ?ܽ
     */
    private BigDecimal amount;
    /**
     * ???????
     */
    private Date createTime;
    /**
     * ???????
     */
    private Date updateTime;

}
