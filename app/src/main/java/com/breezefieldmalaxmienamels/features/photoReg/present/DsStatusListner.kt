package com.breezefieldmalaxmienamels.features.photoReg.present

import com.breezefieldmalaxmienamels.app.domain.ProspectEntity
import com.breezefieldmalaxmienamels.features.photoReg.model.UserListResponseModel

interface DsStatusListner {
    fun getDSInfoOnLick(obj: ProspectEntity)
}