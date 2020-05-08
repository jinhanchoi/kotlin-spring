package me.jinhan.entity

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id


@Entity
class Person(
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    var id : Int? = null, var name : String, var age : Int) {

    constructor() : this(0,"",0)

    fun howOldAreYou() : Int{
        return this.age
    }
}