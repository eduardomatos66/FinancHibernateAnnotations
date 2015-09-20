package br.ejvm.financ.dao;

import java.util.Calendar;

import br.ejvm.financ.model.Ganho;

public class GanhoDao extends GenericDao<Ganho> {

    public static void main(String[] args) {
        Ganho ganho = new Ganho();
        ganho.setData(Calendar.getInstance().getTime());
        ganho.setComentario("Comments");
        ganho.setDeQuem("Visa");
        ganho.setOk(false);
        ganho.setValor(200L);
        
        GanhoDao ganhoDao = new GanhoDao();
        ganhoDao.create(ganho);
        ganhoDao.commit();
    }
}
