/*
 * Copyright 2015-2017 Real Logic Ltd.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package uk.co.real_logic.artio.library;

/**
 * Callback that is invoked when a library is notified of a session existing.
 *
 * This will either be called when a new session is accepted on the gateway or
 * when the library first connects.
 *
 * @see LibraryConfiguration#sessionExistsHandler(SessionExistsHandler)
 */
@FunctionalInterface
public interface SessionExistsHandler
{
    /**
     * If either of the subId or locationId fields are not present in the logon message <code>""</code> will
     * be passed as an argument.
     *
     * @param library the library object that this callback is associated with
     * @param surrogateId the identifying number of the session that now exists.
     * @param localCompId the compId for the local party in the logon message (eg targetCompId if acceptor).
     * @param localSubId the subId for the local party in the logon message (eg targetSubId if acceptor).
     * @param localLocationId the locationId for the local party in the logon message (eg targetLocationId if acceptor)
     * @param remoteCompId the compId for the local party in the logon message (eg senderCompId if acceptor).
     * @param remoteSubId the subId for the local party in the logon message (eg senderSubId if acceptor).
     * @param remoteLocationId the locationId for the local party in the logon message (eg senderLocationId if acceptor)
     */
    void onSessionExists(
        FixLibrary library,
        long surrogateId,
        String localCompId,
        String localSubId,
        String localLocationId,
        String remoteCompId,
        String remoteSubId,
        String remoteLocationId);
}