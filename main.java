package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URI;

public class Main {


    /////////// PAGE 3 (EMOTION-CHOOSING) VARIABLES ////////////
    public static JFrame frame3;
    public static JPanel panel3;
    public static JLabel page3Title;


    /////////// EXCITED VARIABLES ////////////
    public static JFrame excitedFrame;
    public static JPanel excitedPanel;
    public static JLabel excitedEmotion;
    public static JTextArea excitedInfoText;

    /////////// HOPEFUL VARIABLES ////////////
    public static JFrame hopefulFrame;
    public static JPanel hopefulPanel;
    public static JLabel hopefulEmotion;
    public static JTextArea hopefulInfoText;

    /////////// OPTIMISTIC VARIABLES ////////////
    public static JFrame optimisticFrame;
    public static JPanel optimisticPanel;
    public static JLabel optimisticEmotion;
    public static JTextArea optimisticInfoText;

    /////////// NERVOUS VARIABLES ////////////
    public static JFrame nervousFrame;
    public static JPanel nervousPanel;
    public static JLabel nervousEmotion;
    public static JTextArea nervousInfoText;

    /////////// CONFUSED VARIABLES ////////////
    public static JFrame confusedFrame;
    public static JPanel confusedPanel;
    public static JLabel confusedEmotion;
    public static JTextArea confusedInfoText;

    //////////// MAIN PAGE BUTTONS //////////////
    public static JButton happy;
    public static JButton sad;
    public static JButton anxious;
    public static JButton unmotivated;
    public static JButton motivated;
    public static JButton lethargic;
    public static JButton hype;
    public static JButton excited;
    public static JButton hopeful;
    public static JButton optimistic;
    public static JButton tearful;
    public static JButton moody;
    public static JButton angry;
    public static JButton nervous;
    public static JButton confused;
    public static JButton heartbroken;


    ///////// HOME PAGE VARIABLES ////////////////
    public static JFrame mainFrame;
    public static JPanel panel;
    public static JLabel welcomeToApp;
    public static JButton letsGo;

    ////////// SAD PAGE VARIABLES /////////////
    public static JFrame sadFrame;
    public static JPanel sadPanel;
    public static JLabel sadEmotion;
    public static JTextArea sadInfoText;
    public static JButton sadButton;

    ////////// ANXIOUS PAGE VARIABLES /////////
    public static JFrame anxiousFrame;
    public static JPanel anxiousPanel;
    public static JLabel anxiousEmotion;
    public static JTextArea anxiousInfoText;
    public static JButton anxiousButton;

    ////////// UNMOTIVATED PAGE VARIABLES ///////
    public static JFrame unmotivatedFrame;
    public static JPanel unmotivatedPanel;
    public static JLabel unmotivatedEmotion;
    public static JTextArea unmotivatedInfoText;
    public static JButton unmotivatedButton;

    /////////// TEARFUL PAGE VARIABLES ////////////
    public static JFrame tearfulFrame;
    public static JPanel tearfulPanel;
    public static JLabel tearfulEmotion;
    public static JTextArea tearfulInfoText;
    public static JButton tearfulButton;

    //////////// HEARTBROKEN VARIABLES ////////////
    public static JFrame heartbrokenFrame;
    public static JPanel heartbrokenPanel;
    public static JLabel heartbrokenEmotion;
    public static JTextArea heartbrokenInfoText;
    public static JButton heartbrokenButton;

    static String playlistLink = "";

    ////////// SECOND (INFO) PAGE /////////////
    static JFrame infoFrame;
    static JPanel infoPanel;
    static JTextArea mentalHealthInfo;
    static JTextArea whyMusic;
    static JTextArea musicMentalHealth;
    static JButton next;

    ///////////// HAPPY VARIABLES //////////////
    static JFrame happyFrame;
    static JPanel happyPanel;
    static JLabel happyEmotion;
    static JTextArea happyText;
    static JButton happyButton;

    ///////////// LETHARGIC VARIABLES //////////
    static JFrame lethargicFrame;
    static JPanel lethargicPanel;
    static JLabel lethargicEmotion;
    static JTextArea lethargicText;
    static JButton lethargicButton;

    ///////////// HYPE VARIABLES /////////////
    static JFrame hypeFrame;
    static JPanel hypePanel;
    static JLabel hypeEmotion;
    static JTextArea hypeText;
    static JButton hypeButton;

    ///////////// MOODY VARIABLES ///////////
    static JFrame moodyFrame;
    static JPanel moodyPanel;
    static JLabel moodyEmotion;
    static JTextArea moodyText;
    static JButton moodyButton;

    ///////////// ANGRY VARIABLES ///////////
    static JFrame angryFrame;
    static JPanel angryPanel;
    static JLabel angryEmotion;
    static JTextArea angryText;
    static JButton angryButton;

    /////////// BACK BUTTON FOR EVERY EMOTION /////////////
    static JButton backButton;

    /////////// FEEDBACK PAGES ////////////////////
    static JFrame feedbackFrame;
    static JPanel feedbackPanel;
    static JPanel feedbackPanel1;
    static JLabel feedbackLabel;

    public static void main(String[] args) {
        // CALL METHODS OF EACH SCREEN
        homePage();


    }

