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

package org.apache.dolphinscheduler.dao.entity;

import com.baomidou.mybatisplus.annotation.TableName;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@TableName("t_ds_upload_file")
final public class UploadFile {

    private String sessionId;
    private int pid;
    private String name;
    private String description;
    private Long size;
    private String currentDir;
    private String splitsPath;
    private String tenantCode;
    private int typeCode;

    public UploadFile() {
    }

    public UploadFile(String sessionId, int pid, String name, String description, Long size, String currentDir, String splitsPath, String tenantCode,
        int typeCode) {
        this.sessionId = sessionId;
        this.pid = pid;
        this.name = name;
        this.description = description;
        this.size = size;
        this.currentDir = currentDir;
        this.splitsPath = splitsPath;
        this.tenantCode = tenantCode;
        this.typeCode = typeCode;
    }
}
