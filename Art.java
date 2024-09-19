public class Art{
	private String title;
	private int year;
	private Artist artist;
	
	Art(String title, int year, Artist artist){
		this.title = title;
		this.year = year;
		this.artist = artist;
	}
	
	Art(String title, int year){
		this.title = title;
		this.year = year;
		this.artist = artist;
	}
	
	public void setTitle(String title){
		this.title = title;
	}
	public void setYear(int year){
		this.year = year;
	}
	public void setArtist(Artist artist){
		this.artist = artist;
	}
  
  public String getTitle(){
    return title;
    }
    
  public int getYear(){
    return year;
    }
    
  public Artist getArtist(){
    return artist;
    }
    
    public void displayArt(){
      System.out.println("Title :"+ title);
      System.out.println("Year :"+ year);
      System.out.println("Artist :"+ getArtist());
      }
       
}
