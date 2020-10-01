package br.edu.utfpr.dv.sireata.dao;

import java.SQLException;

public abstract class daoEssentials<Essentials>{
	public int Save(Essentials e) throws SQLException;

	public void Delete(int id) throws SQLException;

	public Essentials searchById(int id) throws SQLException;

	public Essentials listAll(boolean onlyActives) throws SQLException;
}