package org.encode.rabo.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@Setter
@Document
public class Gift {
    @Id
    private String giftId;
    private String name;
    private String description;
    @DBRef
    private String userId;
}
