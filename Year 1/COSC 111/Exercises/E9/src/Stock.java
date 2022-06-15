
public class Stock {

		private String symbol, name;
		private double prevClosingPrice, currentPrice;
		
		public Stock(String symbol, String name) {
			this.symbol = symbol;
			this.name = name;
		}
		
		public void setName(String name) {
			this.name = name;
		}
		public String getName() {
			return name;
		}
		
		public void setPrevClosingPrice(double closingPrice) {
			prevClosingPrice = closingPrice;
		}
		public double getPrevClosingPrice() {
			return prevClosingPrice;
		}
		
		public void setCurrentPrice(double price) {
			currentPrice = price;
		}
		public double getCurrentPrice() {
			return currentPrice;
		}
		
		public void setSymbol(String symbol) {
			this.symbol = symbol;
		}
		public String getSymbol() {
			return symbol;
		}
		

		
		public double getChangePercent() {
			return (currentPrice - prevClosingPrice) / prevClosingPrice * 100 ;
		}
		
		public void displayInfo() {
			System.out.println("Stock name: " + getName());
			System.out.println("Previous Closing Price: " + getPrevClosingPrice());
			System.out.println("Current price: " + getCurrentPrice());
			System.out.println("Price change: " + getChangePercent() + "%");
		}
}
