package cigi.inheritance.mapping.model.vehicle;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

//The table per class strategy is similar to the mapped superclass strategy. The main difference is that the superclass
// is now also an entity. Each of the concrete classes gets still mapped to its own database table. This mapping allows
// you to use polymorphic queries and to define relationships to the superclass. But the table structure adds a lot of
// complexity to polymorphic queries, and you should, therefore, avoid them.
// GenerationType.IDENTITY can not be used, because id is shared along to parent and child classes
@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
@Data
@NoArgsConstructor
@AllArgsConstructor
public abstract class Vehicle {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String manufacturer;
}
