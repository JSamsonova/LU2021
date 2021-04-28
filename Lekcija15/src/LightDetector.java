public class LightDetector {

    public static void main(String[] args) {
        int colorRange = 100;
        if ((colorRange >= 380) && (colorRange <= 449)) {
            System.out.println("violet");
        } else if ((colorRange >= 450) && (colorRange <= 494)) {
            System.out.println("blue");

        } else if ((colorRange >= 495) && (colorRange <= 569)) {
            System.out.println("green");

        } else if ((colorRange >= 570) && (colorRange <= 589)) {
            System.out.println("yellow");

        } else if ((colorRange >= 590) && (colorRange <= 619)) {
            System.out.println("orange");
        } else if ((colorRange >= 620) && (colorRange <= 750)) {
            System.out.println("red");
        } else {
            System.out.println("Invisible light");
        }
    }



}
