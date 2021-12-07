package main

import "fmt"

func getHero(heroType string) (iHero, error) {
	if heroType == "Sniper" {
		return newSniper(), nil
	} else if heroType == "Axe" {
		return newAxe(), nil
	}
	return nil, fmt.Errorf("Hero not found")
}
