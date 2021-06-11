package creator.old.filterchain;

/**
 * 责任链模式
 *
 * @author czy
 * @date 2021/3/4
 */
public interface Filter {
    void doFilter(Request resquest, Response response, FilterChain chain);
}
