package com.breezefieldmalaxmienamels.features.viewAllOrder.model

import com.breezefieldmalaxmienamels.app.domain.NewOrderColorEntity
import com.breezefieldmalaxmienamels.app.domain.NewOrderGenderEntity
import com.breezefieldmalaxmienamels.app.domain.NewOrderProductEntity
import com.breezefieldmalaxmienamels.app.domain.NewOrderSizeEntity
import com.breezefieldmalaxmienamels.features.stockCompetetorStock.model.CompetetorStockGetDataDtls

class NewOrderDataModel {
    var status:String ? = null
    var message:String ? = null
    var Gender_list :ArrayList<NewOrderGenderEntity>? = null
    var Product_list :ArrayList<NewOrderProductEntity>? = null
    var Color_list :ArrayList<NewOrderColorEntity>? = null
    var size_list :ArrayList<NewOrderSizeEntity>? = null
}

