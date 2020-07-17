package com.frankmoley.lil.learningspring.data.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "ROOM")
public class Room {
    @Id
    @Column(name = "ROOM_ID")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long roomId;
    @Column(name = "NAME")
    private String roomName;
    @Column(name = "ROOM_NUMBER")
    private String roomNumber;
    @Column(name = "BED_INFO")
    private String bedInfo;

}
