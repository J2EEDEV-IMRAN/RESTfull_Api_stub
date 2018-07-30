package org.imran.project.database;

import java.util.HashMap;
import java.util.Map;

import org.imran.project.model.Message;
import org.imran.project.model.Profile;

public class Database {
	
	private static Map<Long, Message> message=new HashMap<>();
	private static Map<String, Profile> profile=new HashMap<>();
	
	public static Map<Long, Message> getMessage() {
		return message;
	}

	public static Map<String, Profile> getProfile() {
		return profile;
	}

}