    public static void homePage() {

        //setting up the frame
        mainFrame = new JFrame();
        panel = new JPanel();
        mainFrame.setSize(500, 500);
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainFrame.add(panel);

        // label for application
        welcomeToApp = new JLabel("Welcome to Music Therapy!");
        welcomeToApp.setBounds(105, 50,500, 25);
        welcomeToApp.setFont(new Font("Serif", Font.PLAIN, 25));
        panel.add(welcomeToApp);

        //button for Let's Go
        letsGo = new JButton("Let's Go!");
        letsGo.setBounds(150, 180, 180, 80);
        letsGo.addActionListener((e) -> {
            mainFrame.setVisible(false);
            mainFrame.dispose();
            // call next screen
            infoPage();
        });
        panel.add(letsGo);

        panel.setLayout(null);
        mainFrame.setVisible(true);
    }

    public static void infoPage() {
        //Mental Health Info Page
        infoFrame = new JFrame();
        infoPanel = new JPanel();
        infoFrame.setSize(600,500);
        infoFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        infoFrame.add(infoPanel);


        //Labels
        //mental health info
        //why music
        //music x mental health

        mentalHealthInfo = new JTextArea("Mental Health. It’s critically important to our well being and yet not addressed enough.\n" +
                "Each person has their own state of mental health and that’s why it’s important for \n" + "each person to check in with their well-being.\n" +
                "With this app, YOU can identify how you feel, \n" + "what that means, and listen to music - \n" +
                "whether it lifts you up, or leaves you content \n" + "with how you’re feeling.\n");

        mentalHealthInfo.setBounds(60, 20, 500, 75);
        mentalHealthInfo.setFont(new Font("Serif", Font.PLAIN, 14));

        infoPanel.add(mentalHealthInfo);


        whyMusic = new JTextArea("Music is powerful. The combination of notes, melodies, voices:\n" +
                "it transfixes our minds, our emotions. How?\n" +
                "The amygdala, the part of our brain that regulates our mood, processes \n" +
                "the music we hear.\n");
        whyMusic.setBounds(60, 100, 500, 75);
        whyMusic.setFont(new Font("Serif", Font.PLAIN, 14));
        infoPanel.add(whyMusic);

        musicMentalHealth = new JTextArea("Music is incredibly complex and holds so much influence over how we feel.\n" +
                "Each emotion is connected to a curated playlist. With this app,\n" +
                "we hope to elevate mental health awareness through meaning and melodies.\n");


        musicMentalHealth.setBounds(60, 180, 500, 75);
        musicMentalHealth.setFont(new Font("Serif", Font.PLAIN, 14));
        infoPanel.add(musicMentalHealth);

        next = new JButton();

        next = new JButton("Next");
        next.setBounds(150, 300, 280, 50);
        next.addActionListener((e) -> {
            infoFrame.setVisible(false);
            infoFrame.dispose();
            // call next screen
            Page3();

        });
        infoPanel.add(next);

        // set panel and frame to show
        infoPanel.setLayout(null);
        infoFrame.setVisible(true);
    }

    public static void Page3(){
        // setting up the frame
        frame3 = new JFrame();
        panel3 = new JPanel();
        frame3.setSize(800,800);
        frame3.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame3.add(panel3);

        // label for the title of page 3
        page3Title = new JLabel("How are you feeling?");
        page3Title.setBounds(280, 20, 500, 35);
        page3Title.setFont(new Font("Serif", Font.PLAIN, 25));
        panel3.add(page3Title);

        //button for Happy
        happy = new JButton("Happy");
        happy.setBackground(Color.decode("#FFFF00"));
        happy.setBounds(150, 180, 100, 60);
        happy.addActionListener((e) -> {
            happyPage();
        });
        panel3.add(happy);

        //button for Sad
        sad = new JButton("Sad");
        sad.setBackground(Color.decode("#0B19DF"));
        sad.setBounds(250, 180, 100, 60);
        sad.addActionListener((e) -> {
            sadPage();
        });
        panel3.add(sad);

        //button for Anxious
        anxious = new JButton("Anxious");
        anxious.setBackground(Color.decode("#FA9D00"));
        anxious.setBounds(350, 180, 100, 60);
        anxious.addActionListener((e) -> {
            anxiousPage();
        });
        panel3.add(anxious);

        //button for Unmotivated
        unmotivated = new JButton("Unmotivated");
        unmotivated.setBackground(Color.decode("#946635"));
        unmotivated.setBounds(450, 180, 100, 60);
        unmotivated.addActionListener((e) -> {
            unmotivated();
        });
        panel3.add(unmotivated);

        //button for Lethargic
        lethargic = new JButton("Lethargic");
        lethargic.setBackground(Color.decode("#767945"));
        lethargic.setBounds(550, 180, 100, 60);
        lethargic.addActionListener((e) -> {
            lethargicPage();
        });
        panel3.add(lethargic);

        //button for Hype
        hype = new JButton("Hype");
        hype.setBackground(Color.decode("#FF1D84"));
        hype.setBounds(150, 280, 100, 60);
        hype.addActionListener((e) -> {
            hypePage();
        });
        panel3.add(hype);

        //button for Excited
        excited = new JButton("Excited");
        excited.setBackground(Color.decode("#FF67BD"));
        excited.setBounds(250, 280, 100, 60);
        excited.addActionListener((e) -> {
            excited();
        });
        panel3.add(excited);

        //button for Hopeful
        hopeful = new JButton("Hopeful");
        hopeful.setBackground(Color.decode("#98E9ED"));
        hopeful.setBounds(350, 280, 100, 60);
        hopeful.addActionListener((e) -> {
            hopeful();
        });
        panel3.add(hopeful);

        //button for Optimistic
        optimistic = new JButton("Optimistic");
        optimistic.setBackground(Color.decode("#FFC91C"));
        optimistic.setBounds(450, 280, 100, 60);
        optimistic.addActionListener((e) -> {
            optimistic();
        });
        panel3.add(optimistic);

        //button for Tearful
        tearful = new JButton("Tearful");
        tearful.setBackground(Color.decode("#444FAD"));
        tearful.setBounds(550, 280, 100, 60);
        tearful.addActionListener((e) -> {
            tearful();
        });
        panel3.add(tearful);

        //button for Moody
        moody = new JButton("Moody");
        moody.setBackground(Color.decode("#706665"));
        moody.setBounds(250, 380, 100, 60);
        moody.addActionListener((e) -> {
            moodyPage();
        });
        panel3.add(moody);

        //button for Angry
        angry = new JButton("Angry");
        angry.setBackground(Color.decode("#A40000"));
        angry.setBounds(350, 380, 100, 60);
        angry.addActionListener((e) -> {
            angryPage();
        });
        panel3.add(angry);

        //button for Nervous
        nervous = new JButton("Nervous");
        nervous.setBackground(Color.decode("#539D53"));
        nervous.setBounds(450, 380, 100, 60);
        nervous.addActionListener((e) -> {
            nervous();
        });
        panel3.add(nervous);

        //button for Confused
        confused = new JButton("Confused");
        confused.setBackground(Color.decode("#9C7F21"));
        confused.setBounds(550, 380, 100, 60);
        confused.addActionListener((e) -> {
            confused();
        });
        panel3.add(confused);

        //button for Heartbroken
        heartbroken = new JButton("Heartbroken");
        heartbroken.setBackground(Color.decode("#880C00"));
        heartbroken.setBounds(150, 380, 100, 60);
        heartbroken.addActionListener((e) -> {
            heartbroken();
        });
        panel3.add(heartbroken);


        panel3.setLayout(null);
        frame3.setVisible(true);
    }






