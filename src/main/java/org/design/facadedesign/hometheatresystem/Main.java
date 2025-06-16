package org.design.facadedesign.hometheatresystem;

import org.design.facadedesign.hometheatresystem.builder.HomeTheaterFacadeBuilder;
import org.design.facadedesign.hometheatresystem.domain.DVDPlayer;
import org.design.facadedesign.hometheatresystem.domain.Lights;
import org.design.facadedesign.hometheatresystem.domain.Projector;
import org.design.facadedesign.hometheatresystem.domain.SoundSystem;

public class Main {
    public static void main(String[] args) {
        HomeTheaterFacade homeTheaterFacade= HomeTheaterFacadeBuilder
                .builder()
                .dvdPlayer(new DVDPlayer())
                .projector(new Projector())
                .soundSystem(new SoundSystem())
                .lights(new Lights())
                .build();

        homeTheaterFacade.watchMovie("Hera Pheri");
    }
}
