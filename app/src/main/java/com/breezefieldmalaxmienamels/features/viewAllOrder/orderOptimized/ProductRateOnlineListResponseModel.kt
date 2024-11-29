package com.breezefieldmalaxmienamels.features.viewAllOrder.orderOptimized

import com.breezefieldmalaxmienamels.app.domain.ProductOnlineRateTempEntity
import com.breezefieldmalaxmienamels.base.BaseResponse
import com.breezefieldmalaxmienamels.features.login.model.productlistmodel.ProductRateDataModel
import java.io.Serializable

class ProductRateOnlineListResponseModel: BaseResponse(), Serializable {
    var product_rate_list: ArrayList<ProductOnlineRateTempEntity>? = null
}