public class Main7 {
    public static void main(String[] args) {
        StockMarket stockMarket = new StockMarket();

        Observer mobileApp = new MobileApp("MyMobileApp");
        Observer webApp = new WebApp("MyWebApp");

        stockMarket.registerObserver(mobileApp);
        stockMarket.registerObserver(webApp);

        stockMarket.setStockPrice("AAPL", 187.50);
        stockMarket.setStockPrice("GOOGL", 2720.10);

        stockMarket.removeObserver(webApp);
        stockMarket.setStockPrice("TSLA", 650.25);
    }
}
