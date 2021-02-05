package DAO.interfaces;


import Models.Donnateur;

public interface IDonnateur {
	 public Donnateur insertDonnateur(Donnateur donnateur);
	 public boolean Check_login_dona(Donnateur donnateur);
}
