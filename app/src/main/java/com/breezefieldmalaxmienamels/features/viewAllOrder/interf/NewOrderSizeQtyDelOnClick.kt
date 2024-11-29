package com.breezefieldmalaxmienamels.features.viewAllOrder.interf

import com.breezefieldmalaxmienamels.app.domain.NewOrderGenderEntity
import com.breezefieldmalaxmienamels.features.viewAllOrder.model.ProductOrder
import java.text.FieldPosition

interface NewOrderSizeQtyDelOnClick {
    fun sizeQtySelListOnClick(product_size_qty: ArrayList<ProductOrder>)
    fun sizeQtyListOnClick(product_size_qty: ProductOrder,position: Int)
}