import SwiftUI
import shared

struct ContentView: View {
	
    let greet = Greeting().greeting()
    let marvelApi = MarvelApi()
    
	var body: some View {
        Button("Give me Heroes!") {
            
            marvelApi.getAllCharacters() { list, error in
                        print("\(list?.data.characters.first)")
                    }
            
//            Task {
//              let list = try? await marvelApi.getAllCharacters()
//                print("\(list?.data.characters.first)")
//            }
        }
        
	}
}

struct ContentView_Previews: PreviewProvider {
	static var previews: some View {
		ContentView()
	}
}
