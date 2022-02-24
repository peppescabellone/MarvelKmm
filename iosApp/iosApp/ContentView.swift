import SwiftUI
import shared

struct ContentView: View {
	
    let greet = Greeting().greeting()
    let marvelApi = MarvelApi()
    
	var body: some View {
        Button("Give me Heroes!") {
            Task {
              try? await marvelApi.getAllCharacters()
            }
        }
        
	}
}

struct ContentView_Previews: PreviewProvider {
	static var previews: some View {
		ContentView()
	}
}
