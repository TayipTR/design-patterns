package main

type sniper struct {
	hero
}

func newSniper() iHero {
	return &sniper{
		hero: hero{
			name:         "Sniper",
			agility:      10,
			strength:     12,
			intelligence: 5,
		},
	}
}
