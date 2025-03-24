package ex0227.ex02;

/**
 * 상품의 정보 : 상품종류(Tv, Vedio, Audio, ....) , 모델정보
 * */
public class Product<K , M> {
  private K kind;
  private M model;
  
	public K getKind() {
		return kind;
	}
	public void setKind(K kind) {
		this.kind = kind;
	}
	
	public M getModel() {
		return model;
	}
	public void setModel(M model) {
		this.model = model;
	}
  
  
}
