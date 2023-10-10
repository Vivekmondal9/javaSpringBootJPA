package com.vivek.springboot.learnjpaandhibernet.course;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Course {
    @Id
    private long id;

//    @Column(name = "name") If the column name and the entity name is different then we need to use this.
    private String name;

//    @Column(name = "author") // Though bot the column and entity name is same , so we don't need to use this.
    private  String author;

//    public Course(){
//
//    }
//    public Course(long id,String name, String author){
//        super();
//        this.id=id;
//        this.name=name;
//        this.author=author;
//    }
//    public long getId() {
//        return id;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public String getAuthor() {
//        return author;
//    }

    @Override
    public String toString(){
        return "Course [id= "+id+", name= "+name+", author="+author+" ]";
    }
}
