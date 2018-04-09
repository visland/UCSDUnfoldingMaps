interface Printable {
  public void print();
}

interface Moveable {
  public void move(double a, double b);
}

abstract class MachineBase implements Printable, Moveable {
  double x_, y_;
}

// Java does NOT allow multiple inheritance.
class Machine1 extends MachineBase {
  public void print() {
    System.out.println("Machine1");
  }
  public void move(double x, double y) {
    x_ = x;
    y_ = y;
  }
}

class Machine2 extends MachineBase implements Printable, Moveable {
  public void print() {
    System.out.println("Machine2");
  }
  public void move(double radius, double theta) {
    x_ = radius * Math.sin(theta);
    y_ = radius * Math.cos(theta);
  }
}

public class Interface {
  public static void main(String[] args) {
    MachineBase[] machines = {
      new Machine1(),
      new Machine2()
    };
    for (MachineBase m: machines) {
      m.print();
    }
  }
}
