package com.renan.service;

import com.querydsl.jpa.impl.JPAQuery;
import com.querydsl.jpa.impl.JPAQueryFactory;
import com.renan.model.Oportunidade;
import com.renan.model.QOportunidade;
import com.renan.model.QRestaurants;
import com.renan.model.Restaurants;

import javax.persistence.EntityManager;
import java.util.List;

public class OportunidadeService {

    private EntityManager entityManager;

    QOportunidade oportunidade = QOportunidade.oportunidade;

    public List<Oportunidade> findOportunidadeWhereId() {
        JPAQuery<Oportunidade> query = new JPAQueryFactory(entityManager).selectFrom(oportunidade);

        return query
            .where(oportunidade.descricao.contains("BANCO DE DADOS"))
            .fetch();
    }

    public List<Restaurants> findRestaurant() {
        QRestaurants restaurants = QRestaurants.restaurants;

        return new JPAQueryFactory(entityManager)
            .selectFrom(restaurants)
            .fetch();
    }

    public List<Oportunidade> findSalesBrandAUDIAndBMW() {
        QOportunidade oportunidade = QOportunidade.oportunidade;
        QRestaurants restaurants = QRestaurants.restaurants;

        return new JPAQueryFactory(entityManager)
            .selectFrom(oportunidade)
            .innerJoin(oportunidade.restaurants,restaurants)
            .where(restaurants.about.in("Guga","Lanche"))
            .fetch();
    }
}
