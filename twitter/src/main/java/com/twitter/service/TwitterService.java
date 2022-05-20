package com.twitter.service;

import com.twitter.dao.TwitterDAO;
import com.twitter.entity.TwitterUser;

public class TwitterService {

	public int createProfileService(TwitterUser tu) {
		
		TwitterDAO td = new TwitterDAO();
		
		int i = td.createProfileDAO(tu);
		
		return i;
	}
	
	

}
