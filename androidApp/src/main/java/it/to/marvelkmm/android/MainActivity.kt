package it.to.marvelkmm.android

import android.os.Bundle
import android.util.Log
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import it.to.marvelkmm.Greeting
import it.to.marvelkmm.data.repositories.MarvelRepositoryImpl
import kotlinx.coroutines.DelicateCoroutinesApi
import kotlinx.coroutines.MainScope
import kotlinx.coroutines.launch

fun greet(): String {
    return Greeting().greeting()
}

class MainActivity : AppCompatActivity() {

    private val mainScope = MainScope()

    private val marvelRepository = MarvelRepositoryImpl()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val tv: TextView = findViewById(R.id.text_view)
        tv.text = greet()

        displayLaunches()
    }

    @DelicateCoroutinesApi
    private fun displayLaunches() {
        mainScope.launch {
            kotlin.runCatching {
                marvelRepository.getHeroes()
            }.onSuccess {
                Log.d("TAG", it.data.characters[0].name)
            }.onFailure {
                Log.e("TAG", "davvero pensavi funzionasse al primo colpo? $it")
            }
        }
    }
}
