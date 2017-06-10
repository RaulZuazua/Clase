package album;

public class pruebaAlbum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		ALBUM album_1=new ALBUM("CANCION UNO", "AUTOR 1", "DISCOGRAFIA 1" , 2008, 'C' , 12.75 ,'R', true);
		
		ALBUM album_2=new ALBUM("CANCION DOS", "AUTOR 2", "DISCOGRAFIA 2" , 1998, 'D' , 9.95 ,'R', true);
		
		System.out.println(album_1.Imprimir_Album());
		
		
		
		
		
	}

}
