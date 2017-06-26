/* 
 * Copyright (C) Creactiviti LLC - All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential
 * Written by Arik Cohen <arik@creactiviti.com>, Mar 2017
 */
package com.creactiviti.piper.core.task;

import com.creactiviti.piper.core.Accessor;

public interface Task extends Accessor {
  
  /**
   * Get the type of the task. Type strings
   * are mapped to {@link TaskHandler} implementations
   * designed to handler that type of task. 
   * 
   * @return String
   */
  String getType ();
  
}