    //////////// EMOTION METHODS////////////////

    public static void sadPage() {

        //setting up the frame
        sadFrame = new JFrame();
        sadPanel = new JPanel();
        sadFrame.setSize(500, 500);
        sadFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        sadFrame.add(sadPanel);

        sadPanel.setBackground(Color.decode("#0B19DF"));

        // label for "SAD" emotion
        sadEmotion = new JLabel("Sad");
        sadEmotion.setBounds(40, 60,500, 50);
        sadEmotion.setFont(new Font("Serif", Font.PLAIN, 40));
        sadPanel.add(sadEmotion);

        // text for sad emotion
        sadInfoText = new JTextArea("When you are feeling sad, you feel a sense of sorrow in your \n" + "chest heaviness in the limbs, watery eyes, \n" + "or an overall decrease from your mood. Sadness is common! \n" +
                "Don’t beat yourself down for feeling sad :(, \n" + "it is common to feel sadness in ourselves and towards others. \n" +
                "However, it’s important that we channel that energy in a constructive way. \n" +
                "Here is a playlist that can give you some \n" + "comfort when you are experiencing this emotion.");

        sadInfoText.setBounds(120, 50, 350, 75);
        sadInfoText.setFont(new Font("Serif", Font.PLAIN, 14));

        sadButton = new JButton("Sad Playlist");
        sadButton.setBounds(100, 250, 280, 50);
        sadButton.addActionListener((e) -> {
            sadFrame.setVisible(false);
            sadFrame.dispose();
            // call next screen
            if (e.getSource() == sadButton) {
                playlistLink = "https://open.spotify.com/playlist/3FD0KD0bXdUCFByJmp47yx?si=b15b792f20be4121";
                openPlaylist(playlistLink);
            }

        });
        sadPanel.add(sadButton);

        JButton backButtonSad = new JButton("Back");
        backButtonSad.setBounds(100, 300, 280, 50);
        backButtonSad.addActionListener((e) -> {
            sadFrame.setVisible(false);
            sadFrame.dispose();
            Page3();
        });


        sadPanel.add(sadInfoText);
        sadPanel.setLayout(null);
        sadFrame.setVisible(true);
    }

    public static void anxiousPage() {

        //setting up the frames
        anxiousFrame = new JFrame();
        anxiousPanel = new JPanel();
        anxiousFrame.setSize(500, 500);
        anxiousFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        anxiousFrame.add(anxiousPanel);

        // setting up a color
        anxiousPanel.setBackground(Color.decode("#FA9D00"));

        // label for "ANXIOUS" emotion
        anxiousEmotion = new JLabel("Anxious");
        anxiousEmotion.setBounds(40, 60,500, 50);
        anxiousEmotion.setFont(new Font("Serif", Font.PLAIN, 40));
        anxiousPanel.add(anxiousEmotion);

        // text for anxious emotion
        anxiousInfoText = new JTextArea("We all get a little nervous sometimes about some impending situation \n" +
                "in our lives. It’s quite natural and we gotta embrace it to alleviate it. \n" + "Here are some tracks " +
                "to calm down your nerves \n" + "and put everything back into perspective.\n");
        anxiousInfoText.setBounds(120, 50, 350, 75);
        anxiousInfoText.setFont(new Font("Serif", Font.PLAIN, 14));

        anxiousButton = new JButton("Anxious Playlist");
        anxiousButton.setBounds(150, 180, 180, 80);
        anxiousButton.addActionListener((e) -> {
            anxiousFrame.setVisible(false);
            anxiousFrame.dispose();
            // call next screen
            if (e.getSource() == anxiousButton) {
                playlistLink = "https://open.spotify.com/playlist/5h1dKYTeGU3Fkr0B5dY55U?si=1822f4b54de24a5e";
                openPlaylist(playlistLink);
            }
        });

        JButton backButtonAnxious = new JButton("Back");
        backButtonAnxious.setBounds(100, 300, 280, 50);
        backButtonAnxious.addActionListener((e) -> {
            anxiousFrame.setVisible(false);
            anxiousFrame.dispose();
            Page3();
        });

        anxiousPanel.add(anxiousButton);


        anxiousPanel.add(anxiousInfoText);
        anxiousPanel.setLayout(null);
        anxiousFrame.setVisible(true);
    }

