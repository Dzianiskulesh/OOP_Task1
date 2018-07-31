package com.epam.task01;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        //Create a list of Figures
        List<Figure> figures = new ArrayList<Figure>();

        figures.add(FigureFactory.createFigure(FigureType.Circle));
        figures.add(FigureFactory.createFigure(FigureType.Square));
        figures.add(FigureFactory.createFigure(FigureType.Rectangle));

        //Find square for every Figure in list
        // TODO:DK: Применение foreach - хорошо. Но теперь в данном случае код не имеет смысла , он просто считает площадь и ничего с ней не делает.
        for (Figure figure: figures) {
            figure.findSquare();
        }
        FigureUtils.printFiguresSquares(figures);

        //Sort list of Figures by square
        Collections.sort(figures, new Comparator<Figure>() {

            public int compare(Figure a, Figure b) {
                try {
                    return Double.compare(a.findSquare(), b.findSquare());
                } catch(NullPointerException e){
                    // TODO: DK: Когда мы ожиданем что тут может быть NullPointer, лучше сразу проверить чем ловить эксепшн
                    System.out.println("NullPointerException caught!");
                }
                // TODO: DK: При такой имплементации если a==null, b!=null - вернётся 0, что означает что они равны для сортинга. Мне кажется что лучше сделать сортировку таким образом чтобы null был либо больше либо меньше любого не NULL
                return 0;
            }
        });

        //Compare Figures square with number
        FigureUtils.compageFiguresWithNumber(figures, 75.14);

        //Print squares of Figures list
        FigureUtils.printFiguresSquares(figures);
    }
}
