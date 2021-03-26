 class Song()
 {
     private var Title : String? = null
     private var Artist : String? = null
     private var Genre : String? = null
     private var Length : Int? = null


     init {
         Title = title
     }

     }
     fun Song (title : String?, artist : String?, genre : String?, length : Int?)
     {
         Title = title
         Artist = artist
         Genre = genre
         Length = length
     }


     fun changeTitle(title : String)
     {
         Title = title
     }

     fun changeArtist(artist : String)
     {
         Artist = artist
     }

     fun changeGenre(genre : String)
     {
         Genre = genre
     }

     fun changeLength(length : Int)
     {
         Length = length
     }

     fun getTitle() : String?
     {
         return Title
     }

     fun getArtist() : String?
     {
         return Artist
     }

     fun getGenre() : String?
     {
         return Genre
     }

     fun getLength() : Int?
     {
         return Length
     }
 }

