package com.gitee.search.query;

import java.io.IOException;

/**
 * 查询接口
 * @author Winter Lau<javayou@gmail.com>
 */
public interface IQuery {

    /**
     * 索引类型
     * @return
     */
    public String type();

    /**
     * 搜索关键字
     * @param key
     */
    IQuery setSearchKey(String key);

    /**
     * 排序方法
     * @param sort
     * @return
     */
    IQuery setSort(String sort);

    /**
     * 页码
     * @param page
     * @return
     */
    IQuery setPage(int page);

    /**
     * 页大小
     * @param pageSize
     * @return
     */
    IQuery setPageSize(int pageSize);

    /**
     * 扩展属性
     * @param name
     * @param key
     * @return
     */
    IQuery setFacets(String name, String key);

    /**
     * 搜索
     * @return 返回结果 json
     */
    String search() throws IOException ;

}