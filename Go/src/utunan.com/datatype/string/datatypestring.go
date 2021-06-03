package main

import (
	"fmt"
	"strings"
)

func main() {

	//字符串
	s := "Hello"

	// 单独的字母，汉字，符号表示一个字符
	c1 := 'h'
	c2 := '1'
	c3 := '沙'

	// 字节：1字节=8Bit（8个二进制位）
	// 一个字符 'A'=1个字节
	// 一个中文 '啊'=3个字节
	fmt.Printf(s, c1, c2, c3)

	path := "'D:\\Go\\GoGo\\GoGoGo'"
	fmt.Println(path)

	s2 := `
	你好呀
	我很好
    `
	fmt.Println(s2)

	name :="最强大的国家"
	world :="中国"

	//求长度
	fmt.Println(len(name))

	//拼接
	ss :=name+world
	fmt.Println(ss)
	ss1:=fmt.Sprintf("%s%s",name,world)
	fmt.Println(ss1)

	//分隔
	ret:=strings.Split(path,"\\")
	fmt.Println(ret)

	//包含
	fmt.Println(strings.Contains(name,"国家"))
	fmt.Println(strings.Contains(name,"中国"))

	//前缀
	fmt.Println(strings.HasPrefix(name,"最"))
	fmt.Println(strings.HasPrefix(name,"家"))
	//后缀
	fmt.Println(strings.HasSuffix(name,"最"))
	fmt.Println(strings.HasSuffix(name,"家"))


}
