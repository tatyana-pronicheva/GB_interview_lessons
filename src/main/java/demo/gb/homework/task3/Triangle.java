package demo.gb.homework.task3;
import static java.lang.StrictMath.sin;

public class Triangle extends Figure{

    double calculateS(double a, double h) {
        return a*h/2;
    }

    double calculateS(double a, double b, double alfa) {
        return a*b/2*sin(alfa);
    }

    double calculateP(double a, double b, double c) {
        return a+b+c;
    }
}
