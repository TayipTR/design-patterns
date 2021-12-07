package main

type hero struct {
	name         string
	agility      int
	strength     int
	intelligence int
}

func (h *hero) setName(name string) {
	h.name = name
}

func (h *hero) getName() string {
	return h.name
}

func (h *hero) setAgility(agility int) {
	h.agility = agility
}

func (h *hero) getAgility() int {
	return h.agility
}

func (h *hero) setStrength(strength int) {
	h.strength = strength
}

func (h *hero) getStrength() int {
	return h.strength
}

func (h *hero) setIntelligence(intelligence int) {
	h.intelligence = intelligence
}

func (h *hero) getIntelligence() int {
	return h.intelligence
}
