public class WebApp implements Observer {
    private String siteName;

    public WebApp(String siteName) {
        this.siteName = siteName;
    }

    @Override
    public void update(String stockName, double stockPrice) {
        System.out.println(siteName + " - Stock updated: " + stockName + " at $" + stockPrice);
    }
}
