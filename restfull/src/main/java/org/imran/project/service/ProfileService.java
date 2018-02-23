package org.imran.project.service;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.imran.project.database.Database;
import org.imran.project.model.Profile;;

public class ProfileService {
	private Map<String,Profile> profiles=Database.getProfile();
	
	public ProfileService()
	{
		profiles.put("imran", new Profile(1L,"imran","Imran","Hossain"));
		profiles.put("allauddin", new Profile(2L,"allauddin","Allauddin","Hossain"));
	}
	public List<Profile> getAllProfile()
	{
		return new ArrayList<>(profiles.values());
	}
	public Profile addOneProfile(Profile profile)
	{
		 profile.setId((long) (profiles.size()+1));
		 profiles.put(profile.getProfileName(), profile);
		 return profile;
	}
	public Profile updateOneProfile(Profile profile)
	{
		 if(profile.getProfileName()==null)
		 {
			 return null;
		 }
		 profiles.put(profile.getProfileName(), profile);
		 return profile;
	}
	public Profile getOneProfile(String userName)
	{
		return profiles.get(userName);
	}
	public void deleteProfile(String userName)
	{
		profiles.remove(userName);
	}

}
