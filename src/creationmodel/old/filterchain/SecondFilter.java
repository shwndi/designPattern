package creationmodel.old.filterchain;

/**
 * @author czy
 * @date 2021/3/4
 */
public class SecondFilter implements Filter {
    @Override
    public void doFilter(Request request, Response response, FilterChain chain) {
        request.append(" second Filter || ");
        chain.doFilter(request, response);
        response.append(" second Filter || ");
    }
}
