package $0615;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class Order {
   
	JButton btnOrder = new JButton("주문");
	JFrame framOrder = new JFrame(); // 주문 버튼 프레임 선언
	JDialog dialog = new JDialog(framOrder, "주문 내역");	// 다이얼로그 선언
	JPanel pan = new JPanel(); // 패널선언
	
    JTextArea OrderList = new JTextArea(); // 주문된 목록을 확인할 OrderList 선언
    JScrollPane scrollpane = new JScrollPane(OrderList); // OrderList에 scrollbar를 만들어줌
    

   
   public Order() {
      dialog.setSize(400, 300); // 다이얼로그의 크기 설정
      dialog.setVisible(true); // 다이얼로그를 표시 해줌
      dialog.setResizable(false); // 창 크기 조절 불가
      dialog.setLocationRelativeTo(null); // 중앙에서 프레임 실행
      dialog.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);// X 버튼 누르면 다이얼로그만 종료
      dialog.setContentPane(pan); // 일반적인 컴포넌트들을 가질 수 있는 패널
      
      OrderList.setEditable(false); // 수정하지 못하도록 설정
      
      pan.setLayout(null); // 레이아웃에 속하지 않음
      // panel에 label과 textfield 추가, 좌표 지정
          
      pan.add(OrderList);     
    
      OrderList.setBounds(7, 10, 380, 250);
      
      
      
     
      
      // Ordered 테이블을 읽어옴
     /* dbDao dao = new dbDao();
      ArrayList<dbVo> arr = new ArrayList<dbVo>();
      arr = dao.importOrdered();
      for (int i=0; i<arr.size(); i++) {
    	  OrderList.append(arr.get(i).getNo() + " \t " + arr.get(i).getMenu());
      }*/
   }

}