package com.breezefieldmalaxmienamels.features.lead.api

import com.breezefieldmalaxmienamels.features.NewQuotation.api.GetQuotListRegRepository
import com.breezefieldmalaxmienamels.features.NewQuotation.api.GetQutoListApi


object GetLeadRegProvider {
    fun provideList(): GetLeadListRegRepository {
        return GetLeadListRegRepository(GetLeadListApi.create())
    }
}