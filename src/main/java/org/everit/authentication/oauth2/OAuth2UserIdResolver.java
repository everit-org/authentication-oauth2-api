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

/**
 * The OAuth2 User ID Resolver to obtain an unique identifier from OAuth2 server.
 */
public interface OAuth2UserIdResolver {

  /**
   * Gets (obtain) userID from OAuth2 server which already unique in client login.
   *
   * @param tokenType
   *          the type of the token.
   * @param accessToken
   *          the access token from OAuth2 server.
   * @param accessTokenExpiresIn
   *          Recommended in RFC6749. The access token expires time in seconds.
   * @param refreshToken
   *          Optional in RFC6749. The refresh token, which can be used to obtain new access token.
   * @param scope
   *          the scope. See OAuth2 server and RFC6749.
   * @return the unique user ID.
   */
  String getUniqueUserId(String tokenType, String accessToken, Long accessTokenExpiresIn,
      String refreshToken, String scope);
}
