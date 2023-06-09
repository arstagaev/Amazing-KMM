package com.arstagaev.testkmm10.domain.interactor

import com.arstagaev.testkmm10.domain.model.Weather
import com.arstagaev.testkmm10.repository.IWeatherRepository
import org.koin.core.component.KoinComponent
import org.koin.core.component.inject

class GetWeatherByCityUseCase: KoinComponent, BaseUseCase<String,Weather> {
    private val repository: IWeatherRepository by inject()
    override suspend fun invoke(cityName: String) = repository.getWeatherByCity(cityName)
}
