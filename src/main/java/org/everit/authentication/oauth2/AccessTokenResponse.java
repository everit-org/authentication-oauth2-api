package org.everit.authentication.oauth2;

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
