package ex0226.exam;

/**
 * 1)모든 필드는 public static final
 * 2) 모든 메소드는 public abstract
 *   의 1) ,2)는 자동으로 붙는다.
 * 
 *   단) jdk 8 version 이후 static, default, private 가능하다 이러면 기능을 추가할수 있다.
 * */
public interface ElecFunction {
    void start();
    void stop();
    void display();
}
