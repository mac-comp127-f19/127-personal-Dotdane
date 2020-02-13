package graphicsPractice;

import comp127graphics.*;

import java.awt.Color;

@SuppressWarnings("WeakerAccess")
public class Emojis {
    private static final Color
            HEAD_COLOR = new Color(0xFFDE30),
            HEAD_OUTLINE_COLOR = new Color(0xAC9620),
            MOUTH_COLOR = new Color(0xE45B5B),
            EYE_COLOR = new Color(0x000000);

    public static void main(String[] args) {
        CanvasWindow canvas = new CanvasWindow("Emoji", 800, 600);

        GraphicsGroup littleSmiley = createSmileyFace(100);
        littleSmiley.setPosition(50, 400);
        canvas.add(littleSmiley);

        GraphicsGroup littleSmiley2 = createSmileyFace(100, true);
        littleSmiley2.setPosition(50, 200);
        canvas.add(littleSmiley2);

        GraphicsGroup mediumSmiley = createFrownyFace(200);
        mediumSmiley.setPosition(150, 300);
        canvas.add(mediumSmiley);

        GraphicsGroup bigSmiley = createWinkyFace(300);
        bigSmiley.setPosition(350, 200);
        canvas.add(bigSmiley);
    }

    /**
     * Creates a smiley face emoji.
     *
     * @param size The overall width and height of the emoji.
     * @return A graphic that you can add to a window, or place inside some other graphics group.
     */
    public static GraphicsGroup createSmileyFace(double size) {
        GraphicsGroup group = new GraphicsGroup();

        group.add(createHead(size, size));

        // TODO: create eyes
        Ellipse rightEye = createEye(size * .1);
        Ellipse leftEye = createEye(size * .1);

        rightEye.setCenter(size * .35, size * .35);
        leftEye.setCenter(size * .65, size * .35);
        group.add(rightEye);
        group.add(leftEye);

        Arc mouth = createSmile(size * 0.6, size * 0.5);
        mouth.setCenter(size * 0.5, size * 0.75);
        group.add(mouth);

        return group;
    }


    public static GraphicsGroup createSmileyFace(double size, boolean hasHighlightedEyes) {
        GraphicsGroup group = new GraphicsGroup();

        group.add(createHead(size, size));

        // TODO: create eyes
        Ellipse rightEye = createEye(size * .1);
        Ellipse leftEye = createEye(size * .1);
        Ellipse rightHighlight = null;
        Ellipse leftHighlight = null;

        if (hasHighlightedEyes) {
            rightHighlight = createEyeHighlight(size * .02);
            leftHighlight = createEyeHighlight(size * .02);

            rightHighlight.setCenter(rightEye.getX() * 1.05, rightEye.getY() * 1.05);
            leftHighlight.setCenter(leftEye.getX() * 1.05, leftEye.getY() * 1.05);
            group.add(rightHighlight);
            group.add(leftHighlight);
        }


        rightEye.setCenter(size * .35, size * .35);
        leftEye.setCenter(size * .65, size * .35);
        group.add(rightEye);
        group.add(leftEye);

        Arc mouth = createSmile(size * 0.6, size * 0.5);
        mouth.setCenter(size * 0.5, size * 0.75);
        group.add(mouth);

        return group;
    }

    public static GraphicsGroup createWinkyFace(double size) {
        GraphicsGroup group = new GraphicsGroup();

        group.add(createHead(size, size));

        Line rightEye = createWinkingEye(size * .1);
        Ellipse leftEye = createEye(size * .1);

        rightEye.setCenter(size * .35, size * .35);
        leftEye.setCenter(size * .65, size * .35);
        group.add(rightEye);
        group.add(leftEye);

        Arc mouth = createSmile(size * 0.6, size * 0.5);
        mouth.setCenter(size * 0.5, size * 0.75);
        group.add(mouth);

        return group;
    }

    public static GraphicsGroup createFrownyFace(double size) {
        GraphicsGroup group = new GraphicsGroup();

        group.add(createHead(size, size));

        // TODO: create eyes
        Ellipse rightEye = createEye(size * .1);
        Ellipse leftEye = createEye(size * .1);

        rightEye.setCenter(size * .35, size * .35);
        leftEye.setCenter(size * .65, size * .35);
        group.add(rightEye);
        group.add(leftEye);

        Arc mouth = createFrown(size * 0.6, size * 0.5);
        mouth.setCenter(size * 0.5, size * 0.75);
        group.add(mouth);

        return group;
    }

    /**
     * Creates an empty emoji head. The head fits inside the box from (0,0)
     * to (width,height).
     */
    private static Ellipse createHead(double height, double width) {
        Ellipse head = new Ellipse(0, 0, width, height);
        head.setFillColor(HEAD_COLOR);
        head.setStrokeColor(HEAD_OUTLINE_COLOR);
        head.setStrokeWidth(2);
        return head;
    }

    /**
     * Creates a smile-shaped arc. The arc is measured relative to its “implied ellipse,” which is
     * the shape that would be formed if the arc were extend all the way around. The size of the
     * resulting arc will be smaller than the implied ellipse’s size.
     *
     * @param ellipseWidth  The width of the implied ellipse from which the smile’s arc is cut.
     * @param ellipseHeight The width of the implied ellipse from which the smile’s arc is cut.
     */
    private static Arc createSmile(double ellipseWidth, double ellipseHeight) {
        Arc mouth = new Arc(0, 0, ellipseWidth, ellipseHeight, 200, 140);
        mouth.setStrokeColor(MOUTH_COLOR);
        mouth.setStrokeWidth(4);
        return mouth;
    }

    private static Ellipse createEye(double width) {
        Ellipse eye = new Ellipse(0, 0, width, width);
        eye.setStrokeColor(EYE_COLOR);
        eye.setStrokeWidth(1);
        eye.setFilled(true);
        return eye;
    }

    private static Ellipse createEyeHighlight(double width) {
        Ellipse highlight = new Ellipse(width * .65, width * .35, width / 4, width / 4);
        highlight.setFilled(true);
        highlight.setFillColor(new Color(0xFFFFFF));
        highlight.setStrokeColor(new Color(0xFFFFFF));
        return highlight;
    }

    private static Line createWinkingEye(double width) {
        Line eye = new Line(0, 0, width, 0);
        eye.setStrokeWidth(width / 4);
        return eye;
    }

    private static Arc createFrown(double ellipseWidth, double ellipseHeight) {
        Arc mouth = new Arc(0, 0, ellipseWidth, ellipseHeight, 20, 140);
        mouth.setStrokeColor(MOUTH_COLOR);
        mouth.setStrokeWidth(4);
        return mouth;
    }


}