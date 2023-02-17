package bitcamp.myapp.eomcs;

public class App {
  static MemberHandler[] mems = new MemberHandler[1000];
  static int count = 0;

  public static void main(String[] args) {
    goMainMenu();
    System.out.println("안녕히 가세요!");

    // 프로그램이 사용한 자원 해제하기
    Prompt.close();
  } // main()

  private static void goMainMenu() {
    while (true) {
      System.out.println("1. 회원 관리");
      System.out.println("9. 종료");
      int menuNo = Prompt.inputInt("메뉴> ");

      if (menuNo == 1) {
        selectStudy();
      } else if (menuNo == 9) {
        break;
      } else {
        System.out.println("잘못된 메뉴 번호 입니다.");
      }
    }
  }

  private static void selectStudy() {
    if (count > 0) {
      for (int i = 0; i < count; i++) {
        System.out.println(i + ". " + mems[i].getTitle());
      }
      System.out.println("-1. 리스1" + "1트 추가 생성");
      int sel = Prompt.inputInt("리스트 선택 => ");
      if (sel >= 0 && sel < count) {
        mems[sel].service();
      } else {
        makeList();
      }

    } else {
      String sel = Prompt.inputString("현재 등록된 관리 리스트가 없습니다.\n1. 추가 생성\n2. 종료\n선택 => ");
      if (sel.equals("1")) {
        makeList();
      }
    }
  }

  private static void makeList() {
    mems[count++] = MemberHandler.creat();
  }
} // class App


