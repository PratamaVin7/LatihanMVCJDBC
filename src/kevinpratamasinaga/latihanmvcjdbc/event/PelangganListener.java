/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kevinpratamasinaga.latihanmvcjdbc.event;

import kevinpratamasinaga.latihanmvcjdbc.entity.Pelanggan;
import kevinpratamasinaga.latihanmvcjdbc.model.PelangganModel;

/**
 *
 * @author
 * NIM   : 10119080
 * NAMA  : Kevin Pratama Sinaga
 * KELAS : IF-2
 */
public interface PelangganListener {

    public void onChange(PelangganModel model);

    public void onInsert(Pelanggan pelanggan);

    public void onDelete();

    public void onUpdate(Pelanggan pelanggan);

}
