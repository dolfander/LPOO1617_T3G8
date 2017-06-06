package com.beerpong.game.model;


import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.beerpong.game.model.entities.BallModel;
import com.beerpong.game.model.entities.CupModel;
import com.beerpong.game.model.entities.SimpleModel;

import static com.beerpong.game.view.GameView.VIEWPORT_WIDTH;


/**
 * Created by Sofia on 5/27/2017.
 */

public class GameModel extends Stage {
    private static GameModel instance;

    private  BallModel ball;
    private  CupModel cup;

    // private SimpleModel table;
    private SimpleModel ground;
    private SimpleModel roof;
    private SimpleModel leftWall;
    private SimpleModel rightWall;


    public static GameModel getInstance() {
        if (instance == null)
            instance = new GameModel();
        return instance;
    }

    private GameModel() {


        float ratio = ((float) Gdx.graphics.getHeight() / (float) Gdx.graphics.getWidth());

        ball = new BallModel(  VIEWPORT_WIDTH *ratio *0.2f,VIEWPORT_WIDTH/2 ,0);
        cup = new CupModel( VIEWPORT_WIDTH *0.8f, VIEWPORT_WIDTH *0.06f , 0);

        // here initilize tabel model

        ground = new SimpleModel(0,0,0);
        leftWall = new SimpleModel(0,0,0);
        roof = new SimpleModel(0,VIEWPORT_WIDTH *ratio,0);
        rightWall = new SimpleModel(VIEWPORT_WIDTH ,0,0);


    }

    public BallModel getBall(){
        return ball;
    }

    public CupModel getCup() {return cup;}

    public SimpleModel getGround(){return ground;}

    public SimpleModel getRoof(){return roof;}

    public SimpleModel getLeftWall(){return leftWall;}

    public SimpleModel getRightWall(){return rightWall;}

    // public SimpleModel getTabel(){ return tabel; }

    public static void reset(){
        instance = null;
    }


}
