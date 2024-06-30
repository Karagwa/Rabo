package org.encode.rabo.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Getter
@Setter
@Document
public class WishList {
    @Id
    private String giftListId;
    @DBRef
    private String userId;
    private String occasion;
    private List<String> gifts;

}
