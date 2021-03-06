/**
 * Copyright 2020 OPSLI 快速开发平台 https://www.opsli.com
 * <p>
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 * <p>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */
package org.opsli.common.constants;

/**
 * @BelongsProject: opsli-boot
 * @BelongsPackage: org.opsli.common.constants
 * @Author: Parker
 * @CreateTime: 2020-09-16 17:42
 * @Description: 缓存 常量
 */
public interface CacheConstants {

    String PREFIX_NAME = "opsli";

    /** 热点数据 */
    String HOT_DATA = "hotData";

    /** 永久常量 */
    String EDEN_DATA = "edenData";

    /** 永久Hash常量 */
    String EDEN_HASH_DATA = "edenHashData";
}
