package group3;

import java.util.List;
import java.util.Scanner;

import group3.book.BookController;
import group3.book.BookVO;
import group3.borrow.BorrowController;
import group3.borrow.BorrowVO;
import group3.common.HomeMenu;
import group3.common.ScannerUtil;
import group3.join.JoinController;
import group3.join.JoinMemberVO;
import group3.sign.SignController;

public class BookManagementSystemView {

	private static BookManagementSystemView instance = new BookManagementSystemView();
    private BookManagementSystemView() {}
    public static BookManagementSystemView getInstance() {
        return instance;
    }

    private Scanner scanner = ScannerUtil.scanner();

    public int init() {
        System.out.println("\t.   *     　。　　　　•　    　ﾟ　　。    ✧");
        System.out.println("\t　　.　　　.　　　  　　.　　　　　。　　    。　.");
        System.out.println("\t 　.　　      。　        ❄    。　    .    •");
        System.out.println("\t❄    I들 도서관리시스템에 오신 것을 환영합니다!   ");
        System.out.println("\t　 　　。　　　　　　ﾟ　　　.　　　　　    .     ❄ ");
        System.out.println("\t  *            ✧ 　　　　.　 .　　       .          。\n");
        System.out.print(HomeMenu.HOME.getMenuString());
        return scanner.nextInt();
    }

    public int getMenu() {
        return scanner.nextInt();
    }

    public int join(JoinController controller) {
        int number;
        scanner.nextLine();
        System.out.print("아이디: ");
        String memId = scanner.nextLine();
        System.out.print("이름: ");
        String memNm = scanner.nextLine();
        System.out.print("주소: ");
        String addr = scanner.nextLine();
        System.out.print("전화번호: ");
        String ph = scanner.nextLine();
        System.out.print("패스워드: ");
        String pw = scanner.nextLine();
        System.out.print("이메일 : ");
        String email = scanner.nextLine();
        
        
        JoinMemberVO joinMemberVO = new JoinMemberVO(memId, memNm, addr, ph, pw,email);
        number = controller.join(joinMemberVO);
        
        if (number == HomeMenu.HOME.getMenu()) {
            System.out.println("회원가입이 완료되었습니다. 로그인해주세요.");
        } else {
            System.out.print("회원 가입 실패! 다시 회원가입을 하시겠습니까?(y 또는 n을 입력): ");
            String inputFlag = scanner.nextLine();
            if (inputFlag.equalsIgnoreCase("y")) {
                number = HomeMenu.JOIN.getMenu();
            } else {
                number = HomeMenu.HOME.getMenu();
            }
        }
        return number;
    }
    
    public int login(SignController controller) {
        int number;
        System.out.print("아이디: ");
        scanner.nextLine();
        String userId = scanner.nextLine();
        System.out.print("패스워드: ");
        String userPw = scanner.nextLine();
        JoinMemberVO joinMemberVO = new JoinMemberVO(userId, userPw);
        JoinMemberVO vo = controller.signIn(joinMemberVO);
        if (vo != null) {
            System.out.println(vo.getMemNm() + "님 로그인되었습니다.");
            number = HomeMenu.MYPAGE.getMenu();
            controller.listupdate(vo.getMemId());
        } else {
            System.out.println("로그인 정보가 일치하지 않습니다. 아이디와 비밀번호를 확인하세요.");
            number = HomeMenu.HOME.getMenu();
        }
        return number;
    }


    public int getBookList(BookController controller) throws Exception {
        controller.selectBookList("").forEach(bookVO -> {
        	 System.out.printf("%s\t%-30s\t%-10s\t%s\t%s\n", bookVO.getBookNum(), bookVO.getBookTt(), bookVO.getAth(), bookVO.getBookCfnCod(), bookVO.getAscertain());
        });
        return HomeMenu.BORR.getMenu();
    }
    // 5번 검색
    public int searchBook(BookController controller) throws Exception {
        scanner.nextLine();
        String searchWord = scanner.nextLine();
        System.out.println("도서번호\t도서제목\t 작가\t 도서분류코드");

        controller.selectBookList(searchWord).forEach(bookVO -> {
            System.out.printf("%s\t%-30s\t%-10s\t%s\t%s\n", bookVO.getBookNum(), bookVO.getBookTt(), bookVO.getAth(), bookVO.getBookCfnCod(), bookVO.getAscertain());
        });
        return HomeMenu.BORR_SELECT.getMenu();
    }
    //6번
    public int searchbook1(BookController controller) throws Exception {
        scanner.nextLine();
        String searchWord = scanner.nextLine();
       // System.out.println("도서번호\t도서제목\t작가\t도서분류코드\t대출가능여부");
        System.out.printf("%s\t%s\t%-10s\t%s\t%s\n", "도서번호", "도서제목","작가","도서분류코드","대출가능여부");
        controller.selectBookList(searchWord).forEach(bookVO -> {
            System.out.printf("%s\t%-30s\t%-10s\t%s\t%s\n", bookVO.getBookNum(), bookVO.getBookTt(), bookVO.getAth(), bookVO.getBookCfnCod(), bookVO.getAscertain());
        });
        return HomeMenu.BORR_SELECT2.getMenu();
    }
    public int borrow(BorrowController controller) throws Exception {        
        List<BorrowVO> voList = controller.findAll();
         controller.findAll().forEach(borrowVO -> {
            System.out.println(borrowVO.getBookNum()+"\t"+borrowVO.getBookTt()+"\t"+ borrowVO.getAth()+
                  "\t"+ borrowVO.getBorrDate()+"\t"+borrowVO.getBorrEndDate());
         });
         return HomeMenu.BORR.getMenu();
     }

