package interview;

public interface Light {

    enum COLOR {

        RED(1), RED_YELLOW(2), YELLOW(3), GREEN(4);

        int color;

        COLOR(int color){
            this.color = color;
        }
    }

    COLOR getState();
}