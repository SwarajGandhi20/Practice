package hello;

/**
 * Created by swaraj on 19/6/16.
 *
 * @author evivehealth on 19/6/16.
 */
public class Greeting {

    private long id;
    private String content;

    public void setId(long id) {
        this.id = id;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public long getId() {
        return id;
    }

    public String getContent() {
        return content;
    }

    public Greeting(long id, String content) {
        this.id = id;
        this.content = content;
    }
}
