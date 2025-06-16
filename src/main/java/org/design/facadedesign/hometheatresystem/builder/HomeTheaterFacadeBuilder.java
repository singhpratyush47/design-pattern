package org.design.facadedesign.hometheatresystem.builder;

import lombok.Data;
import org.design.facadedesign.hometheatresystem.HomeTheaterFacade;
import org.design.facadedesign.hometheatresystem.domain.DVDPlayer;
import org.design.facadedesign.hometheatresystem.domain.Lights;
import org.design.facadedesign.hometheatresystem.domain.Projector;
import org.design.facadedesign.hometheatresystem.domain.SoundSystem;

@Data
public class HomeTheaterFacadeBuilder {

    private DVDPlayer dvdPlayer;
    private Projector projector;
    private SoundSystem soundSystem;
    private Lights lights;

    public static HomeTheaterFacadeBuilder builder(){
        return new HomeTheaterFacadeBuilder();
    }

    public HomeTheaterFacadeBuilder dvdPlayer(DVDPlayer dvdPlayer){
        this.dvdPlayer=dvdPlayer;
        return this;
    }

    public HomeTheaterFacadeBuilder projector(Projector projector){
        this.projector=projector;
        return this;
    }

    public HomeTheaterFacadeBuilder soundSystem(SoundSystem soundSystem){
        this.soundSystem=soundSystem;
        return this;
    }

    public HomeTheaterFacadeBuilder lights(Lights lights){
        this.lights=lights;
        return this;
    }

    public HomeTheaterFacade build(){
        return new HomeTheaterFacade(this);
    }
}
