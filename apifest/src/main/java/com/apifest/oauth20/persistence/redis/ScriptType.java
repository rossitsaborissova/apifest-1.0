package com.apifest.oauth20.persistence.redis;

public enum ScriptType {
    STORE_CLIENT_CREDENTIALS,
    STORE_SCOPE,
    FIND_SCOPE,
    GET_ALL_SCOPES,
    DEL_SCOPE,
    GET_ALL_APPS,
    GET_CLIENT_CREDENTIALS,
    UPDATE_APPLICATION,
    STORE_ACCESS_TOKEN,
    FIND_ACCESS_TOKEN,
    STORE_AUTH_CODE,
    UPDATE_AUTH_CODE_STATUS,
    ACCESS_TOKEN_BY_REFRESH_TOKEN,
    UPDATE_ACCESS_TOKEN_STATUS,
    FIND_AUTH_CODE,
    GET_AT_BY_USER_AND_APP,
    DEL_TOKEN,
    DEL_ALL_AT_BY_USER
}