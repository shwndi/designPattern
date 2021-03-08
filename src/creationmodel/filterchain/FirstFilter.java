package creationmodel.filterchain;

/**
 * @author czy
 * @date 2021/3/4
 */
public class FirstFilter implements Filter {
    @Override
    public void doFilter(Request request, Response response, FilterChain chain) {
        request.append(" firsrt Filter || ");

        chain.doFilter(request, response);
        response.append(" firsrt Filter || ");

    }
}
