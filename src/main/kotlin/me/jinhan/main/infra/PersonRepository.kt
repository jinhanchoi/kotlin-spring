package me.jinhan.main.infra

import me.jinhan.main.entity.Person
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository


@Repository
interface PersonRepository : CrudRepository<Person, Int>