    public static void unmotivated() {

        //setting up the frames
        unmotivatedFrame = new JFrame();
        unmotivatedPanel = new JPanel();
        unmotivatedFrame.setSize(500, 500);
        unmotivatedFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        unmotivatedFrame.add(unmotivatedPanel);

        unmotivatedPanel.setBackground(Color.decode("#946635"));

        // label for "ANXIOUS" emotion
        unmotivatedEmotion = new JLabel("Unmotivated");
        unmotivatedEmotion.setBounds(40, 60,500, 50);
        unmotivatedEmotion.setFont(new Font("Serif", Font.PLAIN, 40));
        unmotivatedPanel.add(unmotivatedEmotion);

        // text for anxious emotion
        unmotivatedInfoText = new JTextArea("Procrastinating? Need a little dose of motivation. Did you know action \n" +
                "produces motivation and not the other way around. \n" + "Nevertheless, here’s some music to get you going \n" +
                "and start off that task you keep putting off.\n"); // text about anxious info
        unmotivatedInfoText.setBounds(120, 50, 350, 75);
        unmotivatedInfoText.setFont(new Font("Serif", Font.PLAIN, 14));

        unmotivatedButton = new JButton("Unmotivated Playlist");
        unmotivatedButton.setBounds(150, 180, 180, 80);
        unmotivatedButton.addActionListener((e) -> {
            unmotivatedFrame.setVisible(false);
            unmotivatedFrame.dispose();
            // call next screen
            if (e.getSource() == unmotivatedButton) {
                playlistLink = "https://open.spotify.com/playlist/34hH7cZo02eLRs3OWFZ6sm?si=4cbfcc49945c4fec";
                openPlaylist(playlistLink);
            }
        });

        JButton backButtonUnmotivated = new JButton("Back");
        backButtonUnmotivated.setBounds(100, 300, 280, 50);
        backButtonUnmotivated.addActionListener((e) -> {
            unmotivatedFrame.setVisible(false);
            unmotivatedFrame.dispose();
            Page3();
        });

        unmotivatedPanel.add(unmotivatedButton);

        unmotivatedPanel.add(unmotivatedInfoText);
        unmotivatedPanel.setLayout(null);
        unmotivatedFrame.setVisible(true);
    }

    public static void tearful() {

        //setting up the frames
        tearfulFrame = new JFrame();
        tearfulPanel = new JPanel();
        tearfulFrame.setSize(500, 500);
        tearfulFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        tearfulFrame.add(tearfulPanel);

        tearfulPanel.setBackground(Color.decode("#444FAD"));

        // label for "ANXIOUS" emotion
        tearfulEmotion = new JLabel("Tearful");
        tearfulEmotion.setBounds(40, 60,500, 50);
        tearfulEmotion.setFont(new Font("Serif", Font.PLAIN, 40));
        tearfulPanel.add(tearfulEmotion);

        // text for anxious emotion
        tearfulInfoText = new JTextArea("Whether it’s someone leaving you or saying something mean. \n" +
                "Or maybe it’s just the hundred things going wrong with your life. \n" +
                "Life gets moody sometimes. Sometimes, that’s the way it is. \n" +
                "Listen to these sad bops and let the tears flow. \n");
        tearfulInfoText.setBounds(120, 50, 350, 75);
        tearfulInfoText.setFont(new Font("Serif", Font.PLAIN, 14));

        tearfulButton = new JButton("Tearful Playlist");
        tearfulButton.setBounds(150, 180, 180, 80);
        tearfulButton.addActionListener((e) -> {
            tearfulFrame.setVisible(false);
            tearfulFrame.dispose();
            // call next screen
            if (e.getSource() == tearfulButton) {
                playlistLink = "https://open.spotify.com/playlist/3nhuIv7V5wEoZTVJ6r9kuR?si=82edb8ca131941ee";
                openPlaylist(playlistLink);
            }
        });

        JButton backButtonTearful = new JButton("Back");
        backButtonTearful.setBounds(100, 300, 280, 50);
        backButtonTearful.addActionListener((e) -> {
            tearfulFrame.setVisible(false);
            tearfulFrame.dispose();
            Page3();
        });


        tearfulPanel.add(tearfulButton);

        tearfulPanel.add(tearfulInfoText);
        tearfulPanel.setLayout(null);
        tearfulFrame.setVisible(true);
    }

