package Lab1.Ex7;

public  abstract class Product  {
        private int id;
        private double price;
        private String name;
        private static int quantity;
        private double weight;

         public Product(int id, double price, String name, double weight) {
          this.id = id;
          this.price = price;
          this.name = name;
          this.weight = weight;
          
        }
        
        public void applySaleDiscount(double percentage){
          this.price = this.price - ((percentage/100) * this.price);
        }
      
        public final void addToShoppingCart(){
          System.out.println(this.name + " has been added to the shopping cart.");
        }
      
        public int getTotalQuantity(){
          return Product.quantity;
        }
        
        public void getSellableStatus(){
          System.out.println("This product is sellable");
        }
      
        public String toString(){
          return "Product info:\n+Id: " + this.id + "\t" + "name: " + this.name +
            "\tPrice: SR" + this.price;
        }
        public int getId() {
          return id;
        }
        public void setId(int id) {
          this.id = id;
        }
        public double getPrice() {
          return price;
        }
        public void setPrice(double price) {
          this.price = price;
        }
        public String getName() {
          return name;
        }
        public void setName(String name) {
          this.name = name;
        }
        public static int getQuantity() {
          return quantity;
        }
        public static void setQuantity(int quantity) {
          Product.quantity = quantity;
        }
        public double getWeight() {
          return weight;
        }
        public void setWeight(double weight) {
          this.weight = weight;
        }
      }

