package main

import (
	"fmt"
)

func main() {

	var name string
	var age byte
	var sal float32
	var pass bool

	// fmt.scanln
	//fmt.Println("请输入姓名 ")
	//fmt.Scanln(&name)
	//fmt.Println("请输入年龄 ")
	//fmt.Scanln(&age)
	//fmt.Println("请输入薪水 ")
	//fmt.Scanln(&sal)
	//fmt.Println("请输入是否通过 ")
	//fmt.Scanln(&pass)

	// fmt.Scanf ,可以按照指定格式输入
	fmt.Println("请输入姓名,年龄,薪水,是否通过,使用空格隔开")
	fmt.Scanf("%s %d %f %t", &name, &age, &sal, &pass)

	fmt.Printf("名字是 %v \n年龄是 %v \n薪水是 %v \n是否通过 %v \n", name, age, sal, pass)

}
