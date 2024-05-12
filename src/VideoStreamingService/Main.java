package VideoStreamingService;

public class Main {
    public static void main(String[] args) {
        TvSeries data = new TvSeries("Shat",2,2);
        String info = data.getInfo();
        System.out.println(info);
    }
}
