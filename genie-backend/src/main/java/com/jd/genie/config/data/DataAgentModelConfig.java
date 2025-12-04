package com.jd.genie.config.data;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Map;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class DataAgentModelConfig {
    private String name;    // 数据模型名："超市销售明细数据"
    private String id;      // 数据库的唯一 ID
    private String type;    // 如 "table", "sql"
    private String content; // 可能是一段sql语句或者是表名
    private String remark;
    private String businessPrompt;      // 给 LLM 的业务提示词，说明时间字段如何聚合（按月统计时需格式化）
    private String ignoreFields;
    private String defaultRecallFields;
    private String analyzeSuggestFields;
    private String analyzeForbidFields;     // 禁止分析字段：row_id（主键/内部ID）
    private String syncValueFields;         // 同步字段：customer_name, product_name（可用于表关联或聚合） 同步字段：商品名称，用于跨表数据关联
    private String columnAliasMap;          // 字段别名映射：order_date → 销售日期,下单日期（用于自然语言解析）
}
