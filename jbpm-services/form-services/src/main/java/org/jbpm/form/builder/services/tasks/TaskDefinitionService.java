/*
 * Copyright 2011 JBoss Inc 
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.jbpm.form.builder.services.tasks;

import java.util.List;
import org.jbpm.form.builder.services.api.TaskServiceException;

public interface TaskDefinitionService {

    List<TaskRef> query(String pkgName, String filter) throws TaskServiceException;
    
    List<TaskRef> getTasksByName(String pkgName, String processName, String taskName) throws TaskServiceException;
    
    TaskRef getTaskByUUID(String pkgName, String userTask, String uuid) throws TaskServiceException;

    String getContainingPackage(String uuid) throws TaskServiceException;

    TaskRef getBPMN2Task(String bpmn2ProcessContent, String processName, String userTask) throws TaskServiceException;
}