/*
import org.opencv.core.*
import org.opencv.imgproc.Imgproc
import org.opencv.videoio.VideoCapture

fun main() {
    var cap = VideoCapture(0)

    while (true) {
        var ret = cap.read(Mat())
        if (!ret) break

        var gray = Mat()
        Imgproc.cvtColor(ret, gray, Imgproc.COLOR_BGR2GRAY)

        var gaussian = Mat()
        Imgproc.GaussianBlur(gray, gaussian, Size(15.0, 15.0), 0.0)

        Imgproc.imshow("Original", ret)
        Imgproc.imshow("Gaussian", gaussian)

        var key = Imgproc.waitKey(1)
        if (key == 27) break
    }

    cap.release()
    Imgproc.destroyAllWindows()
}
*/
