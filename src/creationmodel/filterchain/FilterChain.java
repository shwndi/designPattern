package creationmodel.filterchain;

import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/**
 * @author czy
 * @date 2021/3/4
 */
public class FilterChain {
    private  List<Filter> filters;
   /* static {
        try {
            Class<?> clazz = Class.forName("creationmodel.filterchain.Filter");
            Class<?>[] clazzInterfaces = clazz.getInterfaces();
            for (int i = 0; i < clazzInterfaces.length; i++) {
                Filter o = (Filter)clazzInterfaces[i].getDeclaredConstructor().newInstance();
                filters.add(o);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }*/
    int pos =0;

    public FilterChain() {
        filters = new LinkedList<>();
    }

    public void addFilter(Filter filter){
        filters.add(filter);
    }
    public void doFilter(Request request,Response response){
        System.out.println(pos);
        System.out.println(request.getContent());
        System.out.println(response.getContent());
        if (pos< filters.size()){
            filters.get(pos++).doFilter(request,response,this);
        }
    }
}
