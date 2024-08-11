package com.n1nt3nd0.springreactwebsocketchatapp.model;

import com.fasterxml.jackson.annotation.JsonInclude;

import java.util.UUID;

@JsonInclude(JsonInclude.Include.NON_NULL)
public record UserResponse(UUID id, String username, String email) {}
