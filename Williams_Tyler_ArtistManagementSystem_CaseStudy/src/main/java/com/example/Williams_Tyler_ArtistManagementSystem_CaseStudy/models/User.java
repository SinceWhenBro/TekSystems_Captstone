package com.example.Williams_Tyler_ArtistManagementSystem_CaseStudy.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Collection;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
//Need help creating two unique constraints
@Table(uniqueConstraints = { @UniqueConstraint(name = "UniqueEmailAndUsername", columnNames = { "email", "username" }) })
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name="first_name")
    private String firstName;
    @Column(name="last_name")
    private String lastName;
    @Column
    private String username;

    private String email;

    private String password;

    //Retrieves roles whenever we retrieve user
    //Many to many relationship (users can have multiple roles & the same role can be assigned to multiple users)
    //Methods cascade from Parent (user) to Child (role)
    @ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinTable(
            name="users_roles",
            joinColumns = @JoinColumn(
                    name ="user_id", referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(
                    name ="role_id", referencedColumnName = "id")
    )
    private Collection<Role> roles;

//    public <T> User(String firstName, String lastName, String username, String email, String password, List<T> roles) {
//    }
//    public User(String email, String password, String username, Collection<Role> roles){
//        this.email = email;
//        this.password = password;
//        this.username = username;
//        this.roles = roles;
//    }
//
//    public User(Long userId, String firstName, String lastName, String username, String email, String password ){
//        this.id = userId;
//        this.firstName = firstName;
//        this.lastName = lastName;
//        this.username = username;
//        this.email = email;
//        this.password = password;
//
//    }
}
