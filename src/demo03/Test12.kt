package demo03

import com.google.gson.Gson

data class MaterialExportResponseDTO(
    var failReason: String? =  null,
    var materialCode: String? = null,               // 物料编号
    var materialName: String? = null,               // 物料名称
    var unitName: String? = null,                   // 主单位
    var unitPrecision: String? = null,              // 单位精度
    var materialProperty: String? = null,           // 物料属性
    var enableBatchRegulation: String? = null,      // 批次管理  material_batch_regulation.enable_batch_regulation
    var batchRuleName: String? = null,              // 批号规则  material_batch_regulation.batch_number_rule_id -> scheduling服务?
    var enableLabelRegulation: String? = null,      // 标签管理  material_label_regulation.has_existed
    var materialType: String ? = null,              // 物料类型
    var desc: String? = null,                       // 规格描述
    var fifo: String? = null,                       // 先进先出
    var replaceMaterialCodes: String? = null,       // 替代料
    var auxiliaryUnitName1: String? = null,         // 辅助单位1
    var auxiliaryUnitPrecision1: String? = null,    // 精度位数1（辅）
    var auxiliaryUnitName2: String? = null,         // 辅助单位2
    var auxiliaryUnitPrecision2: String? = null,    // 精度位数2（辅）
    var materialValidTime: String? = null,          // 存储有效期
    var materialStorageCondition: String? = null,   // 存储条件
    var warningTime: String? = null,                // 预警提前期
    var warnAmount: String? = null,                 // 安全库存
    var warnQcStatus: String? = null,               // 安全库存质量状态  material_warn.qc_status
    var warnIncludeInManufacture: String? = null,   // 安全库存是否包含在制数  material_warn.include_in_manufacture
    var issueWarehouseCode: String? = null,         // 发料仓库
    var checkDate: String? = null,                  // 物料审核日期
    var preCheckDate: String? = null,               // 审核预警提前期
    var requireMethod: String? = null,              // 请料方式  material.need_requiry
    var freezeTime: String? = null,                 // 冻结时间
    var qcOperator: String? = null,                 // 出入场质检员
    var qcConfigCode: String? = null,               // 质检方案编号
    var qcPeriod: String? = null,                   // 质检周期  material_qc.qc_period
    var useUnit: String? = null,                    // 投料单位
    var holdUnit: String? = null,                   // 产出单位
    var admitUnit: String? = null,                  // 入厂单位
    var conversionUnit1:String? = null,             // 转换单位1
    var conversionNumerator1: String? = null,       // 转换比例分子1
    var conversionDenominator1: String? = null,     // 转换比例分母1
    var conversionUnitPrecision1: String? = null,   // 转换单位精度位数1
    var conversionUnit2:String? = null,             // 转换单位2
    var conversionNumerator2: String? = null,       // 转换比例分子2
    var conversionDenominator2: String? = null,     // 转换比例分母2
    var conversionUnitPrecision2: String? = null,   // 转换单位精度位数2
    var conversionUnit3:String? = null,             // 转换单位3
    var conversionNumerator3: String? = null,       // 转换比例分子3
    var conversionDenominator3: String? = null,     // 转换比例分母3
    var conversionUnitPrecision3: String? = null,   // 转换单位精度位数3
    var conversionUnit4:String? = null,             // 转换单位4
    var conversionNumerator4: String? = null,       // 转换比例分子4
    var conversionDenominator4: String? = null,     // 转换比例分母4
    var conversionUnitPrecision4: String? = null,   // 转换单位精度位数4
    var conversionUnit5:String? = null,             // 转换单位5
    var conversionNumerator5: String? = null,       // 转换比例分子5
    var conversionDenominator5: String? = null,     // 转换比例分母5
    var conversionUnitPrecision5: String? = null,   // 转换单位精度位数5
    var specificationUnit1:String? = null,          // 入厂规格单位1
    var specificationAmount1: String? = null,       // 入厂规格数量1
    var specificationUnit2:String? = null,          // 入厂规格单位2
    var specificationAmount2: String? = null,       // 入厂规格数量2
    var specificationUnit3:String? = null,          // 入厂规格单位3
    var specificationAmount3: String? = null,       // 入厂规格数量3
    var specificationUnit4:String? = null,          // 入厂规格单位4
    var specificationAmount4: String? = null,       // 入厂规格数量4
    var specificationUnit5:String? = null,          // 入厂规格单位5
    var specificationAmount5: String? = null,       // 入厂规格数量5
    var supplierCode1: String? = null,              // 供应商编号1
    var supplierBatchCode1: String? = null,         // 供应商批次1
    var supplierMaterialCode1: String? = null,      // 供应商物料编号1
    var supplierCode2: String? = null,              // 供应商编号2
    var supplierBatchCode2: String? = null,         // 供应商批次2
    var supplierMaterialCode2: String? = null,      // 供应商物料编号2
    var supplierCode3: String? = null,              // 供应商编号3
    var supplierBatchCode3: String? = null,         // 供应商批次3
    var supplierMaterialCode3: String? = null,      // 供应商物料编号3
    var supplierCode4: String? = null,              // 供应商编号4
    var supplierBatchCode4: String? = null,         // 供应商批次4
    var supplierMaterialCode4: String? = null,      // 供应商物料编号4
    var supplierCode5: String? = null,              // 供应商编号5
    var supplierBatchCode5: String? = null,         // 供应商批次5
    var supplierMaterialCode5: String? = null,      // 供应商物料编号5
    var originLocation1: String? = null,            // 省份-城市1
    var originLocation2: String? = null,            // 省份-城市2
    var originLocation3: String? = null,            // 省份-城市3
    var originLocation4: String? = null,            // 省份-城市4
    var originLocation5: String? = null,            // 省份-城市5
    var materialPurchaseAdvanced: String?= null,    // 采购提前期
    var purchaseOperatorName: String? = null,       // 采购员
    var enableStorageCheck: String? = null,         // 库存检查
    var checkUnit: String? = null,                  // 检查单位
    var checkWarehouse: String? = null,             // 检查仓库
    var qcStatus: String? = null,                   // 质量状态
    var minStorage: String? = null,                 // 最小库存
    var maxStorage: String? = null,                 // 最大库存
    var labelRuleName: String? = null,              // 标签规则
    var printTemplateName: String? = null,          // 标签模板
    var labelEnable: String? = null,                // 标签启用字段
    var labelNotNull: String? = null                // 标签必填字段
)

fun main() {
    var mm  = MaterialExportResponseDTO()
    mm.failReason = "替代料校验失败"
    mm.materialCode = "ft123"
    mm.materialName = "ft123"
    mm.unitName = "%"
    mm.materialProperty = "qqqqqq"

    var gson = Gson()
    println(gson.toJson(mm))

}