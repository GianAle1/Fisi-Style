package bdmysql;

import clases.Usuario;
import java.sql.*;
import javax.swing.JOptionPane;
        
public class SqlUsers extends ConexionBD{
    
    public boolean registrar(Usuario usr) {
        String insertCliente = "INSERT INTO detalleusuario (nombre, apellido, dni ,telefono, correo) VALUES (?, ?, ?, ?, ?)";
        String insertUsuario = "INSERT INTO usuario (id_detalle, correo, contrasena) VALUES (?, ?, ?)";

        try (PreparedStatement psCliente = conectar().prepareStatement(insertCliente, PreparedStatement.RETURN_GENERATED_KEYS);
             PreparedStatement psUsuario = conectar().prepareStatement(insertUsuario)) {
            psCliente.setString(1, usr.getNombre());
            psCliente.setString(2, usr.getApellido());
            psCliente.setString(3, usr.getDni());
            psCliente.setString(4, usr.getTelefono());
            psCliente.setString(5, usr.getCorreo());

            int affectedRows = psCliente.executeUpdate();
            if (affectedRows == 0) {
                throw new SQLException("No se pudo insertar el cliente.");
            }

            try (ResultSet generatedKeys = psCliente.getGeneratedKeys()) {
                if (generatedKeys.next()) {
                    usr.setIdDetalle(generatedKeys.getInt(1));
                } else {
                    throw new SQLException("No se pudo obtener el ID del cliente generado.");
                }
            }

            psUsuario.setInt(1, usr.getIdDetalle());
            psUsuario.setString(2, usr.getCorreo());
            psUsuario.setString(3, usr.getPass());

            int rowsInserted = psUsuario.executeUpdate();
            return rowsInserted > 0;
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al registrar.\n" + ex, "Error de registro", JOptionPane.ERROR_MESSAGE);
            return false;
        }
}
    
    public boolean ingresar(Usuario usr) {
    String obtenerIdSql = "SELECT u.id_usuario, u.id_detalle, c.nombre, c.apellido, c.dni, c.telefono FROM usuario u INNER JOIN detalleusuario c ON u.id_detalle = c.id_detalle WHERE u.correo = ? AND u.contrasena = ?";
    
    try (Connection con = conectar();
         PreparedStatement ps = con.prepareStatement(obtenerIdSql)) {
        ps.setString(1, usr.getCorreo());
        ps.setString(2, usr.getPass());

        try (ResultSet rs = ps.executeQuery()) {
            if (rs.next()) {
                usr.setIdUsuario(rs.getInt("id_usuario"));
                usr.setIdDetalle(rs.getInt("id_detalle"));
                usr.setNombre(rs.getString("nombre"));
                usr.setApellido(rs.getString("apellido"));
                usr.setDni(rs.getString("dni"));
                usr.setTelefono(rs.getString("telefono"));
                return true;
            } else {
                JOptionPane.showMessageDialog(null, "Datos incorrectos");
                return false;
            }
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Error de inicio de sesión.\n" + ex, "Error de ingreso", JOptionPane.ERROR_MESSAGE);
            return false;
        }
    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(null, "Error al ingresar.\n" + ex, "Error de ingreso", JOptionPane.ERROR_MESSAGE);
        return false;
    }
}
    
    public int existe (String usuario) throws SQLException{
        PreparedStatement ps = null;
        ResultSet rs = null;
        String sql = "SELECT count(id_usuario) FROM usuario WHERE correo = ?";
        Connection con = conectar();
        ps = con.prepareStatement(sql);
        try{
            ps.setString(1, usuario);
            rs = ps.executeQuery();
            
            if (rs.next()){
                return rs.getInt(1);
            }
            return 1;
        }catch (SQLException ex){
            return 1;
         }finally{
            ps.close();
        }
    }
}
