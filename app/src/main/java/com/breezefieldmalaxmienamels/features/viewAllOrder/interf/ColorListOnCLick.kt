package com.breezefieldmalaxmienamels.features.viewAllOrder.interf

import com.breezefieldmalaxmienamels.app.domain.NewOrderGenderEntity
import com.breezefieldmalaxmienamels.features.viewAllOrder.model.ProductOrder

interface ColorListOnCLick {
    fun colorListOnCLick(size_qty_list: ArrayList<ProductOrder>, adpPosition:Int)
}