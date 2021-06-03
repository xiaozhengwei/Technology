package main

import "fmt"

func main() {


	var age int
	fmt.Scanln(&age)

	// 自带break
	switch age {
	case 10,11,12:
		age=15
		fmt.Println("10,11,12")
	case 13,14,15:
		fmt.Println("13,14,15")
	default:
		fmt.Println("???")

	}

}
