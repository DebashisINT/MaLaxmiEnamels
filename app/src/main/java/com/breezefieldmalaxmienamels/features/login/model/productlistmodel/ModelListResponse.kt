package com.breezefieldmalaxmienamels.features.login.model.productlistmodel

import com.breezefieldmalaxmienamels.app.domain.ModelEntity
import com.breezefieldmalaxmienamels.app.domain.ProductListEntity
import com.breezefieldmalaxmienamels.base.BaseResponse

class ModelListResponse: BaseResponse() {
    var model_list: ArrayList<ModelEntity>? = null
}