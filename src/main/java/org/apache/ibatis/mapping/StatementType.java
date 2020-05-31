/**
 * Copyright 2009-2015 the original author or authors.
 * <p>
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * <p>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.ibatis.mapping;

/**
 * 语句类型枚举值
 *
 * @author Clinton Begin
 */
public enum StatementType {

    /**
     * 普通的
     * STATEMENT:直接操作SQL，不进行预编译，获取数据：$—Statement
     * 只为STATEMENT，那么sql就是直接进行的字符串拼接，这样为字符串需要加上引号
     */
    STATEMENT,

    /**
     * 预编译
     * 预处理参数，进行预编译，获取数据：#—–PreparedStatement:默认
     * 使用的参数替换，也就是索引占位符，我们的#会转换为?再设置对应的参数的值
     */
    PREPARED,

    /**
     * 存储过程
     * 执行存储过程————CallableStatement
     */
    CALLABLE

}
