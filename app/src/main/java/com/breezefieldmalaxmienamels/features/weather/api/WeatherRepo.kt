package com.breezefieldmalaxmienamels.features.weather.api

import com.breezefieldmalaxmienamels.base.BaseResponse
import com.breezefieldmalaxmienamels.features.task.api.TaskApi
import com.breezefieldmalaxmienamels.features.task.model.AddTaskInputModel
import com.breezefieldmalaxmienamels.features.weather.model.ForeCastAPIResponse
import com.breezefieldmalaxmienamels.features.weather.model.WeatherAPIResponse
import io.reactivex.Observable

class WeatherRepo(val apiService: WeatherApi) {
    fun getCurrentWeather(zipCode: String): Observable<WeatherAPIResponse> {
        return apiService.getTodayWeather(zipCode)
    }

    fun getWeatherForecast(zipCode: String): Observable<ForeCastAPIResponse> {
        return apiService.getForecast(zipCode)
    }
}