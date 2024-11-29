package com.breezefieldmalaxmienamels.features.viewAllOrder.interf

import com.breezefieldmalaxmienamels.app.domain.NewOrderGenderEntity
import com.breezefieldmalaxmienamels.app.domain.NewOrderProductEntity

interface ProductListNewOrderOnClick {
    fun productListOnClick(product: NewOrderProductEntity)
}