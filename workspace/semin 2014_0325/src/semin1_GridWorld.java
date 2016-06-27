/*
 * Actor class (모든 Actor는 direction 이랑 color가 있다)
    * Flower is a Actor
    * - 한 턴마다 계속 어두워진다
    * Rock is a Actor
    * - 그냥 있는 장애물이다
    * Bug is a Actor
    * - 한턴이 지날 때마다 앞으로 한 칸 움직이면서 전에 있던 자리에 꽃을 싼다. 
    * - 앞에 장애물이 있으면 한턴을 소모하면서 45도를 시계방향으로 돈다.
    * Box Bug is a bug
    * - 시작하는 지점에서 부터 2가 들어갔으면 2x2의 박스를 오른쪽방향으로 만들어간다
    * - 앞에 장애물이 있으면 90도 시계방향으로 돌고 새로 박스를 만든다
    * Critter is a Actor
    * - 시작하는 순가 주변에 있는 8칸 안에 있는 Flower & Bug를 먹는다.
    * - 그리고 한 턴을 소모하면서 8칸 중에 있는 빈칸에 랜덤으로 간다.
    * 카멜레온 critter is a Critter
    * - override 해서 먹지는 않음. 
    * - 주변에 있는 8칸의 대상을 랜덤으로 정해서 그 색깔로 바꾸고
    * - 8칸중에 빈칸으로 랜덤으로 움직인다.
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
 * act()왜 있는지 모름
 * toString
 * 
 * rock class : default 검뎅이
 * flower class : 핑크색
 * bug class : turn() move() act-> canMove() 호출; if true, move; if false, turn.
 * BoxBug : BoxBug(SideLength) 	
 * Critter : processActors()쳐먹음 getMoveLocations() selectMoveLocation() makeMove 
 * ChameleonCritter : processActors() 대신 색 바꿈 makMove()
 * 
 */
public class semin1_GridWorld 
{

}
