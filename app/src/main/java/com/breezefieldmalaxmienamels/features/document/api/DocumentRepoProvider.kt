package com.breezefieldmalaxmienamels.features.document.api

import com.breezefieldmalaxmienamels.features.dymanicSection.api.DynamicApi
import com.breezefieldmalaxmienamels.features.dymanicSection.api.DynamicRepo

object DocumentRepoProvider {
    fun documentRepoProvider(): DocumentRepo {
        return DocumentRepo(DocumentApi.create())
    }

    fun documentRepoProviderMultipart(): DocumentRepo {
        return DocumentRepo(DocumentApi.createImage())
    }
}