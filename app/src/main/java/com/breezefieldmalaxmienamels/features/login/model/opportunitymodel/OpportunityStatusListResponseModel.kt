package com.breezefieldmalaxmienamels.features.login.model.opportunitymodel

import com.breezefieldmalaxmienamels.app.domain.OpportunityStatusEntity
import com.breezefieldmalaxmienamels.app.domain.ProductListEntity
import com.breezefieldmalaxmienamels.base.BaseResponse

/**
 * Created by Puja on 30.05.2024
 */
class OpportunityStatusListResponseModel : BaseResponse() {
    var status_list: ArrayList<OpportunityStatusEntity>? = null
}