public class Main{
  public static void main(String args[]){
      Artist firstArtist = new Artist();
      firstArtist.setName("Ali");
      Art firstArt = new Art("Sea Painting", 2024, firstArtist);
      
      Art secondArt = new Art("Tree", 2028);
      
      secondArt.setArtist(firstArtist);
      
      firstArt.displayArt();
      secondArt.displayArt();
      }
      }
    
