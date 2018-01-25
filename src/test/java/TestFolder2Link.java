import com.butchjgo.linkservice.common.service.*;
import org.junit.Before;
import org.junit.Test;

public class TestFolder2Link {
    private Url2Text url2Text;
    private Text2Url text2Url;
    private String url;

    @Before
    public void prepare() {
        url2Text = new SimpleUrl2Text();
        text2Url = new FshareFolder2Url();
        url = "https://www.fshare.vn/folder/2GUMA817L6TC";
    }

    //@Test
    public void test1() {
        String data = url2Text.get(url);
    }

    @Test
    public void test2() {
        String data = url2Text.get(url);
        String[] res = text2Url.getUrl(data);
        System.out.println(res.length);
        Worker.class.cast(text2Url).process(data);
        assert res.length > 0;
    }
}
