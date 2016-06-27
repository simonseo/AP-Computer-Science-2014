/*
 * Program Design
 * 
 * Waterfall Model (이름만 거창한)
 * 	1. Analysis of the specification (or just specification) 인간 언어로 기획하는 단계
 * 		무조건 무조건 일단 일단 절대로 무슨 문제가 생기기 전에 기획자랑 상의한다.
 * 	2. Program Design 여기까지는 실제로 프로그램을 짜지는 않음. 프로그램 언어로 기획
 * 	3. Program Implementation 프로그램을 짬
 * 		object-oriented program design
 * 			├Basic Object: StockItem
 * 			├Collection: Inventory (list of StockItems)
 * 			├Controller: Store (Has an Inventory,  uses StoreDisplay)
 * 			└Display: StoreDisplay (could be a GUI)
 * 		UML Design Unified Modeling language
 * 		점선: Interface Implements
 * 		빈 실선: Abstract Extends (is-a 관계)
 * 		꽉찬 실선: 하위 클래스 use
 *	4. Testing and Debugging
 *		4-1.┌동작하는 모든 input
 *			├동작하는 모든 input 사이에 있는 숫자 최소 한개
 *			├음수
 *			└범위 바깥의 수
 *		4-5.┌compile-time error 문법이 안 맞는 부분. eclipse가 찾아주는 거
 *			├run-time error 문법은 다 맞지만 돌리는 게 불가능한 요청을 하는 거 / null-pointer exception error 주소를 찾아갔지만 아무것도 없음. / Out of Bounds Exception string 자릿수 부족 등 / class cast error polymorphism downcasting 실패 
 *			└logic error 분명히 1을 넣으면 2가 나와야 되는데 3이 나와!!!
 *	↑↑↑↑↑Wizet 역할↑↑↑↑↑ 
 *	↓↓↓↓↓Nexon 역할↓↓↓↓↓ 
 *	5. Maintenance
 * 
 * 
 */
public class semin2_Program_Design {

}
