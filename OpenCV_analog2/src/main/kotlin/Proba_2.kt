//Успешный вариант аналога этого кода на питоне.
import org.opencv.imgproc.Imgproc
import org.opencv.videoio.VideoCapture
import org.opencv.core.Core
import org.opencv.core.Mat
import org.opencv.core.Size
import org.opencv.highgui.HighGui.*
import kotlin.system.exitProcess

fun main() {
    System.loadLibrary(Core.NATIVE_LIBRARY_NAME)

    var cap = VideoCapture(0)
    var key = -1
    var frame = Mat()
    while (key != 27) {
        var ret = cap.read(frame)
        if (!ret) break

        var gray = Mat()
        Imgproc.cvtColor(frame, gray, Imgproc.COLOR_BGR2GRAY)
        var gaussian = Mat()
        Imgproc.GaussianBlur(gray, gaussian, Size(15.0, 15.0), 0.0)

        imshow("Original", frame)
        imshow("Gaussian", gaussian)

        key = waitKey(27)
    }
    cap.release()
    destroyAllWindows()
    exitProcess(0)
}
