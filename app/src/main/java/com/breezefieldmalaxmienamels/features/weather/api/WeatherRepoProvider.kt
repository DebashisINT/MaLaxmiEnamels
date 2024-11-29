package com.breezefieldmalaxmienamels.features.weather.api

import com.breezefieldmalaxmienamels.features.task.api.TaskApi
import com.breezefieldmalaxmienamels.features.task.api.TaskRepo

object WeatherRepoProvider {
    fun weatherRepoProvider(): WeatherRepo {
        return WeatherRepo(WeatherApi.create())
    }
}