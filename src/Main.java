import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
class Product {
    private String nome;
    private String category;
    private double price;

    public Product(String nome, String category, double price) {
        this.nome = nome;
        this.category = category;
        this.price = price;
    }

    public String getNome() {
            return nome;
    }

    public double getPrice() {
        return price;
    }
    public String getCategory() {
        return category;
    }
    @Override
    public String toString() {
        return "Product{nome='" + nome + "', category='" + category + "', price=" + price + "}";
    }
   public class StreamExample {
        public static void main(String[] args) {
            List<Product> products = Arrays.asList(
                    new Product("A", "Book", 120),
                    new Product("B", "Book", 20),
                    new Product("C", "Book", 80)
            );

            List<Product> filteredProduct =products.stream()
                    .filter(product -> "Books".equalsIgnoreCase(product.getCategory()))
                    .filter(p -> p.getPrice() > 100) // Filtra per prezzo > 100
                    .collect(Collectors.toList());
            System.out.println(filteredProduct);



        }
        
   }
}