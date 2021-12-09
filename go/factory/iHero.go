package main

type iHero interface {
	setName(name string)
	getName() string

	setAgility(agility int)
	getAgility() int

	setStrength(strength int)
	getStrength() int

	setIntelligence(intelligence int)
	getIntelligence() int
}
