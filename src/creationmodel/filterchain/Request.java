package creationmodel.filterchain;

/**
 * 请求类
 *
 * @author czy
 * @date 2021/3/4
 */
public class Request {
    StringBuffer content;

    public Request() {
        content = new StringBuffer("request");
    }

    public Request(String content){
        this.content = new StringBuffer(content);
    }

    public StringBuffer getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = new StringBuffer(content);
    }

    public void append(String append){
        this.content.append(append);
    }

}
