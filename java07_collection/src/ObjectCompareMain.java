import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ObjectCompareMain {
	List<ProductDTO> list = new ArrayList<ProductDTO>();
	public ObjectCompareMain() {
		// 객체 내의 값을 이용하여 정렬하기 
		// 객체 내 값이 숫자인 경우와 문자인 경우로 구분

		list.add(new ProductDTO(10001, "엘라스틴",	23500,	12));
		list.add(new ProductDTO(10021, "컴퓨터본체",  	32000,	6));
		list.add(new ProductDTO(10051, "티셔츠",    	10000,	32));
		list.add(new ProductDTO(10005, "운동화",     	9000,  	25));
		list.add(new ProductDTO(10100, "식용류",     	25000, 	3));
		list.add(new ProductDTO(10011, "올리브유",    	7200,  	15));
		
		System.out.println("******정렬전*******");
		ProductPrint();
		
		// 문자(상품명)을 기준으로 오름차순으로 정렬
		//				정렬대상	정렬기준
		Collections.sort(list, new CompareProductNameDsc() );
		System.out.println("******정렬후*******");
		ProductPrint();
		// 숫자
		
		Collections.sort(list, new ComparePriceDsc() );
		System.out.println("******정렬후*******");
		ProductPrint();
		

	}
		
	//숫자(가격)을 기준으로 오름차순 정렬
	class ComparePriceAsc implements Comparator<ProductDTO>{
		public int compare(ProductDTO dto1, ProductDTO dto2) {
			//dto1의 가격이 크면 + , dto1의 가격이 크지 않으면 같은지 비교해서 같으면 0 같지 않으면 - 	
			return (dto1.getPrice() >dto2.getPrice())?+1:(dto1.getPrice() == dto2.getPrice()?0:-1);
		}
	}
	//숫자(가격)을 기준으로 내림차순 정렬
	class ComparePriceDsc implements Comparator<ProductDTO>{
		public int compare(ProductDTO dto1, ProductDTO dto2) {
			//dto1의 가격이 크면 + , dto1의 가격이 크지 않으면 같은지 비교해서 같으면 0 같지 않으면 - 	
			return (dto2.getPrice() >dto1.getPrice())?+1:(dto2.getPrice() == dto1.getPrice()?0:-1);
		}
	}

	//크기를 비교해주는 compare메소드는 Comparator 인터페이스에 있는 compare를 
	// 오버라이딩해서 쓴다. 
	class CompareProductNameAsc implements Comparator<ProductDTO>{
		public int compare(ProductDTO dto1, ProductDTO dto2) {
			return	dto1.getProductName().compareTo(dto2.getProductName());
			// 반환값이 - 인경우 그냥두고
			// 반환값이 + 인경우 dto1의 상품명이 크기 때문에 sort()메소드가 교한
		}
	}
	// 문자열을 내림차순으로 할때는 return할 때 부호를 반대로 해주거나 비교 순서를 반대로 하면 된다. 
	class CompareProductNameDsc implements Comparator<ProductDTO>{
		public int compare(ProductDTO dto1, ProductDTO dto2) {
			return	-dto1.getProductName().compareTo(dto2.getProductName());
		  //return	dto2.getProductName().compareTo(dto1.getProductName());

		}
		
	}
	public void ProductPrint() {
		for (ProductDTO a : list) {
			System.out.println(a.toString());
		}
	}
	public static void main(String[] args) {
		new ObjectCompareMain();
	}

}
