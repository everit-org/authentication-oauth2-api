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
 * A successful OAuth2 Access Token Response.
 */
public interface AccessTokenResponse {

  /**
   * Returns the access token issued by the authorization server.
   */
  String getAccessToken();

  /**
   * Returns the the type of the token.
   */
  String getAccessTokenType();

  /**
   * Returns the lifetime in seconds of the access token. Recommended in RFC6749.
   */
  Long getExpiresIn();

  /**
   * Returns the refresh token, which can be used to obtain new access tokens using the same
   * authorization grant. Optional in RFC6749.
   */
  String getRefreshToken();

  /**
   * Returns the scope of the access token. Optional in RFC6749.
   */
  String getScope();

}
