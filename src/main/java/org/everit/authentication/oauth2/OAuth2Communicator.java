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

import java.util.Optional;

import javax.servlet.http.HttpServletRequest;

/**
 * Responsible to communicate with the OAuth2 server and provide information from it.
 */
public interface OAuth2Communicator {

  /**
   * Builds the authorization URL used to redirect the user to the OAuth2 Authorization Server.
   *
   * @param redirectURL
   *          the URL where the user will be redirected after the OAuth2 process
   */
  String buildAuthorizationURL(String redirectURL);

  /**
   * Gets the access token from the OAuth2 Server using the authorization code.
   *
   * @param req
   *          the {@link HttpServletRequest} which contains the the authorization code used to get
   *          access token response.
   * @param redirectURL
   *          the URL where the user will be redirected after the OAuth2 process
   *
   * @return the {@link AccessTokenResponse}, or <code>null</code> if not available
   */
  Optional<AccessTokenResponse> getAccessToken(HttpServletRequest req, String redirectURL);

  /**
   * Returns the unique provider name used by this communicator that identifies the OAuth2 Server.
   */
  String getProviderName();

  /**
   * Queries the unique (on the OAuth2 Server side) user identifier from OAuth2 Authorization
   * Server.
   *
   * @param accessTokenResponse
   *          the access token response that can be used to query the information
   *
   * @return the user ID, or <code>null</code> if not available
   */
  Optional<String> getUniqueUserId(AccessTokenResponse accessTokenResponse);

}
