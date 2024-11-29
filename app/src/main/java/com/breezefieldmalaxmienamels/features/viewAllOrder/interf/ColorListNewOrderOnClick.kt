package com.breezefieldmalaxmienamels.features.viewAllOrder.interf

import com.breezefieldmalaxmienamels.app.domain.NewOrderColorEntity
import com.breezefieldmalaxmienamels.app.domain.NewOrderProductEntity

interface ColorListNewOrderOnClick {
    fun productListOnClick(color: NewOrderColorEntity)
}