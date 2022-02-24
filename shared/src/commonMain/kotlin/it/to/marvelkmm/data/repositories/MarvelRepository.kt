package it.to.marvelkmm.data.repositories

import it.to.marvelkmm.data.dto.CharactersResponse

interface MarvelRepository {

    suspend fun getHeroes(): CharactersResponse

}