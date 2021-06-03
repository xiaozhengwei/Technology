package main

import "fmt"


const pi =3.1415926
const (
	STATUSOK=200
	NOTFONUD=404
)

const (
	a=100
	b=iota
	c=iota
)

func main()  {
	pi :=3.1415
	fmt.Println(pi)


	fmt.Println(a)
	fmt.Println(b)
	fmt.Println(c)
	fmt.Println(STATUSOK)
	fmt.Println(NOTFONUD)

}
