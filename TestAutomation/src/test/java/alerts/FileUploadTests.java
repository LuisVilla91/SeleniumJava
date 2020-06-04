package alerts;

import Base.BaseTest;
import org.testng.annotations.Test;

public class FileUploadTests extends BaseTest {

    @Test
    public void testFileUpload(){
        var uploadPage = homePage.clickFileUpload();
        uploadPage.uploadFile(" /Users/luis.villa/Downloads/vida_saludable.jpg ");

    }
}
