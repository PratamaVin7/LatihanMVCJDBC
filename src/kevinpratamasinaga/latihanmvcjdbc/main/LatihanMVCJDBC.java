/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kevinpratamasinaga.latihanmvcjdbc.main;

import kevinpratamasinaga.latihanmvcjdbc.database.KingsBarbershopDatabase;
import java.sql.SQLException;
import java.util.List;
import kevinpratamasinaga.latihanmvcjdbc.entity.Pelanggan;
import kevinpratamasinaga.latihanmvcjdbc.error.PelangganException;
import kevinpratamasinaga.latihanmvcjdbc.service.PelangganDao;
import javax.swing.SwingUtilities;
import kevinpratamasinaga.latihanmvcjdbc.view.MainViewPelanggan;
import java.util.logging.Logger;

/**
 *
 * @author
 * NIM   : 10119080
 * NAMA  : Kevin Pratama Sinaga
 * KELAS : IF-2
 */
public class LatihanMVCJDBC {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException, PelangganException {
        // TODO code application logic here
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                try {
                    MainViewPelanggan pelanggan = new MainViewPelanggan();
                    pelanggan.loadDatabase();
                    pelanggan.setVisible(true);
                } catch (SQLException ex) {
                } catch (PelangganException ex) {
//                    Logger.getLogger(LatihanMVCJDBC.class.getName()).log(Level.SEVERE, null, ex);
                }

            }
        });
    }
}