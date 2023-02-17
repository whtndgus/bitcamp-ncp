package bitcamp.backend.user.dao;

import bitcamp.backend.user.vo.User;

public class UserDao {
  User[] users = new User[1000000];
  int count = 0;

  public UserDao() {

  }

  public void insertUser(User u) {
    this.users[this.count++] = u;
  }

  public void changeUser(User u, int idx) {
    this.users[idx].change(u.getName(), u.isWorking(), u.getGender(), u.getLevel());;
  }

  public void removeUser(int idx) {
    for (int i = idx; i < this.count - 1; i++) {
      this.users[i] = this.users[i + 1];
    }
  }

  public void resetUser() {
    this.users = new User[1000000];
    count = 0;
  }



  public User[] getUsers() {
    return users;
  }

  public void setUsers(User[] users) {
    this.users = users;
  }

  public int getCount() {
    return count;
  }

  public void setCount(int count) {
    this.count = count;
  }
}
