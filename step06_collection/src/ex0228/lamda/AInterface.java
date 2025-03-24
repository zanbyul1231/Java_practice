package ex0228.lamda;
/**
 * 함수형인터페이스
 *  : 반드시 메소드가 한개만 존재한다.(단, static, default 메소드 가능)
 * */
@FunctionalInterface
public interface AInterface {
   void aa();
   
   static void ff() {}
}
