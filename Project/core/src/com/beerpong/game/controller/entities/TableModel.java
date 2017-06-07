package com.beerpong.game.controller.entities;

import com.badlogic.gdx.physics.box2d.BodyDef;
import com.badlogic.gdx.physics.box2d.FixtureDef;
import com.badlogic.gdx.physics.box2d.PolygonShape;
import com.badlogic.gdx.physics.box2d.World;
import com.beerpong.game.model.entities.EntityModel;

/**
 * Created by Sofia on 6/6/2017.
 */

public class TableModel extends EntityBody {


    public TableModel(World world, EntityModel model) {


        BodyDef bodyDef = new BodyDef();
        bodyDef.type = BodyDef.BodyType.StaticBody;
        bodyDef.position.set(model.getX(), model.getY());
        bodyDef.angle = model.getRotation();

        body = world.createBody(bodyDef);
        body.setUserData(model);

        float density = 2f, friction = 1f, restitution = 0f;
        int width = 1600, height = 723;


        // top
        createFixture(body, new float[]{
                184,35,15,119,15,190,1573,200,1573,129,1386,37
        }, width, height, density, friction, restitution, CUP_BODY, (short) (BALL_BODY | LIMIT_BODY));

        // bottom
        createFixture(body, new float[]{
                273,189,273,703,1315,703,1315,189
        }, width, height, density, friction, restitution, CUP_BODY, (short) (BALL_BODY | LIMIT_BODY));


    }

}

