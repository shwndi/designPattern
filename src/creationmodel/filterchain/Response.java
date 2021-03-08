package creationmodel.filterchain;

/**
 * @author czy
 * @date 2021/3/4
 */
public class Response {
 private StringBuffer content;

    public Response() {
        content = new StringBuffer("response");
    }

    public Response(String content) {
        this.content = new StringBuffer(content);
    }

    public StringBuffer getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = new StringBuffer("content");
    }
    public void append(String append){
        this.content.append(append);
    }
}
