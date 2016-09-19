package day0919;

public class SongTest {

	public static void main(String args[]){
		
		//기본 생성자 사용하여 각각 넣어주기
		Song song = new Song();
		song.setArtist("아이유");
		song.setTitle("좋은날");
		song.setAlbum("Real");
		song.setTrack(3);
		song.setComposer("이수민");
		song.setYear(2010);
		
		song.show();
		
		
		//파라미터를 이용하는 생성자 사용하여 값 입력하기		
		Song song2 = new Song("Real", "아이유", "이민수", "좋은날", 3, 2010);
		song2.show();
		
		Song song3 = new Song( "임창정", "내가 저지른 사랑" );
		song3.show();
		
		Song song4 = new Song( "유재석EXO", "Dancing King" );
		song4.show();
	}
}