    public static void heartbroken() {
        // setting up the frames
        heartbrokenFrame = new JFrame();
        heartbrokenFrame.setBackground(Color.decode("#880C00"));
        heartbrokenPanel = new JPanel();
        heartbrokenFrame.setSize(500, 500);
        heartbrokenFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        heartbrokenFrame.add(heartbrokenPanel);

        // label for "ANXIOUS" emotion
        heartbrokenEmotion = new JLabel("Heartbroken");
        heartbrokenEmotion.setBounds(40, 60,500, 50);
        heartbrokenEmotion.setFont(new Font("Serif", Font.PLAIN, 40));
        heartbrokenPanel.add(heartbrokenEmotion);

        // text for anxious emotion
        heartbrokenInfoText = new JTextArea("Let’s not talk about it. Let the music do the talking. \n" +
                "Just know that it always gets better with time!\n");
        heartbrokenInfoText.setBounds(120, 50, 350, 75);
        heartbrokenInfoText.setFont(new Font("Serif", Font.PLAIN, 14));

        heartbrokenButton = new JButton("Heartbroken Playlist");
        heartbrokenButton.setBounds(150, 180, 180, 80);
        heartbrokenButton.addActionListener((e) -> {
            heartbrokenFrame.setVisible(false);
            heartbrokenFrame.dispose();
            // call next screen
            if (e.getSource() == heartbrokenButton) {
                playlistLink = "https://open.spotify.com/playlist/22qAlKKAerVcRxEd1Un8mp?si=538d46c63a524525";
                openPlaylist(playlistLink);
            }
        });

        JButton backButtonHeartbroken = new JButton("Back");
        backButtonHeartbroken.setBounds(100, 300, 280, 50);
        backButtonHeartbroken.addActionListener((e) -> {
            heartbrokenFrame.setVisible(false);
            heartbrokenFrame.dispose();
            Page3();
        });
        heartbrokenPanel.add(heartbrokenButton);

        heartbrokenPanel.add(tearfulInfoText);
        heartbrokenPanel.setLayout(null);
        heartbrokenFrame.setVisible(true);

    }

    public static void excited(){
        // setting up the frame
        excitedFrame = new JFrame();
        excitedFrame.setBackground(Color.decode("#FF67BD"));
        excitedPanel = new JPanel();
        excitedFrame.setSize(500, 500);
        excitedFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        excitedFrame.add(excitedPanel);

        // label for "excited" emotion
        excitedEmotion = new JLabel("Excited");
        excitedEmotion.setBounds(50, 50, 500, 50);
        excitedEmotion.setFont(new Font("Serif", Font.PLAIN, 40));
        excitedPanel.add(excitedEmotion);

        // text for excited emotion
        excitedInfoText = new JTextArea("Life is the most exciting thing that’ll ever happen to you! \n" +
                "Nothing stays forever. Enjoy the moment while you \n" +
                "work to create the most exciting future! \n" +
                "Listen to these beats if the future \n" + "looks good to you!\n");

        excitedInfoText.setBounds(120,50,350,75);
        excitedInfoText.setFont(new Font("Serif", Font.PLAIN, 14));

        JButton excitedButton = new JButton("Excited Playlist");
        excitedButton.setBounds(100, 250, 280, 50);
        excitedButton.addActionListener((e) -> {
            excitedFrame.setVisible(false);
            excitedFrame.dispose();
            // call next screen
            if (e.getSource() == excitedButton) {
                playlistLink = "https://open.spotify.com/playlist/5pAnOGGiCrQuhruhD4pqx6?si=30805ab8277745f9";
                openPlaylist(playlistLink);
            }
        });
        excitedPanel.add(excitedButton);
        JButton backButtonExcited = new JButton("Back");
        backButtonExcited.setBounds(100, 300, 280, 50);
        backButtonExcited.addActionListener((e) -> {
            excitedFrame.setVisible(false);
            excitedFrame.dispose();
            Page3();
        });

        excitedPanel.add(excitedInfoText);
        excitedPanel.setLayout(null);
        excitedFrame.setVisible(true);

    }

    public static void hopeful(){
        // setting up the frame
        hopefulFrame = new JFrame();
        hopefulFrame.setBackground(Color.decode("#98E9ED"));
        hopefulPanel = new JPanel();
        hopefulFrame.setSize(500, 500);
        hopefulFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        hopefulFrame.add(hopefulPanel);

        // label for hopeful emotion
        hopefulEmotion = new JLabel("Hopeful");
        hopefulEmotion.setBounds(50, 50, 500, 50);
        hopefulEmotion.setFont(new Font("Serif", Font.PLAIN, 40));
        hopefulPanel.add(hopefulEmotion);

        // text for hopeful emotion
        hopefulInfoText = new JTextArea("Hope is what keeps us going, hope for a better tomorrow! And just sometimes, \n" +
                "our hopes become our reality too. Just keep going and never give in! We hope these beats increase your \n" +
                "faith in your hopes!");
        hopefulInfoText.setBounds(120, 50, 350, 75);
        hopefulInfoText.setFont(new Font("Serif", Font.PLAIN, 14));

        JButton hopefulButton = new JButton("Hopeful Button");
        hopefulButton.setBounds(100,250,280,50);
        hopefulButton.addActionListener((e) -> {
            hopefulFrame.setVisible(false);
            hopefulFrame.dispose();
            // call next screen
            if (e.getSource() == hopefulButton) {
                playlistLink = "https://open.spotify.com/playlist/7tXAxOtJiW8QUHX0STHv2k?si=51e8d89986554e0e";
                openPlaylist(playlistLink);
            }
        });
        hopefulPanel.add(hopefulButton);

        JButton backButtonHopeful = new JButton("Back");
        backButtonHopeful.setBounds(100, 300, 280, 50);
        backButtonHopeful.addActionListener((e) -> {
            hopefulFrame.setVisible(false);
            hopefulFrame.dispose();
            Page3();
        });

        hopefulPanel.add(hopefulInfoText);
        hopefulPanel.setLayout(null);
        hopefulFrame.setVisible(true);

    }

