package main

import (
	"fmt"
)

func main()  {
  num1:=crazy("你好")
  num2,num3:=happy("你好呀")
  fmt.Println(num1,num2,num3)
  floatnum:=float32(21)
  fmt.Println(floatnum)
}


func happy(s string) (int,int) {
	fmt.Println(s)
	return 0 ,1
}

func crazy(s string) int {
	fmt.Println(s)
	return 0
}