package com.renan.model;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QOportunidade is a Querydsl query type for Oportunidade
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QOportunidade extends EntityPathBase<Oportunidade> {

    private static final long serialVersionUID = -342658186L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QOportunidade oportunidade = new QOportunidade("oportunidade");

    public final StringPath descricao = createString("descricao");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath nomeProspecto = createString("nomeProspecto");

    public final QRestaurants restaurants;

    public final NumberPath<java.math.BigDecimal> valor = createNumber("valor", java.math.BigDecimal.class);

    public QOportunidade(String variable) {
        this(Oportunidade.class, forVariable(variable), INITS);
    }

    public QOportunidade(Path<? extends Oportunidade> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QOportunidade(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QOportunidade(PathMetadata metadata, PathInits inits) {
        this(Oportunidade.class, metadata, inits);
    }

    public QOportunidade(Class<? extends Oportunidade> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.restaurants = inits.isInitialized("restaurants") ? new QRestaurants(forProperty("restaurants")) : null;
    }

}

