package main

import (
	"fmt"

)
// Go语言中变量声明必须使用，不使用编译不过去（局部变量）

var (
	name string // ""
	age  int    // 0asda
	isOK bool   // false
)

func main() {

	name = "理想"
	age = 12
	isOK = true

	// Go语言中变量声明必须使用，不使用编译不过去（局部变量）
	var num = 12

	// 声明并初始化变量
	str := "你好呀"

	fmt.Println(num)
	fmt.Println(str)
	fmt.Printf("name:%s\n", name)
	fmt.Println(age)
	fmt.Print(isOK)
}
