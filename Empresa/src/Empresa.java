
public class Empresa {

    public static void main(String[] args) {
        Productos pro1 = new Libros(2, 5, "El caminar co Dios de una joven", "Elizabeth George", "Unilit", 2007, "0789919435");
        Productos pro2 = new Cd(2, 8, "Maquiavelico", "Canserbero", 2012);
            
        pro1.PrecioVenta();
        pro2.PrecioVenta();
        
        System.out.println(pro1.getPrecio());
        System.out.println(pro2.getPrecio());
        }
    }