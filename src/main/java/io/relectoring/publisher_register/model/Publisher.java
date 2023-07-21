package io.relectoring.publisher_register.model;

import lombok.AllArgsConstructor; // constructor with all argument
import lombok.Data;  // getter , setter, or toString
import lombok.NoArgsConstructor; // constructor with no argument
import lombok.ToString; // convert variables to string

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Document(collection =  "Publisher")
public class Publisher {
    @Id
    private String id;
    private String name;
    private String email;
    private String published;
}
