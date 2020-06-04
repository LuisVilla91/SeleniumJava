package IFrame;

import Base.BaseTest;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class FrameTest extends BaseTest {
    @Test
    public void testWysiwyg(){
        String text1 = "hello ";
        String text2 = "world";
        var editorPage = homePage.clickWysiwygEditor();
        editorPage.clearTextArea();
        editorPage.setTextArea(text1);
        editorPage.increaseIndentButton();
        editorPage.setTextArea(text2);
        assertEquals(editorPage.getTextFromEditor(), text1+text2, "hello world");

    }
}
