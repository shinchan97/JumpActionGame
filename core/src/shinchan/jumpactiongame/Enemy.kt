package shinchan.jumpactiongame

import com.badlogic.gdx.graphics.Texture

class Enemy( texture: Texture, srcX: Int, srcY: Int, srcWidth: Int, srcHeight: Int)
    : GameObject(texture, srcX, srcY, srcWidth, srcHeight) {
    companion object {
        val ENEMY_WIDTH = 1.0f
        val ENEMY_HEIGHT = 1.0f

//        val ENEMY_STATIC = 0
//        val ENEMY_MOVING = 1
//
//        val ENEMY_MOVING_VELOCITY = 2.0f

//        var mState: Int = 0

    }

    init {
        setSize(ENEMY_WIDTH, ENEMY_HEIGHT)

    }



    }