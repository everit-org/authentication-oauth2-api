/*
 * Copyright (C) 2011 Everit Kft. (http://www.everit.org)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.everit.authentication.oauth2;

import javax.servlet.http.HttpServletRequest;

/**
 * Responsible to provide information from OAuth2 server.
 */
public interface OAuth2Communicator {

  /**
   * Gets OAuth2 server full authorization uri with parameters.
   *
   * @return the full authorization uri.
   */
  String getAuthorizationUriWithParams();

  /**
   * Gets (obtain) userID from OAuth2 server which already unique in client login.
   *
   * @param accessTokenResponse
   *          the access token that can be used to query the information form the OAuth2 provider.
   * 
   * @return the unique user ID.
   */
  String getUniqueUserId(AccessTokenResponse accessTokenResponse);

  /**
   * Reads the access token from OAuth2 authorization response.
   *
   * @param req
   *          the {@link HttpServletRequest} which contains the OAuth2 server response when redirect
   *          to own server after authorize user.
   * @return the {@link AccessTokenResponse}.
   */
  AccessTokenResponse readAccessToken(HttpServletRequest req);

}
