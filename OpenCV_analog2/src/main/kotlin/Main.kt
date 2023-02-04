//import org.opencv.core.*
//import org.opencv.imgproc.Imgproc.*
//import org.opencv.videoio.VideoCapture
//import org.opencv.highgui.HighGui.*
//import kotlin.system.exitProcess
//
//fun main() {
//    var capture = VideoCapture(0)
//    var windowName = "Original Image"
//    var windowNameGaussian = "Gaussian Blurred Image"
//    namedWindow(windowName, WINDOW_NORMAL)
//    namedWindow(windowNameGaussian, WINDOW_NORMAL)
//
//    var frame = Mat()
//    while (true) {
//        capture.read(frame)
//        if (!frame.empty()) {
//            var gray = Mat()
//            cvtColor(frame, gray, COLOR_BGR2GRAY)
//
//            var gaussianBlurred = Mat()
//            GaussianBlur(gray, gaussianBlurred, Size(15.0, 15.0), 0.0)
//
//            imshow(windowName, frame)
//            imshow(windowNameGaussian, gaussianBlurred)
//        }
//
//        var key = waitKey(1)
//        if (key == 27) {
//            break
//        }
//    }
//
//    capture.release()
//    destroyAllWindows()
//    exitProcess(0)
//}