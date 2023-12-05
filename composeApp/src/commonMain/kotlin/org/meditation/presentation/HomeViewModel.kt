package org.meditation.presentation

import org.meditation.data.Audio

class HomeViewModel {


     fun getAudios(): List<Audio>{
       return listOf(
           Audio(
               streamUrl = "https://download.samplelib.com/mp3/sample-15s.mp3",
               imageUrl = "1.jpeg",
               artists = "Setze",
               title = "Thinkin About You (Radio Edit)",
               duration = "2:51",
           ),
           Audio(
               streamUrl = "https://download.samplelib.com/mp3/sample-15s.mp3",
               imageUrl = "2.jpeg",
               artists = "Leonell Cassio",
               title = "Stuck In A Dream",
               duration = "4:58",
           ),
           Audio(
               streamUrl = "https://download.samplelib.com/mp3/sample-15s.mp3",
               imageUrl = "3.png",
               artists = "Gvidon",
               title = "Success Starts With A Dream",
               duration = "2:01",
           ),
           Audio(
               streamUrl = "https://download.samplelib.com/mp3/sample-15s.mp3",
               imageUrl = "4.png",
               artists = "Asake",
               title = "2:30",
               duration = "2:18",
           ),
           Audio(
               streamUrl = "https://download.samplelib.com/mp3/sample-15s.mp3",
               imageUrl = "5.png",
               artists = "Rema",
               title = "Calm down",
               duration = "3:39",
           ),
           Audio(
               streamUrl = "https://download.samplelib.com/mp3/sample-15s.mp3",
               imageUrl = "6.jpeg",
               artists = "Matthew Mark",
               title = "Happy Tears",
               duration = "1:59",
           ),
           Audio(
               streamUrl = "https://download.samplelib.com/mp3/sample-15s.mp3",
               imageUrl = "7.png",
               artists = "Nesrality",
               title = "Irish Folklore",
               duration = "2:27",
           ),
           Audio(
               streamUrl = "https://download.samplelib.com/mp3/sample-15s.mp3",
               imageUrl = "8.jpeg",
               artists = "Norished",
               title = "Irish Sitar",
               duration = "2:07",
           ),
           Audio(
               streamUrl = "https://download.samplelib.com/mp3/sample-15s.mp3",
               imageUrl = "9.jpeg",
               artists = "SoulProd",
               title = "Game",
               duration = "2:10",
           ),
           Audio(
               streamUrl = "https://download.samplelib.com/mp3/sample-15s.mp3",
               imageUrl = "10.jpeg",
               artists = "Roma Records",
               title = "Against the stream",
               duration = "2:44",
           ),

       )
    }
}
