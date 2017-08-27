/*
 *  Copyright 2017 Google Inc. All Rights Reserved.
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */

package com.google.android.apps.forscience.whistlepunk.opensource.modules;

import android.content.Context;

import com.google.android.apps.forscience.whistlepunk.performance.PerfTrackerProvider;

import dagger.Module;
import dagger.Provides;

@Module
public class PerfTrackerModule {
    @Provides
    public PerfTrackerProvider providesPerfTracker() {
        return new PerfTrackerProvider() {
            @Override
            public TimerToken startTimer() {
                return null;
            }

            @Override
            public void stopTimer(TimerToken token, String eventName) {

            }

            @Override
            public void startGlobalTimer(String eventName) {

            }

            @Override
            public void stopGlobalTimer(String eventName) {

            }

            @Override
            public void stopGlobalTimer(String eventName, String newEventName) {

            }

            @Override
            public boolean startPerfTrackerEventDebugActivity(Context context) {
                return false;
            }

            @Override
            public void startJankRecorder(String eventName) {

            }

            @Override
            public void stopJankRecorder(String eventName) {

            }

            @Override
            public void watchForMemoryLeak(Object object) {

            }
        };
    }
}
