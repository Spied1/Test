package ru.first.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring
{
    public static void main(String[] args)
    {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );
        //чисто бин
//        TestBean testBean = context.getBean("testBean", TestBean.class);
//        testBean.setName("Hitler");
//        System.out.println(testBean.getName());
//        testBean.setName("Alfredo");
//
//        context.close();


        //Music music = context.getBean("musicBean", Music.class);
        //MusicPlayer musicPlayer = new MusicPlayer(music);
        //через конструктор
        //MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
        //musicPlayer.playMusic();
        //context.close();

        //через setter
        //через конструктор
        //musicPlayer.playMusic();
        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);


        System.out.println(musicPlayer.getName());
        System.out.println(musicPlayer.getVolume());
        musicPlayer.playMusic();
        context.close();

    }
}