    public static void optimistic(){
        // setting up the frame
        optimisticFrame = new JFrame();
        optimisticFrame.setBackground(Color.decode("#FFC91C"));
        optimisticPanel = new JPanel();
        optimisticFrame.setSize(500, 500);
        optimisticFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        optimisticFrame.add(optimisticPanel);

        // label for optimistic emotion
        optimisticEmotion = new JLabel("Optimistic");
        optimisticEmotion.setBounds(50, 50, 500, 50);
        optimisticEmotion.setFont(new Font("Serif", Font.PLAIN, 40));
        optimisticPanel.add(optimisticEmotion);

        // text for optimistic emotion
        optimisticInfoText = new JTextArea("Looking for a dose of positivity? You’ve come to the right place! It's all about \n" +
                "the mindset. You can’t control what happens to you, but you can always control how you react to it. \n" +
                "So, tie your laces, and get ready to have the best reaction to whatever life throws at you!");
        optimisticInfoText.setBounds(120, 50, 350, 75);
        optimisticInfoText.setFont(new Font("Serif", Font.PLAIN, 14));


        JButton optimisticButton = new JButton("Optimistic Playlist");
        optimisticButton.setBounds(100, 250,280,50);
        optimisticButton.addActionListener((e) -> {
            optimisticFrame.setVisible(false);
            optimisticFrame.dispose();
            // call next screen
            if (e.getSource() == optimisticButton) {
                playlistLink = "https://open.spotify.com/playlist/5B93aZgIw8eTCymnMajiAS?si=e864f50dbdcf406d";
                openPlaylist(playlistLink);
            }

        });
        optimisticPanel.add(optimisticButton);

        JButton backButtonOptimistic = new JButton("Back");
        backButtonOptimistic.setBounds(100, 300, 280, 50);
        backButtonOptimistic.addActionListener((e) -> {
            optimisticFrame.setVisible(false);
            optimisticFrame.dispose();
            Page3();
        });

        optimisticPanel.add(optimisticInfoText);
        optimisticPanel.setLayout(null);
        optimisticFrame.setVisible(true);

    }

    public static void nervous(){
        // setting up the frame
        nervousFrame = new JFrame();
        nervousFrame.setBackground(Color.decode("#539D53"));
        nervousPanel = new JPanel();
        nervousFrame.setSize(500, 500);
        nervousFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        nervousFrame.add(nervousPanel);

        // label for nervous emotion
        nervousEmotion = new JLabel("Nervous");
        nervousEmotion.setBounds(50, 50, 500, 50);
        nervousEmotion.setFont(new Font("Serif", Font.PLAIN, 40));
        nervousPanel.add(nervousEmotion);

        // text for nervous emotion
        nervousInfoText = new JTextArea("Worried about a presentation, or is something more serious? Well, just know that you \n" +
                "have the power to get through it. Sometimes, being nervous is what makes you perform even better. \n" +
                "Hope you don’t get overwhelmed by it and have a good one! Oop, totally forgot to add, these beats might give \n" +
                "you a little bit of help.");
        nervousInfoText.setBounds(120, 50, 350, 75);
        nervousInfoText.setFont(new Font("Serif", Font.PLAIN, 14));

        JButton nervousButton = new JButton("Nervous Playlist");
        nervousButton.setBounds(100, 250, 200, 50);
        nervousButton.addActionListener((e) -> {
            nervousFrame.setVisible(false);
            nervousFrame.dispose();
            // call next screen
            if (e.getSource() == nervousButton) {
                playlistLink = "https://open.spotify.com/playlist/1hnbFl0InXfDaPcsP0qcFp?si=d46eb8e4653746ff";
                openPlaylist(playlistLink);
            }


        });
        nervousPanel.add(nervousButton);

        JButton backButtonNervous = new JButton("Back");
        backButtonNervous.setBounds(100, 300, 280, 50);
        backButtonNervous.addActionListener((e) -> {
            nervousFrame.setVisible(false);
            nervousFrame.dispose();
            Page3();
        });

        nervousPanel.add(nervousInfoText);
        nervousPanel.setLayout(null);
        nervousFrame.setVisible(true);

    }

    public static void confused(){
        // setting up the frame
        confusedFrame = new JFrame();
        confusedFrame.setBackground(Color.decode("#9C7F21"));
        confusedPanel = new JPanel();
        confusedFrame.setSize(500, 500);
        confusedFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        confusedFrame.add(confusedPanel);

        // label for confused emotion
        confusedEmotion = new JLabel("Confused");
        confusedEmotion.setBounds(50, 50, 500, 50);
        confusedEmotion.setFont(new Font("Serif", Font.PLAIN, 40));
        confusedPanel.add(confusedEmotion);

        // text for confused emotion
        confusedInfoText = new JTextArea("Confused: Hmm what is going on?? Life sometimes throws us curve balls and we don’t \n" +
                "know how to react. Sometimes, this makes us genuinely curious, something it leaves us annoyed. \n" +
                "Either way, this playlist’s greatness is not confusing.");
        confusedInfoText.setBounds(120, 50, 350, 75);
        confusedInfoText.setFont(new Font("Serif", Font.PLAIN, 14));

        JButton confusedButton = new JButton("Confused Playlist");
        confusedButton.setBounds(100,250,280,50);
        confusedButton.addActionListener((e) -> {
            confusedFrame.setVisible(false);
            confusedFrame.dispose();
            // call next screen
            if (e.getSource() == confusedButton) {
                playlistLink = "https://open.spotify.com/playlist/5ma2pSUS004J7r1sdkZZ1K?si=5ec5770670c445e8";
                openPlaylist(playlistLink);
            }
        });

        JButton backButtonConfused = new JButton("Back");
        backButtonConfused.setBounds(100, 300, 280, 50);
        backButtonConfused.addActionListener((e) -> {
            confusedFrame.setVisible(false);
            confusedFrame.dispose();
            Page3();
        });

        confusedPanel.add(confusedButton);

        confusedPanel.add(confusedInfoText);
        confusedPanel.setLayout(null);
        confusedFrame.setVisible(true);

    }

