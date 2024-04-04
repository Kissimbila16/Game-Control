package com.cobra.game;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.utils.ScreenUtils;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;

public class Cobra extends ApplicationAdapter {
	SpriteBatch batch;
	Texture img,navet;
	 Sprite nave;
	  float posX=1,posY=1;
	@Override
	public void create () {
		batch = new SpriteBatch();
		img = new Texture("fundo.png");
		navet = new Texture("nave.png");
		nave =new Sprite(navet);
	}

	@Override
	public void render () {
		mover();
		ScreenUtils.clear(1, 0, 0, 1);
		batch.begin();
		batch.draw(img, 0, 0,1280, 720);
			batch.draw(navet, posX, posY);
		batch.end();
	}
	
 public void mover(){
if (Gdx.input.isKeyPressed(Input.Keys.RIGHT)) {
	if (posX>1280-nave.getWidth()) {
		posX-=10;
	}
posX+=10;
}

if (Gdx.input.isKeyPressed(Input.Keys.LEFT)) {
	if (posX<10) {
		posX+=10;
		
	}
posX-=10;
}

if (Gdx.input.isKeyPressed(Input.Keys.UP)) {
	if (posY>720-nave.getHeight()) {
		posY-=10;
		
	}
posY+=10;
}

if (Gdx.input.isKeyPressed(Input.Keys.DOWN)) {
	if (posY<10) {
		posY+=10;
		
	}
posY-=10;
}

 }


	@Override
	public void dispose () {
		batch.dispose();
		img.dispose();
		navet.dispose();
	}
}
