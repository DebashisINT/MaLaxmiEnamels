package com.breezefieldmalaxmienamels.features.photoReg.adapter

import com.breezefieldmalaxmienamels.features.photoReg.model.UserListResponseModel

interface PhotoAttendanceListner {
    fun getUserInfoOnLick(obj: UserListResponseModel)
    fun getUserInfoAttendReportOnLick(obj: UserListResponseModel)
}