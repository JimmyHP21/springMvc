package com.renan.model;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QOportunidade is a Querydsl query type for Oportunidade
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QOportunidade extends EntityPathBase<Oportunidade> {

    private static final long serialVersionUID = -342658186L;

    public static final QOportunidade oportunidade = new QOportunidade("oportunidade");

    public final StringPath email = createString("email");

    public final ArrayPath<Byte[], Byte> foto = createArray("foto", Byte[].class);

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath nome = createString("nome");

    public final StringPath skype = createString("skype");

    public final StringPath sobrenome = createString("sobrenome");

    public final StringPath telefone = createString("telefone");

    public final StringPath twitter = createString("twitter");

    public QOportunidade(String variable) {
        super(Oportunidade.class, forVariable(variable));
    }

    public QOportunidade(Path<? extends Oportunidade> path) {
        super(path.getType(), path.getMetadata());
    }

    public QOportunidade(PathMetadata metadata) {
        super(Oportunidade.class, metadata);
    }

}

