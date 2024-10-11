
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ProductoDAO productDAO = new ProductoDAO();

        // Insertar un nuevo producto
        Producto newProduct = new Producto(0, "Laptop", 1500.00);
        productDAO.insertProduct(newProduct);

        // Actualizar un producto existente
        Producto existingProduct = new Producto(1, "Desktop", 1200.00);
        productDAO.updateProduct(existingProduct);

        // Obtener un producto por ID
        Producto product = productDAO.getProductById(1);
        System.out.println("Product: " + product.getName() + ", Price: " + product.getPrice());

        // Obtener todos los productos
        List<Producto> products = productDAO.getAllProducts();
        for (Producto p : products) {
            System.out.println("ID: " + p.getId() + ", Name: " + p.getName() + ", Price: " + p.getPrice());
        }

        // Eliminar un producto
        productDAO.deleteProduct(1);
    }
}
