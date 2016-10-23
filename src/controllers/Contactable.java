package controllers;

import modules.GameModule;

/**
 * Created by Nghia on 10/23/2016.
 */
public interface Contactable {
    GameModule getGameModule();
    void onCollide(Contactable contactable);
}
