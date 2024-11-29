package com.breezefieldmalaxmienamels.features.viewAllOrder.interf

import com.breezefieldmalaxmienamels.app.domain.NewOrderProductEntity
import com.breezefieldmalaxmienamels.app.domain.NewOrderSizeEntity

interface SizeListNewOrderOnClick {
    fun sizeListOnClick(size: NewOrderSizeEntity)
}