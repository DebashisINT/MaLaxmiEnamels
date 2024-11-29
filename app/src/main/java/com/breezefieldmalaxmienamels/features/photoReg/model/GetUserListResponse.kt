package com.breezefieldmalaxmienamels.features.photoReg.model

import com.breezefieldmalaxmienamels.features.stockAddCurrentStock.model.CurrentStockGetDataDtls

class GetUserListResponse {
    var status:String ? = null
    var message:String ? = null
    var user_list :ArrayList<UserListResponseModel>? = null
}