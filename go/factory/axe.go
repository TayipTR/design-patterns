package main

type axe struct {
	hero
}

func newAxe() iHero {
	return &axe{
		hero: hero{
			name:         "Axe",
			agility:      7,
			strength:     12,
			intelligence: 2,
		},
	}
}
