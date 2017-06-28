package webtest.data;

import webtest.Spittle;

import java.util.List;

/**
 * Created by king on 2017/6/27.
 */
public interface SpittleRepository {
    List<Spittle> findSpittles(long max, int count);
}
