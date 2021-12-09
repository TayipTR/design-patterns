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
	fmt.Println(hero.getName())
	fmt.Println("agi : ", hero.getAgility())
	fmt.Println("str : ", hero.getStrength())
	fmt.Println("int : ", hero.getIntelligence())
}