    public static void happyPage() {
        //frame
        happyFrame = new JFrame();
        happyPanel = new JPanel();
        happyFrame.setSize(500, 500);
        happyFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        happyPanel.setBackground(Color.decode("#FFFF00"));

        //label
        happyEmotion = new JLabel("Happy");
        happyEmotion.setBounds(50, 50, 500, 50);
        happyEmotion.setFont(new Font("Serif", Font.PLAIN, 40));

        //text
        happyText = new JTextArea("Yay! Happy! With happiness, you experience contentedness and a brightened perspective.\n" +
                "Happiness doesn’t always mean everything is alright, perhaps you’re choosing to focus on the positive.\n" +
                "With a smile on your face, a twinkle in your eye, and a bounce in your step, you’re ready to take on the day!\n" +
                "Happiness stems from multiple sources, whether it’s family, friends, food, or anything else!\n" +
                "Whatever it is, here’s a playlist to match your bubbly vibes!\n");

        happyText.setBounds(120, 50, 350, 75);
        happyText.setFont(new Font("Serif", Font.PLAIN, 14));

        //button
        happyButton = new JButton("Happy Playlist");
        happyButton.setBounds(100, 250, 280, 50);
        happy.addActionListener((e) -> {
            happyFrame.setVisible(false);
            happyFrame.dispose();
            // call next screen
            if (e.getSource() == happyButton) {
                playlistLink = "https://open.spotify.com/playlist/1VQcd4cBfVe9ftXTi2aDRA?si=62454d6cb3e14ad0";
                openPlaylist(playlistLink);
            }
        });

        backButton = new JButton("Back");
        backButton.setBounds(100, 300, 280, 50);
        backButton.addActionListener((e) -> {
            happyFrame.setVisible(false);
            happyFrame.dispose();
            Page3();
        });

        happyPanel.add(backButton);

        //happyButton.addActionListener(actionListener);
        happyFrame.add(happyPanel);
        happyPanel.add(happyEmotion);
        happyPanel.add(happyText);
        happyPanel.add(happyButton);

        happyPanel.setLayout(null);
        happyFrame.setVisible(true);
    }

    //lethargic page
    public static void lethargicPage() {
        //frame
        lethargicFrame = new JFrame();
        lethargicFrame.setBackground(Color.decode("#767945"));
        lethargicPanel = new JPanel();
        lethargicFrame.setSize(500, 500);
        lethargicFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //label
        lethargicEmotion = new JLabel("Lethargic");
        lethargicEmotion.setBounds(50, 50, 500, 50);
        lethargicEmotion.setFont(new Font("Serif", Font.PLAIN, 40));

        //text
        lethargicText = new JTextArea("Tired of all your workload? You should be proud of how hard you have been\n" +
                "working(or not) and jam into these beats to get the energy flowing.\n");

        lethargicText.setBounds(225, 40, 1000, 50);
        lethargicText.setFont(new Font("Serif", Font.PLAIN, 14));

        //button
        lethargicButton = new JButton("Lethargic Playlist");
        lethargicButton.setBounds(550, 300, 200, 50);
        lethargic.addActionListener((e) -> {
            lethargicFrame.setVisible(false);
            lethargicFrame.dispose();
            // call next screen
            if (e.getSource() == lethargicButton) {
                playlistLink = "https://open.spotify.com/playlist/4VZbLAwWwKmY2KkyssRm9K?si=bb43cea2fbb14f40\n";
                openPlaylist(playlistLink);
            }
        });

        //lethargicButton.addActionListener(actionListener);

        JButton backButtonLethargic = new JButton("Back");
        backButtonLethargic.setBounds(100, 300, 280, 50);
        backButtonLethargic.addActionListener((e) -> {
            lethargicFrame.setVisible(false);
            lethargicFrame.dispose();
            Page3();
        });
        lethargicFrame.add(lethargicPanel);
        lethargicPanel.add(lethargicEmotion);
        lethargicPanel.add(lethargicText);
        lethargicPanel.add(lethargicButton);

        lethargicPanel.setLayout(null);
        lethargicFrame.setVisible(true);
    }

    //hype page
    public static void hypePage() {
        //frame
        hypeFrame = new JFrame();
        hypePanel = new JPanel();
        hypeFrame.setSize(500, 500);
        hypeFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        hypePanel.setBackground(Color.decode("#FF1D84"));

        //label
        hypeEmotion = new JLabel("Hype");
        hypeEmotion.setBounds(50, 50, 500, 50);
        hypeEmotion.setFont(new Font("Serif", Font.PLAIN, 40));

        //text
        hypeText = new JTextArea("Let’s get excited! The way you perceive things matters a lot!\n" +
                "Getting hyped for little things makes them a ton more exciting!\n" +
                "So put on the speakers and let's get hyped!");

        hypeText.setBounds(175, 25, 500, 65);
        hypeText.setFont(new Font("Serif", Font.PLAIN, 14));

        //button
        hypeButton = new JButton("Hype Playlist");
        hypeButton.setBounds(550, 300, 200, 50);

        hype.addActionListener((e) -> {
            hypeFrame.setVisible(false);
            hypeFrame.dispose();
            // call next screen
            if (e.getSource() == hypeButton) {
                playlistLink = "https://open.spotify.com/playlist/3jlUqrAKdwCvr5LROT7J1a?si=15e410d2cf2845c1";
                openPlaylist(playlistLink);
            }
        });
        //hypeButton.addActionListener(actionListener);

        JButton backButtonHype = new JButton("Back");
        backButtonHype.setBounds(100, 300, 280, 50);
        backButtonHype.addActionListener((e) -> {
            hypeFrame.setVisible(false);
            hypeFrame.dispose();
            Page3();
        });
        hypeFrame.add(hypePanel);
        hypePanel.add(hypeEmotion);
        hypePanel.add(hypeText);
        hypePanel.add(hypeButton);

        hypePanel.setLayout(null);
        hypeFrame.setVisible(true);
    }

