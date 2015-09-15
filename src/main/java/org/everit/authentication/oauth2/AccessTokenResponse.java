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
 * Interface to get information from the OAuth2 access token reponse.
 */
public interface AccessTokenResponse {

  /**
   * Returns the access token provided by the OAuth2 server.
   */
  String getAccessToken();

  /**
   * Returns the the type of the token.
   */
  String getAccessTokenType();

  /**
   * Returns the access token expiration time in seconds. Recommended in RFC6749.
   */
  Long getExpiresIn();

  /**
   * Returns the refresh token used to obtain new access token. Optional in RFC6749.
   */
  String getRefreshToken();

  /**
   * Returns the scope. See OAuth2 server and RFC6749.
   */
  String getScope();

}
