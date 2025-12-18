package com.namsor.sdk2.invoke.auth;

import com.namsor.sdk2.invoke.Pair;

import java.util.List;
import java.util.Map;

public class HttpBearerAuth implements Authentication {

    private String bearerToken;

    public HttpBearerAuth() {
    }

    public void setBearerToken(String bearerToken) {
        this.bearerToken = bearerToken;
    }

    public String getBearerToken() {
        return bearerToken;
    }

    @Override
    public void applyToParams(
            List<Pair> queryParams,
            Map<String, String> headerParams) {

        if (bearerToken == null || bearerToken.isEmpty()) {
            return;
        }
        headerParams.put("Authorization", "Bearer " + bearerToken);
    }
}
