/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.dolphinscheduler.dao.mapper;

import org.apache.dolphinscheduler.dao.entity.UdfFunc;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UdfFuncMapper extends BaseMapper<UdfFunc> {


    List<UdfFunc> queryUdfByIdStr(@Param("ids") String ids,
                                  @Param("funcNames") String funcNames);

    IPage<UdfFunc> queryUdfFuncPaging(IPage<UdfFunc> page,
                                      @Param("userId") int userId,
                                      @Param("searchVal") String searchVal);

    List<UdfFunc> getUdfFuncByType(@Param("userId") int userId,
                                   @Param("type") Integer type);

    List<UdfFunc> queryUdfFuncExceptUserId(@Param("userId") int userId);

    List<UdfFunc> queryAuthedUdfFunc(@Param("userId") int userId);


}