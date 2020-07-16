package com.VIG.mvc.service.feed;

import java.util.List;

import com.VIG.mvc.service.domain.Feed;
import com.VIG.mvc.service.domain.Search;

public interface FeedServices {
	
	public void addFeed(Feed feed) throws Exception; 
	
	public Feed getFeed(int feedId) throws Exception;
	
	public void deleteFeed(int feedId) throws Exception;
	
	public List<Feed> getFeedList(Search search) throws Exception;	
	
	public List<Feed> getMyFeedList(String userCode) throws Exception;	
	
	public List<Feed> getFeedListOnlyTag(String tag) throws Exception;
	
	public Feed getTempFeed(String userCode) throws Exception;	
	
	public int getLastFeedId() throws Exception;

}