package bitcamp.myapp;

public class InkedList {

  Dode head = null;
  Dode tail = null;
  int size = 0;

  public void add(Object value) {
    size++;
    Dode node = new Dode(value);

    if (this.head == null) {
      this.head = node;
      this.tail = node;
      return;
    }

    this.tail.next = node;
    this.tail = node;
  }

  public void add(int index, Object value) {
    Dode cursor = head;
    Dode node = new Dode(value);
    size++;

    if (index <= 0) {
      node.next = this.head;
      this.head = node;
      return;
    }
    if (index + 1 >= size - 1) {
      this.tail.next = node;
      this.tail = node;
      return;
    }

    for (int i = 1; i < index; i++) {
      cursor = cursor.next;
    }
    Dode tmp = cursor.next;
    cursor.next = node;
    node.next = tmp;
  }

  public boolean remove(int index) {
    Dode cursor = this.head;
    if (index >= size || index < 0) {
      return false;
    }
    if (size <= 0) {
      this.head = null;
      this.tail = null;
      return false;
    }

    if (index == 0) {
      this.head = this.head.next;
      if (size == 1) {
        this.tail = null;
      }
      size--;
      return true;
    }

    if (index + 1 == size) {
      this.tail = this.get(size - 2);
      this.get(size - 2).next = null;
      return true;
    }

    for (int i = 1; i < index; i++) {
      cursor = cursor.next;
    }
    cursor.next = cursor.next.next;
    if (size == 1) {
      this.tail = null;
    }
    size--;
    return true;
  }

  public boolean remove(Object value) {
    Dode cursor = this.head;
    int index = 0;
    while (cursor != null) {
      if (cursor.value.equals(value)) {
        return remove(index);
      }
      cursor = cursor.next;
      index++;
    }
    return false;
  }

  public Dode get(int index) {
    Dode cursor = this.head;
    if (index >= size) {
      return null;
    }
    for (int i = 0; i < index; i++) {
      if (cursor == null) {
        break;
      }
      cursor = cursor.next;
    }

    return cursor;
  }

  public int indexOf(Object value) {
    int index = -1;
    Dode cursor = this.head;
    for (int i = 0; i < size; i++) {
      if (cursor == null) {
        break;
      }
      if (cursor.value.equals(value)) {
        index = i;
      }
      cursor = cursor.next;
    }
    return index;
  }

  public void update(int index, Object value) {
    // Dode cursor = this.head;
    // if (this.size <= 0 || index >= this.size) {
    // return;
    // }
    // if (index == 0) {
    // this.head.value = value;
    // return;
    // } else if (index == size - 1) {
    // this.tail.value = value;
    // return;
    // }
    if (index >= size) {
      return;
    }
    this.get(index).value = value;
  }

  public boolean contains(Object value) {
    Dode cursor = this.head;
    while (cursor != null) {
      if (cursor.value.equals(value)) {
        return true;
      }
      cursor = cursor.next;
    }

    return false;
  }

  @Override
  public String toString() {
    String all = "InkedList [";
    Dode cursor = this.head;
    while (cursor != null) {
      all += cursor.value.toString();
      cursor = cursor.next;
      if (cursor != null) {
        all += ", ";
      }
    }
    all += "]";
    return all;
  }
}
