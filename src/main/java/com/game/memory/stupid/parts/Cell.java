package com.game.memory.stupid.parts;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.StackPane;

/**
 * Created by Chi Joung so <chijoung@gmail.com on 2-10-2020.
 */
public class Cell extends StackPane {


    private final MemoryPane pane;
    private final String cardType;

    private final int number;

    private ImageView imageView;

    private boolean flipped;
    private int i;
    private int j;

    public Cell(MemoryPane pane, String cardType, int i, int j, int number) {
        this.pane = pane;
        this.cardType = cardType;
        this.i = i;
        this.j = j;
        this.number = number;

        this.setPrefSize(200, 150);
        this.setOnMouseClicked(e -> pane.handleMouseClick(i, j));

        setBack();
    }

    public void setBack() {
        imageView = new ImageView(new Image("/image/" + cardType
                + "/backCard.jpg"));
        this.getChildren().add(imageView);
    }

    public void setFront() {
        imageView = new ImageView(new Image("/image/" + cardType + "/"
                + number + ".jpg"));
        this.getChildren().add(imageView);
    }

    public boolean isFlipped() {
        return flipped;
    }

    public void setFlipped(boolean flipped) {
        this.flipped = flipped;
    }

    public int getI() {
        return i;
    }

    public int getJ() {
        return j;
    }

}