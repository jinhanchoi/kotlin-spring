package me.jinhan.infra

import me.jinhan.entity.Person
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository


@Repository
interface PersonRepository : CrudRepository<Person, Int>