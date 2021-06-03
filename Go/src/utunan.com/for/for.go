package main

import (
	"fmt"
)

// Go语言中没有while do...while

func main() {

	for i := 1; i <= 10; i++ {
		fmt.Println(i)
	}

	j := 0

	for j < 12 {
		j++
		fmt.Println(j)
	}

	// 死循环
	//for{
	//	fmt.Println("Hello")
	//}
	k := 1
	for {
		if k <= 10 {
			k++
			fmt.Println(k)
		} else {
			break
		}
	}

	//str := "Hello,World"
	str := "Hello,World,你好，世界"

	//// 有中文 会乱码
	//for i := 0; i < len(str); i++ {
	//	fmt.Printf("%c\n", str[i])
	//}


	str2:=[]rune(str);
	for i := 0; i < len(str2); i++ {
		fmt.Printf("%c\n", str2[i])
	}

	for index, val := range str {
		fmt.Printf("index=%d,val=%c\n ", index, val)
	}

	//for i:=0;i<4;i++{
	//	liable:
	//		for j:=0;j<10;j++{
	//			if j==2{
	//				break liable
	//			}
	//		}
	//}
}
