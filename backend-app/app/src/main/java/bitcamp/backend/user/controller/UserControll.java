package bitcamp.backend.user.controller;

import java.util.Arrays;
import bitcamp.backend.user.dao.UserDao;
import bitcamp.backend.user.vo.User;

public class UserControll {
  static public UserDao dao = new UserDao();

  static public void insert(String name, String password, String work, String gen, String level) {
    dao.insertUser(new User(dao.getCount(), name, password, (work.equals("0") ? true : false),
        (gen.equals("0") ? true : false), Integer.parseInt(level)));
  }

  static boolean remove(String name, String password) {
    for (int i = 0; i < dao.getCount(); i++) {
      User u = dao.getUsers()[i];
      if (u.getName().equals(name) && u.getPassword().equals(password)) {
        dao.removeUser(i);
        return true;
      }
    }
    return false;
  }

  static public boolean change(String no, String name, String password, String work, String gen,
      String level) {
    for (int i = 0; i < dao.getCount(); i++) {
      User u = dao.getUsers()[i];
      if (u.getName().equals(name) && u.getPassword().equals(password)) {
        dao.changeUser(new User(i, name, password, (work.equals("0") ? true : false),
            (gen.equals("0") ? true : false), Integer.parseInt(level)), i);
        return true;
      }
    }
    return false;
  }

  static public User selectUser(String name) {
    for (int i = 0; i < dao.getCount(); i++) {
      if (dao.getUsers()[i].getName().equals(name)) {
        return dao.getUsers()[i];
      }
    }
    return null;
  }

  static public Object printUser() {
    return Arrays.copyOf(dao.getUsers(), dao.getCount());
  }

  static public void resetUser() {
    dao.resetUser();
  }
}