    //angry page
    public static void angryPage() {
        //frame
        angryFrame = new JFrame();
        angryFrame.setBackground(Color.decode("#A40000"));
        angryPanel = new JPanel();
        angryFrame.setSize(500, 500);
        angryFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //label
        angryEmotion = new JLabel("Angry");
        angryEmotion.setBounds(50, 50, 500, 50);
        angryEmotion.setFont(new Font("Serif", Font.PLAIN, 40));

        //text
        angryText = new JTextArea("Angry at how life is/ the world works?\n" +
                "Well, let’s channel that anger into something productive.\n" +
                "Let’s hope these beats stop you from throwing all the plates out of the window!");

        angryText.setBounds(175, 30, 500, 60);
        angryText.setFont(new Font("Serif", Font.PLAIN, 14));

        //button
        angryButton = new JButton("Angry Playlist");
        angryButton.setBounds(550, 300, 200, 50);
        angry.addActionListener((e) -> {
            angryFrame.setVisible(false);
            angryFrame.dispose();
            // call next screen
            if (e.getSource() == angryButton) {
                playlistLink = "https://open.spotify.com/playlist/02IZNGf6D3NGIKHA2yPjsz?si=ca7ef272d03442c4";
                openPlaylist(playlistLink);
            }
        });
        //angryButton.addActionListener(actionListener);

        JButton backButtonAngry = new JButton("Back");
        backButtonAngry.setBounds(100, 300, 280, 50);
        backButtonAngry.addActionListener((e) -> {
            angryFrame.setVisible(false);
            angryFrame.dispose();
            Page3();
        });

        angryFrame.add(angryPanel);
        angryPanel.add(angryEmotion);
        angryPanel.add(angryText);
        angryPanel.add(angryButton);

        angryPanel.setLayout(null);
        angryFrame.setVisible(true);
    }

    //moody page
    public static void moodyPage() {
        //frame
        moodyFrame = new JFrame();
        moodyPanel = new JPanel();
        moodyFrame.setSize(500, 500);
        moodyFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        moodyPanel.setBackground(Color.decode("#706665"));

        //label
        moodyEmotion = new JLabel("Moody");
        moodyEmotion.setBounds(50, 50, 500, 50);
        moodyEmotion.setFont(new Font("Serif", Font.PLAIN, 40));

        //text
        moodyText = new JTextArea("Aw man, sometimes you’re just not in a good mood.\n" +
                "Things may not going right, you might not be feeling well,\n" +
                "but may we offer a playlist to potentially make you feel better?\n");

        moodyText.setBounds(175, 30, 500, 60);
        moodyText.setFont(new Font("Serif", Font.PLAIN, 14));

        //button
        moodyButton = new JButton("Moody Playlist");
        moodyButton.setBounds(550, 300, 200, 50);
        moody.addActionListener((e) -> {
            moodyFrame.setVisible(false);
            moodyFrame.dispose();
            // call next screen
            if (e.getSource() == moodyButton) {
                playlistLink = "https://open.spotify.com/playlist/5MvYLlpA7HPOxoeDy7GwlF?si=26bc604f083d46e2\n";
                openPlaylist(playlistLink);
            }
        });
        //moodyButton.addActionListener(actionListener);

        JButton backButtonMoody = new JButton("Back");
        backButtonMoody.setBounds(100, 300, 280, 50);
        backButtonMoody.addActionListener((e) -> {
            moodyFrame.setVisible(false);
            moodyFrame.dispose();
            Page3();
        });
        moodyFrame.add(moodyPanel);
        moodyPanel.add(moodyEmotion);
        moodyPanel.add(moodyText);
        moodyPanel.add(moodyButton);

        moodyPanel.setLayout(null);
        moodyFrame.setVisible(true);
    }

    //Opens respective playlist
    private static void openPlaylist(String playlistLink) {
        try {
            Desktop desktop = java.awt.Desktop.getDesktop();
            URI oURL = new URI(playlistLink);
            desktop.browse(oURL);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void feedbackPage() {
        //Frame
        feedbackFrame = new JFrame();
        Container container = feedbackFrame.getContentPane();
        container.setLayout(new BorderLayout());
        feedbackPanel = new JPanel();
        feedbackPanel1 = new JPanel();
        feedbackFrame.setSize(3000,500);
        feedbackFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //Label
        feedbackLabel = new JLabel("Feedback - how are we doing?");
        feedbackLabel.setBounds(500, 20, 500, 35);
        feedbackLabel.setFont(new Font("Serif", Font.PLAIN, 20));
        feedbackPanel.add(feedbackLabel);

        //star rating
        StarRater starRater = new StarRater(5, 2, 1);
        starRater.addStarListener(
                new StarRater.StarListener()   {
                    public void handleSelection(int selection) {
                        System.out.println(selection);
                    }
                });
        feedbackPanel1.add(starRater);
        feedbackFrame.add(feedbackPanel);
        feedbackFrame.add(feedbackPanel1);
        feedbackFrame.setVisible(true);

        container.add(feedbackPanel, BorderLayout.NORTH);
        container.add(feedbackPanel1, BorderLayout.CENTER);
    }

}
