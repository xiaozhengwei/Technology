package main

import "fmt"

func main() {

	//if age:=20;age>18{
	//	fmt.Printf("年龄大于18 %v",age)
	//}



	var age int
	_, _ = fmt.Scanln(&age)

	if temp:=age;temp>18{
		fmt.Printf("年龄大于18 %v",temp)
	}

	if age>18 {
		fmt.Printf("年龄大于18 %v",age)
	}else if age==18{
		fmt.Printf("你好呀 %v",age)
	}else {
		fmt.Printf("未成年呀")
	}
}
