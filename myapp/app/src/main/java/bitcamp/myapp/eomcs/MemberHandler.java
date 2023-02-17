package bitcamp.myapp.eomcs;

public class MemberHandler {
  private String title;
  private final int SIZE = 100;
  private int count = 0;

  private MemberHandler() {
    this.title = Prompt.inputString("리스트 제목 : ");
  }

  public static MemberHandler creat() {
    MemberHandler tmp = new MemberHandler();
    return tmp;
  }

  // 레퍼런스 배열 준비
  public Member[] members = new Member[SIZE];

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public int getCount() {
    return count;
  }

  public void setCount(int count) {
    this.count = count;
  }

  public int getSIZE() {
    return SIZE;
  }

  public void inputMember() {
    Member m = new Member();

    this.members[this.count++] = m;
  }

  public void printMembers() {
    System.out.println("번호\t이름\t전화\t재직\t전공");

    for (int i = 0; i < count; i++) {
      Member m = members[i];
      System.out.printf("%d\t%s\t%s\t%s\t%s\n", m.getNo(), m.getName(), m.getTel(),
          m.isWorking() ? "예" : "아니오", getLevelText(m.getLevel()));
    }
  }

  public void printMember() {
    int memberNo = Prompt.inputInt("회원번호? ");

    Member m = findByNo(memberNo);

    if (m == null) {
      System.out.println("해당 번호의 회원이 없습니다.");
      return;
    }

    System.out.printf("    이름: %s\n", m.getName());
    System.out.printf("    전화: %s\n", m.getTel());
    System.out.printf("우편번호: %s\n", m.getPostNo());
    System.out.printf("기본주소: %s\n", m.getBasicAddress());
    System.out.printf("상세주소: %s\n", m.getDetailAddress());
    System.out.printf("재직여부: %s\n", m.isWorking() ? "예" : "아니오");
    System.out.printf("    성별: %s\n", m.getGender() == 'M' ? "남자" : "여자");
    System.out.printf("    전공: %s\n", getLevelText(m.getLevel()));
    System.out.printf("  등록일: %s\n", m.getCreatedDate());
  }

  static String getLevelText(int level) {
    switch (level) {
      case 0:
        return "비전공자";
      case 1:
        return "준전공자";
      default:
        return "전공자";
    }
  }

  public void modifyMember() {
    int memberNo = Prompt.inputInt("회원번호? ");

    Member old = findByNo(memberNo);

    if (old == null) {
      System.out.println("해당 번호의 회원이 없습니다.");
      return;
    }

    // 변경할 데이터를 저장할 인스턴스 준비
    Member m = new Member();
    m.setNo(old.getNo());
    m.setCreatedDate(old.getCreatedDate());
    m.setName(Prompt.inputString(String.format("이름(%s)? ", old.getName())));
    m.setTel(Prompt.inputString(String.format("전화(%s)? ", old.getTel())));
    m.setPostNo(Prompt.inputString(String.format("우편번호(%s)? ", old.getPostNo())));
    m.setBasicAddress(Prompt.inputString(String.format("기본주소(%s)? ", old.getBasicAddress())));
    m.setDetailAddress(Prompt.inputString(String.format("상세주소(%s)? ", old.getDetailAddress())));
    m.setWorking(Prompt.inputInt(
        String.format("0. 미취업\n1. 재직중\n재직여부(%s)? ", old.isWorking() ? "재직중" : "미취업")) == 1);
    m.setGender(Prompt.inputInt(
        String.format("0. 남자\n1. 여자\n성별(%s)? ", old.getGender() == 'M' ? "남자" : "여자")) == 0 ? 'M'
            : 'W');
    m.setLevel((byte) Prompt.inputInt(
        String.format("0. 비전공자\n1. 준전공자\n2. 전공자\n전공(%s)? ", getLevelText(old.getLevel()))));

    String str = Prompt.inputString("정말 변경하시겠습니까?(y/N) ");
    if (str.equalsIgnoreCase("Y")) {
      members[indexOf(old)] = m;
      System.out.println("변경했습니다.");
    } else {
      System.out.println("변경 취소했습니다.");
    }

  }

  public void deleteMember() {
    int memberNo = Prompt.inputInt("회원번호? ");

    Member m = findByNo(memberNo);

    if (m == null) {
      System.out.println("해당 번호의 회원이 없습니다.");
      return;
    }

    String str = Prompt.inputString("정말 삭제하시겠습니까?(y/N) ");
    if (!str.equalsIgnoreCase("Y")) {
      System.out.println("삭제 취소했습니다.");
      return;
    }

    for (int i = indexOf(m) + 1; i < count; i++) {
      members[i - 1] = members[i];
    }
    members[--count] = null; // 레퍼런스 카운트를 줄인다.

    System.out.println("삭제했습니다.");

  }

  public Member findByNo(int no) {
    for (int i = 0; i < count; i++) {
      if (members[i].getNo() == no) {
        return members[i];
      }
    }
    return null;
  }

  public int indexOf(Member m) {
    for (int i = 0; i < count; i++) {
      if (members[i].getNo() == m.getNo()) {
        return i;
      }
    }
    return -1;
  }

  public void service() {
    while (true) {
      System.out.println("[회원 관리]");
      System.out.println("1. 등록");
      System.out.println("2. 목록");
      System.out.println("3. 조회");
      System.out.println("4. 변경");
      System.out.println("5. 삭제");
      System.out.println("0. 이전");
      int menuNo = Prompt.inputInt("회원관리> ");

      switch (menuNo) {
        case 0:
          return;
        case 1:
          inputMember();
          break;
        case 2:
          printMembers();
          break;
        case 3:
          printMember();
          break;
        case 4:
          modifyMember();
          break;
        case 5:
          deleteMember();
          break;
        default:
          System.out.println("잘못된 메뉴 번호 입니다.");
      }
    }
  }
}
