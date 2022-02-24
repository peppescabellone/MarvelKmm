package it.to.marvelkmm.data.repositories

import it.to.marvelkmm.data.network.MarvelApi
import org.koin.core.component.KoinComponent
import org.koin.core.component.inject

class MarvelRepositoryImpl : MarvelRepository, KoinComponent {

    private val marvelApi: MarvelApi by inject()

    override suspend fun getHeroes() = marvelApi.getAllCharacters()


}