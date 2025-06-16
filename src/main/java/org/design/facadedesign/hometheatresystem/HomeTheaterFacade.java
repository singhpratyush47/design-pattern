package org.design.facadedesign.hometheatresystem;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.design.facadedesign.hometheatresystem.builder.HomeTheaterFacadeBuilder;
import org.design.facadedesign.hometheatresystem.domain.DVDPlayer;
import org.design.facadedesign.hometheatresystem.domain.Lights;
import org.design.facadedesign.hometheatresystem.domain.Projector;
import org.design.facadedesign.hometheatresystem.domain.SoundSystem;

@AllArgsConstructor
public class HomeTheaterFacade {

    private DVDPlayer dvdPlayer;
    private Projector projector;
    private SoundSystem soundSystem;
    private Lights lights;

    public HomeTheaterFacade(HomeTheaterFacadeBuilder homeTheaterFacadeBuilder){
        this.dvdPlayer= homeTheaterFacadeBuilder.getDvdPlayer();
        this.projector=homeTheaterFacadeBuilder.getProjector();
        this.soundSystem=homeTheaterFacadeBuilder.getSoundSystem();
        this.lights=homeTheaterFacadeBuilder.getLights();
    }

    public void watchMovie(String movie){
        System.out.println("Get ready to watch a movie...");
        lights.dim();
        projector.on();
        projector.wideScreenMode();
        soundSystem.on();
        soundSystem.setSurroundSound();
        dvdPlayer.on();
        dvdPlayer.play(movie);
    }
}
