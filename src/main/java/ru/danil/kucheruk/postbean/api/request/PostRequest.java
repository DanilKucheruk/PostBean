package ru.danil.kucheruk.postbean.api.request;

import lombok.Data;

@Data
public class PostRequest {
    private String data;
    private long expirationTimeSeconds;
    private Status status;
}
