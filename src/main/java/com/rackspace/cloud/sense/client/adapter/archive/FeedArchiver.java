package com.rackspace.cloud.sense.client.adapter.archive;

import com.rackspace.cloud.sense.client.adapter.AdapterTools;
import com.rackspace.cloud.sense.domain.response.AdapterResponse;
import java.util.Calendar;
import org.apache.abdera.model.Feed;
import org.apache.abdera.protocol.server.RequestContext;


/**
 * This interface describes an adapter that is able to archive and store feeds as
 * well as retrieve them. This interface may be tagged onto a FeedSourceAdapter
 * to combine the functionality of both in one class.
 *
 * @author John Hopper
 */
public interface FeedArchiver {

    /**
     * 
     * @param tools
     * @param feedSourceAdapter
     */
    void init(AdapterTools tools);

    /**
     *
     * @param request
     * @param date
     * @return
     */
    AdapterResponse<Feed> getArchivedFeed(RequestContext request, Calendar date);

    /**
     * 
     * @param date
     */
    void archiveFeed(Feed feed, Calendar date);
}
