package it.to.marvelkmm.data.network

import io.ktor.client.*
import io.ktor.client.features.json.JsonFeature
import io.ktor.client.features.json.serializer.*
import io.ktor.client.request.*
import it.to.marvelkmm.data.dto.CharactersResponse
import it.to.marvelkmm.data.network.Constants.Companion.API_KEY
import it.to.marvelkmm.data.network.Constants.Companion.HASH
import it.to.marvelkmm.data.network.Constants.Companion.MARVEL_GET_HEROES
import it.to.marvelkmm.data.network.Constants.Companion.TS
import kotlinx.serialization.json.Json

class MarvelApi {

    private val httpClient = HttpClient {
        install(JsonFeature) {
            val json = Json {
                ignoreUnknownKeys = true
                useAlternativeNames = false
            }
            serializer = KotlinxSerializer(json)
        }


    }

    suspend fun getAllCharacters(): CharactersResponse {
        return httpClient.get(MARVEL_GET_HEROES) {
            parameter("apikey", API_KEY)
            parameter("ts", TS)
            parameter("hash", HASH)
        }
    }
}