package DAO.interfaces;

import java.util.List;

import Models.Demande;

public interface IDemande {
	public Demande insertDemande(Demande demande);
	 List<Demande> getAllDemandsOfAssociation(int ass_id);
}
