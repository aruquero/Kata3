package kata3;

public class Kata3 {

    public static void main(String[] args) {
        
        Histogram histogram = new Histogram();
        histogram.increment("chano.es");
        histogram.increment("ulpgc.es");
        histogram.increment("ulpgc.es");
        histogram.increment("chano.es");
        histogram.increment("chano.es");
        histogram.increment("ulpgc.es");
        histogram.increment("ulpgc.es");
        histogram.increment("feluco.es");
        histogram.increment("feluco.es");
        histogram.increment("chano.es");
        
        HistogramDisplay histogramD = new HistogramDisplay(histogram);
        histogramD.execute();
    }
    
}
