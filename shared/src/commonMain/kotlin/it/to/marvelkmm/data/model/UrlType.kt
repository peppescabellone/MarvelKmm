package it.to.marvelkmm.data.model

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
enum class UrlType {
    @SerialName("detail")
    DETAIL,

    @SerialName("wiki")
    WIKI,

    @SerialName("comiclink")
    COMICLINK
}
