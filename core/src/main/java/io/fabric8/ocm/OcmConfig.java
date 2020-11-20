package io.fabric8.ocm;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import io.sundr.builder.annotations.Buildable;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true, allowGetters = true, allowSetters = true)
@Buildable(editableEnabled = false, validationEnabled = false, generateBuilderPackage = true, builderPackage = "io.fabric8.ocm.builder")
public class OcmConfig {

	// AccessToken  string   `json:"access_token,omitempty" doc:"Bearer access token."`
	// ClientID     string   `json:"client_id,omitempty" doc:"OpenID client identifier."`
	// ClientSecret string   `json:"client_secret,omitempty" doc:"OpenID client secret."`
	// Insecure     bool     `json:"insecure,omitempty" doc:"Enables insecure communication with the server. This disables verification of TLS certificates and host names."`
	// Password     string   `json:"password,omitempty" doc:"User password."`
	// RefreshToken string   `json:"refresh_token,omitempty" doc:"Offline or refresh token."`
	// Scopes       []string `json:"scopes,omitempty" doc:"OpenID scope. If this option is used it will replace completely the default scopes. Can be repeated multiple times to specify multiple scopes."`
	// TokenURL     string   `json:"token_url,omitempty" doc:"OpenID token URL."`
	// URL          string   `json:"url,omitempty" doc:"URL of the API gateway. The value can be the complete URL or an alias. The valid aliases are 'production', 'staging' and 'integration'."`
	// User         string   `json:"user,omitempty" doc:"User name."`
    
  @JsonProperty("access_token")
  private final String accessToken;
  @JsonProperty("client_id")
  private final String clientId;
  @JsonProperty("client_secret")
  private final String clientSecret;
  @JsonProperty("insecure")
  private final boolean insecure;
  @JsonProperty("url")
  private final String user;
  @JsonProperty("password")
  private final String password;
  @JsonProperty("refresh_token")
  private final String refreshToken;
  @JsonProperty("scopes")
  private final String[] scopes;
  @JsonProperty("token_url")
  private final String tokenUrl;
  @JsonProperty("url")
  private final String url;


  public OcmConfig(String accessToken, String clientId, String clientSecret, boolean insecure, String user,
      String password, String refreshToken, String[] scopes, String tokenUrl, String url) {
    this.accessToken = accessToken;
    this.clientId = clientId;
    this.clientSecret = clientSecret;
    this.insecure = insecure;
    this.user = user;
    this.password = password;
    this.refreshToken = refreshToken;
    this.scopes = scopes;
    this.tokenUrl = tokenUrl;
    this.url = url;
  }

  public String getAccessToken() {
    return accessToken;
  }

  public String getClientId() {
    return clientId;
  }

  public String getClientSecret() {
    return clientSecret;
  }

  public boolean isInsecure() {
    return insecure;
  }

  public String getUser() {
    return user;
  }

  public String getPassword() {
    return password;
  }

  public String getRefreshToken() {
    return refreshToken;
  }

  public String[] getScopes() {
    return scopes;
  }

  public String getTokenUrl() {
    return tokenUrl;
  }

  public String getUrl() {
    return url;
  }
}
