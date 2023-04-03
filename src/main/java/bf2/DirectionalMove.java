package bf2;

public class DirectionalMove extends Command{
    int changeX_;
    int changeY_;
    public DirectionalMove(int changeX, int changeY){
        changeX_ = changeX;
        changeY_ = changeY;
    }
}
