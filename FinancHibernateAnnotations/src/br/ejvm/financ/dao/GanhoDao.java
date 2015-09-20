package br.ejvm.financ.dao;

import java.util.Calendar;
import java.util.List;

import br.ejvm.financ.model.Ganho;

public class GanhoDao extends GenericDao<Ganho> {

    public static void main(String[] args) {
        Ganho ganho = new Ganho();
        ganho.setData(Calendar.getInstance().getTime());
        ganho.setComentario("Comments 2");
        ganho.setDeQuem("Visa vale");
        ganho.setOk(false);
        ganho.setValor(200L);
        
        GanhoDao ganhoDao = new GanhoDao();
//        ganhoDao.create(ganho);
//        ganhoDao.commit();
        
        ganhoDao.countAll(null);
        
        ganhoDao.find(2);
        
        ganhoDao.delete(1);
        
        List<Ganho> list = ganhoDao.list();
        
        System.out.println(list.size());
    }
}
