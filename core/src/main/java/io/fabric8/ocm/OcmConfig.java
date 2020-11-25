package io.fabric8.ocm;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import io.sundr.builder.annotations.Buildable;
import static io.fabric8.ocm.Serializer.Kind.JSON;

import java.io.File;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true, allowGetters = true, allowSetters = true)
@Buildable(editableEnabled = false, validationEnabled = false, generateBuilderPackage = true, builderPackage = "io.fabric8.ocm.builder")
public class OcmConfig implements Config, OpenIDConfg {

    public static final String OCM_FILE = System.getProperty("user.home") + File.separator + ".ocm.json";

    @JsonProperty("access_token")
    private final String accessToken;
    @JsonProperty("client_id")
    private final String clientId;
    @JsonProperty("client_secret")
    private final String clientSecret;
    @JsonProperty("insecure")
    private final boolean insecure;
    @JsonProperty("user")
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

    @JsonCreator(mode = JsonCreator.Mode.PROPERTIES)
    public OcmConfig(@JsonProperty("access_token")String accessToken, @JsonProperty("client_id")String clientId, @JsonProperty("client_secret")String clientSecret, @JsonProperty("insecure")boolean insecure, @JsonProperty("user") String user,
                     @JsonProperty("password")String password, @JsonProperty("refresh_token") String refreshToken, @JsonProperty("scopes")String[] scopes, @JsonProperty("token_url") String tokenUrl, @JsonProperty("url") String url) {
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

    public static OcmConfig getConfig() {
        return Serializers.getSerializer(JSON)
            .map(s -> s.read(new File(OCM_FILE), OcmConfig.class))
            .orElseThrow(() -> Serializers.noSerializerFound(JSON));
    }
}
