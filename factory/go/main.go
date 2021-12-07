package main

import "fmt"

func main() {
	spiner, _ := getHero("Sniper")
	axe, _ := getHero("Axe")
	_, err := getHero("Axerr")

	printHeroDetails(spiner)
	fmt.Println("--------------------")
	printHeroDetails(axe)

	fmt.Println("--------------------")
	if err != nil {
		fmt.Println(err.Error())
	}

}

func printHeroDetails(hero iHero) {
	fmt.Println("Hero, ", hero.getName())
	fmt.Println("agility,  ", hero.getAgility())
	fmt.Println("strength,  ", hero.getStrength())
	fmt.Println("intelligence,  ", hero.getIntelligence())
}
