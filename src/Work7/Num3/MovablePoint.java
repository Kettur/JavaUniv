package Work7.Num3;

public class MovablePoint implements Movable{

    int x, y;
    int speedY, speedX;
    MovablePoint(int x, int y, int speedY, int speedX){
        this.x = x;
        this.y = y;
        this.speedX = speedX;
        this.speedY = speedY;
    }

    @Override
    public void moveX() {
        x+=speedX;
    }

    @Override
    public void moveY() {
        y+=speedY;
    }

    @Override
    public void chSpeedY(int amount) {
        speedY+=amount;
    }

    @Override
    public void chSpeedX(int amount) {
        speedX+=amount;
    }
}
