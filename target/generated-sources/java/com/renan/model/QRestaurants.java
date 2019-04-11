package com.renan.model;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QRestaurants is a Querydsl query type for Restaurants
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QRestaurants extends EntityPathBase<Restaurants> {

    private static final long serialVersionUID = 2064790942L;

    public static final QRestaurants restaurants = new QRestaurants("restaurants");

    public final StringPath about = createString("about");

    public final StringPath category = createString("category");

    public final StringPath deliveryEstimate = createString("deliveryEstimate");

    public final StringPath hours = createString("hours");

    public final StringPath id = createString("id");

    public final StringPath imagePath = createString("imagePath");

    public final StringPath nome = createString("nome");

    public final NumberPath<java.math.BigDecimal> rating = createNumber("rating", java.math.BigDecimal.class);

    public QRestaurants(String variable) {
        super(Restaurants.class, forVariable(variable));
    }

    public QRestaurants(Path<? extends Restaurants> path) {
        super(path.getType(), path.getMetadata());
    }

    public QRestaurants(PathMetadata metadata) {
        super(Restaurants.class, metadata);
    }

}