 	public int getMemberInfo(JoinController controller) {

    	JoinMemberVO member = controller.findMember();
    	
        System.out.printf("아이디: %s\n", member.getMemId());
        System.out.printf("비밀번호: %s\n", member.getPw());
        System.out.printf("이름: %s\n", member.getMemNm());
        System.out.printf("주소: %s\n", member.getAddr());
        System.out.printf("휴대전화번호: %s\n", member.getPh());
        System.out.printf("이메일: %s\n", member.getEmail());
        return HomeMenu.MEMBER.getMenu();
    }

    public int modifyInfo(JoinController controller, HomeMenu menu) {
        scanner.nextLine();
        int resultName = controller.modifyInfo(scanner.nextLine(), menu);
        if (resultName == 1) {
            System.out.println("정상적으로 수정되었습니다.");
        }
        return HomeMenu.MEMBER.getMenu();
    }
    public int deleteMember(JoinController controller, String deleteMemId, String pw, HomeMenu menu) throws Exception {
    	int number;
    	try {
			scanner.nextLine();
			System.out.println();
			System.out.print("아이디: ");
			String deleteId = scanner.nextLine();
			System.out.print("비밀번호: ");
			String deletePw = scanner.nextLine();
			int deleteMemberId = controller.deleteMember(deleteId, deletePw);
			if(deleteMemberId == 1){
				System.out.println("탈퇴가 완료 되었습니다.");
				number = HomeMenu.HOME.getMenu();
			} else {
				System.out.println("정보가 일치하지 않습니다.");
				number = HomeMenu.MEMBER.getMenu();
			}
			return number;
		} catch (Exception e) {
			System.out.println("🖐잠깐!))대출 중인 목록이 있습니다. 확인해주세요.");
    		number = HomeMenu.BORR.getMenu();
		}
		return number;
    }
    // 대여
    public int borrBook(BorrowController controller, int bookNum, HomeMenu menu) {
    	int number;
    	try {
    		scanner.nextLine();
    		int bookNum1 = scanner.nextInt();
    		int borrBook = controller.borrBook(bookNum1);
    		if(borrBook == 1) {
    			System.out.println("대출이 완료되었습니다.");
    			number = HomeMenu.BORR.getMenu();
    			controller.bookSelect(bookNum1);
    		}else {
    			System.out.println("대출중입니다.");
    			number = HomeMenu.BORR.getMenu();
    		}
    		return number;
    	}
    	catch (Exception e) {
    		System.out.println("로그인이 필요합니다. 로그인해주세요.");
    		number = HomeMenu.HOME.getMenu();
    	}
    	return number;
    }
    // 반납
    public int returnBook(BorrowController controller, int deletNum, HomeMenu menu) throws Exception {
    	int number;
    	List<BorrowVO> voList = controller.findAll();
    	System.out.println("");
        controller.findAll().forEach(borrowVO -> {
       	 System.out.printf("도서번호: %d\t도서제목: %s\t저자: %s\n대출시작일: %s\t 대출종료일: %s\n",borrowVO.getBookNum(),borrowVO.getBookTt(),borrowVO.getAth(),borrowVO.getBorrDate(), borrowVO.getBorrEndDate());
       });System.out.print("\n반납 할 도서번호를 선택하세요: ");
    	scanner.nextLine();
    	int deletNum1 = scanner.nextInt();
    	int returnBook = controller.returnBook(deletNum1);
    	if(returnBook == 1) {
    		System.out.println("반납이 정상적으로 처리되었습니다.");
    		number = HomeMenu.BORR.getMenu();
    		controller.borrowRentSelect(deletNum1);
    	}else {
    		System.out.println("반납이 정상적으로 처리되지않았습니다. 도서번호를 확인해주세요.");
    		number = HomeMenu.BORR.getMenu();
    	}
		return number;
	}
    // 연장
    public int extendBook(BorrowController controller, int bookNum, HomeMenu menu) {
    	int number;
    	List<BorrowVO> voList = controller.findAll();
    	System.out.println("");
        controller.findAll().forEach(borrowVO -> {
       	 System.out.printf("도서번호: %d\t도서제목: %s\t저자: %s\n대출시작일: %s\t 대출종료일: %s\n",borrowVO.getBookNum(),borrowVO.getBookTt(),borrowVO.getAth(),borrowVO.getBorrDate(), borrowVO.getBorrEndDate());
       });System.out.print("\n연장 할 도서번호를 선택하세요: ");
    	scanner.nextLine();
    	int bookNum1 = scanner.nextInt();
    	System.out.println();
    	int extendBook = controller.extendBook(bookNum1);
    	if(extendBook == 1) {
    		System.out.println("연장이 완료되었습니다.");
    		number = HomeMenu.BORR_LIST.getMenu();
    	}else {
    		System.out.println("🖐잠깐!))연장 가능 횟수를 초과하였거나 연체중인 도서입니다.");
    		number = HomeMenu.BORR.getMenu();
    	}
		return number;
    }
    //연체
    public int overduelist(BorrowController controller) throws Exception {
        List<BorrowVO> voList = controller.overduelist();
         controller.overduelist().forEach(borrowVO -> {
        	 System.out.printf("회원ID:%s\t 도서번호:%s\t 대출연장횟수:%s\t 대출종료일:%s\t 대출시작일:%s\t 도서연체일:%s일\t \n",borrowVO.getMemId(),borrowVO.getBookNum(),borrowVO.getBorrExteCnt(),borrowVO.getBorrEndDate(),borrowVO.getBorrDate(), borrowVO.getBorrOveDate());
         });
         return HomeMenu.BORR.getMenu();
     }
}
