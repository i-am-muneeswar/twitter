package com.twitter.dao;

import com.twitter.entity.TwitterUser;

public class TwitterDAO {

	public int createProfileDAO(TwitterUser tu) {
		
		if(tu.getName().equals("Muneeswar")) {
			return 1;
		}

		return 0;
	}
	
	

}
