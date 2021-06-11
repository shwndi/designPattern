package creator.old.filterchain;

/**
 * @author czy
 * @date 2021/3/4
 */
public class test {
    public static void main(String[] args) {
        FilterChain chain = new FilterChain();
        chain.addFilter(new FirstFilter());
        chain.addFilter(new SecondFilter());
        Request request = new Request();
        Response response = new Response();
        chain.doFilter(request, response);
        System.out.println(request.getContent());
        System.out.println(response.getContent());
    }
}
