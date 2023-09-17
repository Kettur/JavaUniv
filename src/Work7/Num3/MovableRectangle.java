package Work7.Num3;

public class MovableRectangle implements Movable{
    MovablePoint p1, p2;

    MovableRectangle(int x1, int x2, int y1, int y2, int speedY, int speedX){
        p1 = new MovablePoint(x1, y1, speedY, speedX);
        p2 = new MovablePoint(x2, y2, speedY, speedX);
    }
    @Override
    public void moveX() {
        p1.moveX();
        p2.moveX();
    }

    @Override
    public void moveY() {
        p1.moveY();
        p2.moveY();
    }

    @Override
    public void chSpeedY(int amount) {
        p1.chSpeedY(amount);
        p2.chSpeedY(amount);
    }

    @Override
    public void chSpeedX(int amount) {
        p1.chSpeedX(amount);
        p2.chSpeedX(amount);
    }
    public boolean SpeedTest(){
        return (p1.speedX == p2.speedX && p1.speedY == p2.speedY);
    }
}
