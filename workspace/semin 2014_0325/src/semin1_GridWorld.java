/*
 * Actor class (��� Actor�� direction �̶� color�� �ִ�)
    * Flower is a Actor
    * - �� �ϸ��� ��� ��ο�����
    * Rock is a Actor
    * - �׳� �ִ� ��ֹ��̴�
    * Bug is a Actor
    * - ������ ���� ������ ������ �� ĭ �����̸鼭 ���� �ִ� �ڸ��� ���� �Ѵ�. 
    * - �տ� ��ֹ��� ������ ������ �Ҹ��ϸ鼭 45���� �ð�������� ����.
    * Box Bug is a bug
    * - �����ϴ� �������� ���� 2�� ������ 2x2�� �ڽ��� �����ʹ������� ������
    * - �տ� ��ֹ��� ������ 90�� �ð�������� ���� ���� �ڽ��� �����
    * Critter is a Actor
    * - �����ϴ� ���� �ֺ��� �ִ� 8ĭ �ȿ� �ִ� Flower & Bug�� �Դ´�.
    * - �׸��� �� ���� �Ҹ��ϸ鼭 8ĭ �߿� �ִ� ��ĭ�� �������� ����.
    * ī�᷹�� critter is a Critter
    * - override �ؼ� ������ ����. 
    * - �ֺ��� �ִ� 8ĭ�� ����� �������� ���ؼ� �� ����� �ٲٰ�
    * - 8ĭ�߿� ��ĭ���� �������� �����δ�.
 * rock flower bug critter
 * Location(int r, int c)
 * accessor:
	 * getRow()
	 * getCol()
	 * getAdjecentLocation(dircetion)
	 * getDirectionToward
	 * 
 * 
 * Actor Class Actor Class Actor Class Actor Class
 * Actor() Blue and North by default
 * 	///Accessor///
 * getColor
 * getDirection
 * getGid
 * getLocation
 * 	///Mutator///
 * setColor
 * seDirection
 * 
 * putSelfInGrid(Grid#, Location#)
 * removeSelfFromGrid(~~)
 * moveTo(Location#)
 * act()�� �ִ��� ��
 * toString
 * 
 * rock class : default �˵���
 * flower class : ��ũ��
 * bug class : turn() move() act-> canMove() ȣ��; if true, move; if false, turn.
 * BoxBug : BoxBug(SideLength) 	
 * Critter : processActors()�ĸ��� getMoveLocations() selectMoveLocation() makeMove 
 * ChameleonCritter : processActors() ��� �� �ٲ� makMove()
 * 
 */
public class semin1_GridWorld 
{

}
