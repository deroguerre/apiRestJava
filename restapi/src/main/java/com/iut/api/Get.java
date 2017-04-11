package com.iut.api;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import com.iut.article.Article;
import com.iut.commande.Commande;

@Path("/GET")
public class Get {

	@GET
	@Path("/isAlive")
	public Response isAlive() {

		try {

		} catch (Exception e) {

			return Response.status(Status.INTERNAL_SERVER_ERROR).entity(e.getMessage()).build();
		}

		return Response.ok().build();
	}

	@GET
	@Path("/article/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public Response getArticle(@PathParam("id") int id) {

		Article article = null;
		try {

			article = new Article();

			article = new Article();
			article.setId(id);
			article.setNom("Processeur");

		} catch (Exception e) {

			return Response.status(Status.INTERNAL_SERVER_ERROR).entity(e.getMessage()).build();
		}

		return Response.ok(article).build();
	}

	@GET
	@Path("/commande/article/{nomArticle}")
	@Produces(MediaType.APPLICATION_JSON)
	public Response getCommandeByArticleNom(@PathParam("nomArticle") String nom) {

		Commande commande = null;
		try {

			commande = new Commande();
			commande.setNumeroCommande(8755);
			commande.setNumeroClient(123456789);
			Article article = new Article();
			article.setId(55);
			article.setNom(nom);
			commande.setArticle(article);

		} catch (Exception e) {

			return Response.status(Status.INTERNAL_SERVER_ERROR).entity(e.getMessage()).build();
		}

		return Response.ok(commande).build();
	}

	@GET
	@Path("/commande/{commandeId}/article/{nomArticle}")
	@Produces(MediaType.APPLICATION_JSON)
	public Response getCommandeByids(@PathParam("commandeId") int commandeId, @PathParam("nomArticle") String nom) {

		Commande commande = null;
		try {

			commande = new Commande();
			commande.setNumeroCommande(commandeId);
			commande.setNumeroClient(123456789);
			Article article = new Article();
			article.setId(55);
			article.setNom(nom);
			commande.setArticle(article);

		} catch (Exception e) {

			return Response.status(Status.INTERNAL_SERVER_ERROR).entity(e.getMessage()).build();
		}

		return Response.ok(commande).build();
	}

	@GET
	@Path("/commande/{nomArticle}")
	@Produces(MediaType.APPLICATION_JSON)
	public Response getCommandeByArticleNomException(@PathParam("nomArticle") String nom) {

		try {

			throw new Exception("Une erreur interne serveur IUT");

		} catch (Exception e) {

			return Response.status(Status.INTERNAL_SERVER_ERROR).entity(e.getMessage()).build();
		}

	}

}