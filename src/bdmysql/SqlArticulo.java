package bdmysql;
import clases.Producto;
import java.sql.*;
import java.util.List;
import javax.swing.JOptionPane;
        
public class SqlArticulo extends ConexionBD{
    
    public void obtenerProducto (List <Producto> art){
        ResultSet rs = null;
        String sql = "SELECT * FROM producto ";
        Connection con = conectar();
        
        try (PreparedStatement ps = con.prepareStatement(sql)){
            rs = ps.executeQuery();
            while (rs.next()){
                Producto articulo = new Producto();
                articulo.setId (rs.getInt(1));
                articulo.setIdPromocion (rs.getInt(2));
                articulo.setDescripcion (rs.getString(3));
                articulo.setMarca(rs.getString(4));
                articulo.setTipo(rs.getString(5));
                articulo.setTalla(rs.getString(6));
                articulo.setPrecio(rs.getFloat(7));
                articulo.setStock(rs.getInt(8));
                articulo.setImage(rs.getString(9));
                articulo.setGenero(rs.getString(10));                
                art.add(articulo);
            }
        }catch (SQLException ex){
            JOptionPane.showMessageDialog(null, "Error al obtener los productos");
        }
    }
    
    public boolean registrar (Producto prod){
        PreparedStatement ps = null;
        conectar();
        String sql = "INSERT INTO producto (descripcion, marca, precio, stock, tipo, talla, genero, image) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
        try{
            ps = conn.prepareStatement(sql);
            ps.setString(1,prod.getDescripcion());
            ps.setString(2,prod.getMarca());
            ps.setDouble(3,prod.getPrecio());
            ps.setInt(4,prod.getStock());
            ps.setString(5,prod.getTipo());
            ps.setString(6,prod.getTalla());
            ps.setString(7,prod.getGenero());
            ps.setString(8,prod.getImage());
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Registrado correctamente","Registrado correctamente", JOptionPane.INFORMATION_MESSAGE);
            return true;
        }
        catch (SQLException ex){
            JOptionPane.showMessageDialog(null, "Error al registrar.\n" + ex,"Error de registro", JOptionPane.ERROR_MESSAGE);
            return false;
        }
    }
 
     public void actualizarProducto(Producto producto){
        String sql = "UPDATE producto SET precio = ?, stock = ? WHERE id_producto = ?";
        try (PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setDouble(1, producto.getPrecio());
            stmt.setInt (2, producto.getStock());
            stmt.setInt (3, producto.getId());
            stmt.executeUpdate();
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Error al actualizar producto.");
        }
    }

    public void eliminarProducto(int idProducto) {
        String sql = "DELETE FROM producto WHERE id_producto = ?";
        try (PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, idProducto);
            stmt.executeUpdate();
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Error al eliminar producto.");
        }
    }
}
