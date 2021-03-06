package com.group7.healthtrac.events.challengeevents;

import com.group7.healthtrac.events.IEvent;
import com.group7.healthtrac.models.Challenge;

import java.util.List;

/**
 * Created by Courtney on 4/26/2015.
 */
public class UserChallengesObtainedEvent implements IEvent {

    private List<Challenge> mChallenges;

    public UserChallengesObtainedEvent(List<Challenge> mChallenges) {
        this.mChallenges = mChallenges;
    }

    public List<Challenge> getChallenges() {
        return mChallenges;
    }
}
