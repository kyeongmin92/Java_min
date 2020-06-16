package kiosk;

public class dbVo {

   int no;
   String menu;

  public dbVo(int no,String menu ) {      
      this.menu = menu;
     this.no =no;
   }

public int getNo() {
	return no;
}

public void setNo(int no) {
	this.no = no;
}

public String getMenu() {
	return menu;
}

public void setMenu(String menu) {
	this.menu = menu;
}



   

}