public class Main {
    public static void main(String[] args) {
        Product product = new Product(1,"Bardak","Cam Bardak",1.234,21);


        ProductManager productManager = new ProductManager();
        productManager.Add(product);

        System.out.println(product.getKod());
    }
}