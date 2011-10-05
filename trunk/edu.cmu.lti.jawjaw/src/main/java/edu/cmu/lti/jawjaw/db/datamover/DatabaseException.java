/*
 * Copyright 2009 Carnegie Mellon University
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, 
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package edu.cmu.lti.jawjaw.db.datamover;

/**
 * The DatabaseException is thrown by the data mover whenever an error occurs.
 * 
 * @author Jeff Heaton (http://www.heatonresearch.com)
 * 
 */
public class DatabaseException extends Exception {
	/**
	 * Serial id
	 */
	private static final long serialVersionUID = 838904293060250128L;

	/**
	 * Construct an exception based on another exception.
	 * 
	 * @param e
	 *            The other exception.
	 */
	public DatabaseException(Exception e) {
		super(e);
	}
}
