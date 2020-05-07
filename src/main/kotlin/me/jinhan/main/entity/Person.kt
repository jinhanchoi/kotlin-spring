package me.jinhan.main.entity

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id


@Entity
class Person(
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    var id : Int? = null, var name : String, var age : Int) {

    fun howOldAreYou() : Int{
        return this.age
    }
}