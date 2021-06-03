package main

import "fmt"

// 整形
func main() {
	var i1 = 101
	//八进制
	i2 := 077
	//十六进制
	i3 := 0x0202020202
	// 十进制
	fmt.Printf("%d\n", i1)
	fmt.Printf("%b\n", i1) // 十进制-》二进制
	fmt.Printf("%o\n", i1) // 十进制-》八进制
	fmt.Printf("%x\n", i1) // 十进制-》十六进制

	fmt.Printf("%d\n", i2)
	fmt.Printf("%d\n", i3)

	// 查看变量类型
	fmt.Printf("%T\n", i3)

	i4 := int8(9)
	// 查看变量类型0 
	fmt.Printf("%T\n", i4)
}
