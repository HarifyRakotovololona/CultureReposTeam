package com.culture.API.Models.MongodbEntity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;


@Document(collection="Notification");
public class Notification {
    @Id
    private String id;

    @Field("name")
    private String name;

}
