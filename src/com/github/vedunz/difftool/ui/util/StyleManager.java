package com.github.vedunz.difftool.ui.util;

import javax.swing.text.Style;
import javax.swing.text.StyleConstants;
import javax.swing.text.StyleContext;
import java.awt.*;

public class StyleManager {
    public static final String MAIN_STYLE_NAME = "MainStyle";
    public static final String SAME_STYLE_NAME = "SameStyle1";
    public static final String SAME_STYLE_NAME_BOLD = "SameStyle2";
    public static final String DIFF_STYLE_NAME = "DiffStyle";
    public static final String DIFF_STYLE_NAME_BOLD = "DiffStyle2";
    private final static StyleContext styleContext = new StyleContext();

    public static StyleContext getStyleContext() {
        return styleContext;
    }

    static  {
        Style defaultStyle = styleContext.getStyle(StyleContext.DEFAULT_STYLE);

        Style mainStyle = styleContext.addStyle(MAIN_STYLE_NAME, defaultStyle);
        StyleConstants.setFontFamily(mainStyle, "Monospaced");
        StyleConstants.setBackground(mainStyle, Color.WHITE);
        StyleConstants.setFontSize(mainStyle, 12);

        Style sameStyle = styleContext.addStyle(SAME_STYLE_NAME, defaultStyle);
        StyleConstants.setFontFamily(sameStyle, "Monospaced");
        StyleConstants.setBackground(sameStyle, new Color(0xD0, 0xFF, 0xD0));
        StyleConstants.setFontSize(sameStyle, 12);

        Style sameStyle2 = styleContext.addStyle(SAME_STYLE_NAME_BOLD, defaultStyle);
        StyleConstants.setFontFamily(sameStyle2, "Monospaced");
        StyleConstants.setBackground(sameStyle2, new Color(0x90, 0xFF, 0xA0));
        StyleConstants.setFontSize(sameStyle2, 12);

        Style diffStyle = styleContext.addStyle(DIFF_STYLE_NAME, defaultStyle);
        StyleConstants.setFontFamily(diffStyle, "Monospaced");
        StyleConstants.setBackground(diffStyle, new Color(0xFF, 0xD0, 0xD0));
        StyleConstants.setFontSize(diffStyle, 12);

        Style diffStyle2 = styleContext.addStyle(DIFF_STYLE_NAME_BOLD, defaultStyle);
        StyleConstants.setFontFamily(diffStyle2, "Monospaced");
        StyleConstants.setBackground(diffStyle2, new Color(0xFF, 0xA0, 0x90));
        StyleConstants.setFontSize(diffStyle2, 12);
    }
}
